/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadAutor;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsAutor extends EntidadAutor {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;

    public clsAutor() {
        objC = new clsConexion();
    }

    public int generarCodigo() throws Exception {
        SQL = "select coalesce(max(codigoaut), 0) + 1 as codigo from autor";
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

    public EntidadAutor consultarAutor() throws Exception {
        try {
            EntidadAutor objEA = null;
            SQL = "select * from autor where codigoaut = " + super.getCodigoaut();
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                objEA = new EntidadAutor();

                objEA.setCodigoaut(rs.getInt(1));
                objEA.setNombre(rs.getString(2));
                objEA.setApellidos(rs.getString(3));
                objEA.setEstado(rs.getBoolean(4));
            }
            return objEA;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean insertar() throws Exception {
        try {

            SQL = "insert into autor(codigoaut, nombre, apellidos, estado) values (" + super.getCodigoaut() + ", '" + super.getNombre() + "', '" + super.getApellidos() + "', " + super.getEstado() + ")";
            objC.ejecutarBD(SQL);
            return true;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean modificar() throws Exception {
        try {

            SQL = "update autor set nombre = '" + super.getNombre() + "', apellidos = '" + super.getApellidos() + "', estado = " + super.getEstado() + " where codigoaut = " + super.getCodigoaut();
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean darBaja() throws Exception {
        try {
            SQL = "update autor set estado = false where codigoaut = " + super.getCodigoaut();
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listar(JTable tblListado) throws Exception {
        try {

            SQL = "select * from pa_listarAutor()";

            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("CODIGO");
            modelo.addColumn("AUTOR");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("VIGENCIA");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[4];

                for (int i = 0; i < 4; i++) {
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4).equalsIgnoreCase("t") ? "Vigente" : "No vigente";
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public ArrayList<EntidadAutor> llenarAutores() throws Exception {

        ArrayList<EntidadAutor> autores = new ArrayList<EntidadAutor>();

        try {

            SQL = "select * from autor where estado = true order by 2 asc, 3 asc";

            rs = objC.consultarBD(SQL);

            while (rs.next()) {
                EntidadAutor objEA = new EntidadAutor();
                objEA.setCodigoaut(rs.getInt(1));
                objEA.setNombre(rs.getString(2));
                objEA.setApellidos(rs.getString(3));
                objEA.setEstado(rs.getBoolean(4));

                autores.add(objEA);
            }

            return autores;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
