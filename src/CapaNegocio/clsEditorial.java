/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadEditorial;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
/**
 *
 * @author Rodrigo Ruidias
 */
public class clsEditorial extends EntidadEditorial {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;

    public clsEditorial() {
        objC = new clsConexion();
    }

    public int generarCodigo() throws Exception {
        SQL = "select coalesce(max(codigoedi), 0) + 1 as codigo from editorial";
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

    public EntidadEditorial consultarEditorial() throws Exception {
        try {

            EntidadEditorial objEA = null;

            SQL = "select * from editorial where codigoedi = " + super.getCodigoedi();
            rs = objC.consultarBD(SQL);

            if (rs.next()) {

                objEA = new EntidadEditorial();

                objEA.setCodigoedi(rs.getInt(1));
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
            SQL = "insert into editorial(codigoedi, nombre, vigencia) values (" + super.getCodigoedi() + ", '" + super.getNombre() + "', " + super.getVigencia() + ")";
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public Boolean modificar() throws Exception {
        try {
            SQL = "update editorial set nombre = '" + super.getNombre() + "', vigencia = " + super.getVigencia() + " where codigoedi = " + super.getCodigoedi();
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean darBaja() throws Exception {
        try {
            SQL = "update editorial set vigencia = false where codigoedi = " + super.getCodigoedi();
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listar(JTable tblListado) throws Exception {
        try {
            SQL = "select * from pa_listarEditorial()";
            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("CÓDIGO");
            modelo.addColumn("EDITORIAL");
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

    public ArrayList<EntidadEditorial> llenarCombo(Boolean soloVigentes) throws Exception {

        ArrayList<EntidadEditorial> editoriales = new ArrayList<EntidadEditorial>();

        try {

            SQL = "select * from editorial " + (soloVigentes ? "where vigencia = 'true' order by 2 asc, 3 asc" : ""); //Si solo quiere vigentes entonces concatena el where, si no, cadena en blanco

            rs = objC.consultarBD(SQL);

            while (rs.next()) {
                EntidadEditorial objEE = new EntidadEditorial();
                objEE.setCodigoedi(rs.getInt(1));
                objEE.setNombre(rs.getString(2));
                objEE.setVigencia(rs.getBoolean(3));
                editoriales.add(objEE);
            }

            return editoriales;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
