/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadAutor;
import CapaNegocio.Entidades.EntidadAutoria;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsAutoria extends EntidadAutoria {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;

    public clsAutoria() {
        objC = new clsConexion();
    }

    public ArrayList<EntidadAutor> consultarAutoriasLibro() throws Exception {

        ArrayList<EntidadAutor> autores = new ArrayList<EntidadAutor>();

        try {
            SQL = "select autor.codigoaut, autor.nombre, autor.apellidos from autoria inner join autor on autor.codigoaut = autoria.codigoaut where isbn = '" + super.getIsbn() + "'";

            rs = objC.consultarBD(SQL);

            while (rs.next()) {
                EntidadAutor objEA = new EntidadAutor();
                objEA.setCodigoaut(rs.getInt(1));
                objEA.setNombre(rs.getString(2));
                objEA.setApellidos(rs.getString(3));
                System.out.println(objEA);
                autores.add(objEA);
            }
            return autores;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public Boolean insertarAutoria() throws Exception {
        try {

            SQL = "insert into autoria(isbn,codigoaut) values('" + super.getIsbn() + "', " + super.getCodigoaut() + ")";
            objC.ejecutarBD(SQL);
            return true;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean eliminarAutoria() throws Exception {
        try {
            SQL = "delete from autoria where isbn = '" + super.getIsbn() + "'";
            objC.ejecutarBD(SQL);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
