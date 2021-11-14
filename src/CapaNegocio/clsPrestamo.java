/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadPrestamo;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsPrestamo extends EntidadPrestamo {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;
    ArrayList<String> sentencias = new ArrayList<String>();
    private String mes;

    public clsPrestamo() {
        objC = new clsConexion();
    }

    public int generarCodigo() throws Exception {
        SQL = "select coalesce(max(codigopre), 0) + 1 as codigo from prestamo";
        try {
            rs = objC.consultarBD(SQL);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return 0;
    }

    public ArrayList<EntidadPrestamo> buscarPrestamo() throws Exception {
        try {
            ArrayList<EntidadPrestamo> prestamos = new ArrayList<EntidadPrestamo>();
            SQL = "select * from prestamo where dnilector = '" + super.getDnilector() + "'";
            rs = objC.consultarBD(SQL);
            while (rs.next()) {
                EntidadPrestamo objEP = new EntidadPrestamo();
                objEP.setCodigopre(rs.getInt(1));
                objEP.setFechapre(rs.getString(2));
                objEP.setEstado(rs.getBoolean(3));
                objEP.setEstadomora(rs.getBoolean(4));
                objEP.setEstadomulta(rs.getBoolean(5));
                objEP.setDnilector(rs.getString(6));
                prestamos.add(objEP);
            }
            return prestamos;
        } catch (Exception e) {
            throw new Exception("Error en buscar prestamo");
        }
    }

    public Boolean verificarDevolucion(int codigopre) throws Exception {
        try {
            SQL = "select * from detalle_prestamo where codigopre = " + codigopre + " and estadodev = false";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new Exception("Error en verificar devolucion");
        }
    }

    public long diasMorosos(int codigopre, String fecha) throws Exception {

        String fechad = fecha.replace("/", "-");
        String dia = fechad.substring(0, 2);
        String mes = fechad.substring(3, 5);
        String ano = fechad.substring(6, 10);
        String fechadev = ano + "-" + mes + "-" + dia;

        try {
            SQL = "select fechapre from prestamo where estadomora = true and codigopre = " + codigopre;
            rs = objC.consultarBD(SQL);
            if (rs.next()) {

                LocalDate fechaprestamo = LocalDate.parse(rs.getString(1), DateTimeFormatter.ISO_LOCAL_DATE);
                LocalDate fechadevolucion = LocalDate.parse(fechadev, DateTimeFormatter.ISO_LOCAL_DATE);

                long diferencia = ChronoUnit.DAYS.between(fechaprestamo, fechadevolucion);

                clsPago objPag = new clsPago();
                Boolean estadoPagoMora = objPag.verificarPagosMora(codigopre);

                long diasmora = 0;
                if (diferencia > 7 && !estadoPagoMora) {
                    diasmora = diferencia - 7;
                    return diasmora;
                }

            }
        } catch (Exception e) {
            throw new Exception("Error en dias morosos");
        }
        return 0;
    }

    public void verificarmora(JTable tblListado, String fechade) throws Exception {

        String fechad = fechade.replace("/", "-");
        String dia = fechad.substring(0, 2);
        String mes = fechad.substring(3, 5);
        String ano = fechad.substring(6, 10);
        String fechadev = ano + "-" + mes + "-" + dia;
        try {
            if (tblListado.getRowCount() > 0) {
                for (int i = 0; i < tblListado.getRowCount(); i++) {
                    String fechap = tblListado.getValueAt(i, 1).toString();

                    LocalDate fechaprestamo = LocalDate.parse(fechap, DateTimeFormatter.ISO_LOCAL_DATE);
                    LocalDate fechadevolucion = LocalDate.parse(fechadev, DateTimeFormatter.ISO_LOCAL_DATE);

                    long diferencia = ChronoUnit.DAYS.between(fechaprestamo, fechadevolucion);

                    clsPago objP = new clsPago();
                    Boolean estadoPagoMora = objP.verificarPagosMora(Integer.parseInt(tblListado.getValueAt(i, 0).toString()));

                    if (diferencia > 7 && !estadoPagoMora) {
                        SQL = "update prestamo set estadomora = true where codigopre = " + Integer.parseInt(tblListado.getValueAt(i, 0).toString());
                        objC.ejecutarBD(SQL);
                    }

                }
            }
        } catch (Exception e) {
            throw new Exception("Error en verificar mora");
        }
    }

    public ArrayList<String> prestamosvencidos() throws Exception {
        ArrayList<String> dnis = new ArrayList<String>();
        try {
            SQL = "select l.dnilector from prestamo as p inner join lector as l on l.dnilector = p.dnilector where p.estado = true and (current_date - p.fechapre) > 7 group by l.dnilector;";
            rs = objC.consultarBD(SQL);
            while (rs.next()) {
                dnis.add(rs.getString(1));
            }
            return dnis;
        } catch (Exception e) {
            throw new Exception("Error en prestamos vencidos");
        }
    }

    public ArrayList<String> buscarDetallePrestamo(int codigopre) throws Exception {
        try {
            ArrayList<String> isbns = new ArrayList<String>();
            SQL = "select isbn from detalle_prestamo where codigopre = " + codigopre;
            rs = objC.consultarBD(SQL);
            while (rs.next()) {
                isbns.add(rs.getString(1));
            }
            return isbns;
        } catch (Exception e) {
            throw new Exception("Error en buscar detalle de prestamo");
        }
    }

    public Boolean verificarMulta(int codigopre) throws Exception {
        try {
            SQL = "select * from prestamo where codigopre = " + codigopre + " and estadomulta = true;";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new Exception("Error en verificar multa");
        }
    }

    public void registrar(int cod, JTable tblListado) throws Exception {
        try {
            sentencias.add("insert into prestamo values(" + super.getCodigopre() + ",'" + super.getFechapre() + "',true,false,false,'" + super.getDnilector() + "')");
            for (int i = 0; i < tblListado.getRowCount(); i++) {
                sentencias.add("insert into detalle_prestamo values(" + cod + ",'" + tblListado.getValueAt(i, 0).toString() + "',false)");
                sentencias.add("update libro set numejemplar = (numejemplar-1) where isbn = '" + tblListado.getValueAt(i, 0).toString() + "'");
            }

            objC.ejecutarBDTransacciones(sentencias);
            sentencias.clear();

        } catch (Exception e) {
            throw new Exception("Error en registrar");
        }
    }

    public void listarPrestamos(JTable tblListado) throws Exception {
        try {
            SQL = "select p.codigopre, p.fechapre, p.estadomora, p.estadomulta, l.titulo, l.isbn from detalle_prestamo as dp inner join prestamo as p on p.codigopre = dp.codigopre inner join libro as l on l.isbn = dp.isbn where p.estado = true";
            rs = objC.consultarBD(SQL);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("CÓDIGO");
            modelo.addColumn("FECHA");
            modelo.addColumn("MORA");
            modelo.addColumn("MULTA");
            modelo.addColumn("LIBRO");
            modelo.addColumn("ISBN");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[6];

                for (int i = 0; i < datos.length; i++) {
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getDate(2);
                    datos[2] = rs.getString(3).equalsIgnoreCase("t") ? "Moroso" : "Sin mora";
                    datos[3] = rs.getString(4).equalsIgnoreCase("t") ? "Multado" : "Sin multa";
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listarPrestamosxCliente(JTable tblListado) throws Exception {
        try {
            SQL = "select p.codigopre, p.fechapre, p.estadomora, p.estadomulta, l.titulo, l.isbn from detalle_prestamo as dp inner join prestamo as p on p.codigopre = dp.codigopre inner join libro as l on l.isbn = dp.isbn where dp.estadodev = false and p.dnilector = '" + super.getDnilector() + "'";
            rs = objC.consultarBD(SQL);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("CÓDIGO");
            modelo.addColumn("FECHA PRESTAMO");
            modelo.addColumn("MORA");
            modelo.addColumn("MULTA");
            modelo.addColumn("LIBRO");
            modelo.addColumn("ISBN");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[6];

                for (int i = 0; i < datos.length; i++) {
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getDate(2);
                    datos[2] = rs.getString(3).equalsIgnoreCase("true") ? "Moroso" : "Sin mora";
                    datos[3] = rs.getString(4).equalsIgnoreCase("true") ? "Multado" : "Sin multa";
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public ArrayList<Integer> anosPrestamo() throws Exception {

        try {
            ArrayList<Integer> anos = new ArrayList<Integer>();
            SQL = "select (select extract(year from fechapre))::integer as ano from prestamo group by ano order by 1 desc";
            rs = objC.consultarBD(SQL);
            while(rs.next()){
                anos.add(rs.getInt(1));
            }
            return anos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    
    
    

}
