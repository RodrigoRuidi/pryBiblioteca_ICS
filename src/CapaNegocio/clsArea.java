/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadArea;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsArea extends EntidadArea {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;

    public clsArea() {
        objC = new clsConexion();
    }

    public int generarCodigo() throws Exception {
        SQL = "select coalesce(max(codigoare), 0) + 1 as codigo from area";
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

    public EntidadArea consultarArea() throws Exception {

        try {

            EntidadArea objEA = null;

            SQL = "select * from area where codigoare = " + super.getCodigoare();
            rs = objC.consultarBD(SQL);

            if (rs.next()) {

                objEA = new EntidadArea();

                objEA.setCodigoare(rs.getInt(1));
                objEA.setNombre(rs.getString(2));
                objEA.setVigencia(rs.getBoolean(3));

            }

            return objEA;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public Boolean insertar() throws Exception {
        try {
            SQL = "insert into area(codigoare, nombre, vigencia) values (" + super.getCodigoare() + ", '" + super.getNombre() + "', " + super.getVigencia() + ")";
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean modificar() throws Exception {
        try {
            SQL = "update area set nombre = '" + super.getNombre() + "', vigencia = " + super.getVigencia() + " where codigoare = " + super.getCodigoare();
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean darBaja() throws Exception {
        try {
            SQL = "update area set vigencia = false where codigoare = " + super.getCodigoare();
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void Listar(JTable tblListado) throws Exception {
        try {
            SQL = "select * from pa_listarArea()";
            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("CÓDIGO");
            modelo.addColumn("ÁREA");
            modelo.addColumn("VIGENCIA");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[3];

                for (int i = 0; i < 3; i++) {
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3).equalsIgnoreCase("t") ? "Vigente" : "No vigente";
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public ArrayList<EntidadArea> llenarCombo(Boolean soloVigentes) throws Exception {

        ArrayList<EntidadArea> areas = new ArrayList<EntidadArea>();

        try {

            SQL = "select * from area " + (soloVigentes ? "where vigencia = 'true' order by 2 asc, 3 asc" : ""); //Si solo quiere vigentes entonces concatena el where, si no, cadena en blanco

            rs = objC.consultarBD(SQL);

            while (rs.next()) {
                EntidadArea objEA = new EntidadArea();
                objEA.setCodigoare(rs.getInt(1));
                objEA.setNombre(rs.getString(2));
                objEA.setVigencia(rs.getBoolean(3));

                areas.add(objEA);
            }

            return areas;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
    
    public int verificarNombre(String nombre) throws Exception {
        try {
            int cantidad = 0;
            SQL = "select nombre from area";
            rs = objC.consultarBD(SQL);
            while (rs.next()) {
                String[] nuevo = rs.getString(1).split(" - ");
                if (rs.getString(1).equalsIgnoreCase(nombre) || nuevo[0].equalsIgnoreCase(nombre)) {
                    cantidad = cantidad + 1;
                }
            }
            return cantidad;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
}
