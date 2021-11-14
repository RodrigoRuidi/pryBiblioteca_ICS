package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadLibro;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsLibro extends EntidadLibro {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;
    ArrayList<String> sentencias = new ArrayList<String>();

    public clsLibro() {
        objC = new clsConexion();
    }

    public EntidadLibro consultarLibro() throws Exception {
        try {

            EntidadLibro objEL = null;

            SQL = "select * from libro where isbn = '" + super.getIsbn() + "'";
            rs = objC.consultarBD(SQL);

            if (rs.next()) {

                objEL = new EntidadLibro();

                objEL.setIsbn(rs.getString(1));
                objEL.setTitulo(rs.getString(2));
                objEL.setFechapub(rs.getInt(3));
                objEL.setEdicion(rs.getInt(4));
                objEL.setCodigoedi(rs.getInt(5));
                objEL.setCodigoare(rs.getInt(6));
            }

            return objEL;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean validarLibro() throws Exception {
        try {
            SQL = "select * from libro where isbn = '" + super.getIsbn() + "'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return false;
    }

    public Boolean insertarLibro() throws Exception {

        try {
            SQL = "insert into libro(isbn, titulo, fechapub, edicion, codigoedi, codigoare, numejemplar) values ('" + super.getIsbn() + "', '" + super.getTitulo() + "', " + super.getFechapub() + ", " + super.getEdicion() + ", " + super.getCodigoedi() + ", " + super.getCodigoare() + ", " + super.getNumejemplar() + ")";
            sentencias.add(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
    
    public Boolean insertarAutoria(String isbn, int codigoaut) throws Exception {
        try {
            sentencias.add("insert into autoria(isbn,codigoaut) values('" + isbn + "', " + codigoaut + ")");
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public void insertar() throws Exception{
        try {
            objC.ejecutarBDTransacciones(sentencias);
            sentencias.clear();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean modificar() throws Exception {
        try {
            SQL = "update libro set titulo = '" + super.getTitulo() + "', fechapub = " + super.getFechapub() + ", edicion = " + super.getEdicion() + ", codigoedi = " + super.getCodigoedi() + ", codigoare = " + super.getCodigoare() + ", numejemplar = " + super.getNumejemplar() + " where isbn = '" + super.getIsbn() + "'";
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean eliminar() throws Exception {
        try {
            SQL = "delete from libro where isbn = '" + super.getIsbn() + "'";
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listarPA(JTable tblListado) throws Exception {
        try {
            //select isbn, titulo, fechapub, edicion, editorial.nombre, area.nombre  from libro inner join editorial on editorial.codigoedi = libro.codigoedi inner join area on area.codigoare = libro.codigoarea order by 1 asc, 2 asc
            SQL = "select * from pa_listarlibros()";
            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("ISBN");
            modelo.addColumn("TITULO");
            modelo.addColumn("FECHA");
            modelo.addColumn("EDICION");
            modelo.addColumn("N° EJEMPLARES");
            modelo.addColumn("EDITORIAL");
            modelo.addColumn("AREA");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[7];

                for (int i = 0; i < 7; i++) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getInt(3);
                    datos[3] = rs.getInt(4);
                    datos[4] = rs.getInt(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public void listarPAxEditorial(JTable tblListado, int codigoE) throws Exception {
        try {
            //select isbn, titulo, fechapub, edicion, editorial.nombre, area.nombre  from libro inner join editorial on editorial.codigoedi = libro.codigoedi inner join area on area.codigoare = libro.codigoarea order by 1 asc, 2 asc
            SQL = "select * from pa_listarLibrosPorEditorial(" + codigoE + ")" ;
            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("ISBN");
            modelo.addColumn("TITULO");
            modelo.addColumn("FECHA");
            modelo.addColumn("EDICION");
            modelo.addColumn("N° EJEMPLARES");
            modelo.addColumn("EDITORIAL");
            modelo.addColumn("AREA");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[7];

                for (int i = 0; i < 7; i++) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getInt(3);
                    datos[3] = rs.getInt(4);
                    datos[4] = rs.getInt(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public void listarPAxAmbos(JTable tblListado, int codigoE, int codigoA) throws Exception {
        try {
            //select isbn, titulo, fechapub, edicion, editorial.nombre, area.nombre  from libro inner join editorial on editorial.codigoedi = libro.codigoedi inner join area on area.codigoare = libro.codigoarea order by 1 asc, 2 asc
            SQL = "select * from pa_listarLibrosPorEditorialPorArea(" + codigoE + ", " + codigoA + ")" ;
            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("ISBN");
            modelo.addColumn("TITULO");
            modelo.addColumn("FECHA");
            modelo.addColumn("EDICION");
            modelo.addColumn("N° EJEMPLARES");
            modelo.addColumn("EDITORIAL");
            modelo.addColumn("AREA");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[7];

                for (int i = 0; i < 7; i++) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getInt(3);
                    datos[3] = rs.getInt(4);
                    datos[4] = rs.getInt(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public int totalLibrosPA() throws Exception {
        try {
            SQL = "select fu_totallibros()";
            rs = objC.consultarBD_PA(SQL);
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;
        } catch (Exception e) {
            throw new Exception("Error al contar libros con PA ...");
        } finally {
            rs.close();
        }
    }

}
