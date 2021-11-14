package CapaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsConexion {

    private String driver, url, user, password;
    private Connection con;
    private Statement sent;
    private CallableStatement cs;
    public static String nombrebd;
    public static String contra;

    public clsConexion() {
        this.driver = "org.postgresql.Driver";
        this.url = "jdbc:postgresql://localhost:5432/" + nombrebd;
        this.user = "postgres";
        this.password = contra;
        this.con = null;
    }

    public void conectarBD() throws Exception {

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            throw new Exception("Error al conectar la BD");
        }

    }

    //Consultar estado de la conexion
    public boolean getEstado() throws SQLException {
        return this.con.isClosed();
    }

    //Desconectar de la BD
    public void desconectarBD() throws Exception {

        try {
            con.close();
        } catch (SQLException e) {
            throw new Exception("Error al desconectar de la BD");
        }

    }

    public ResultSet consultarBD(String strSQL) throws Exception {
        ResultSet rs = null;
        try {
            conectarBD();
            sent = con.createStatement();
            rs = sent.executeQuery(strSQL);
            return rs;
        } catch (Exception e) {
            throw new Exception("Error al ejecutar consulta...");
        } finally {
            if (con != null) {
                desconectarBD();
            }
        }
    }

    //Ejecutar inserta/elimina/modifica base de datos: INSERT, UPDATE y DELETE
    public void ejecutarBD(String strSQL) throws Exception {
        try {
            conectarBD();
            sent = con.createStatement();
            sent.executeUpdate(strSQL);
        } catch (Exception e) {
            throw new Exception("Error al ejecut ar consulta...");
        } finally {
            if (con != null) {
                desconectarBD();
            }
        }
    }

    public void ejecutarBDTransacciones(ArrayList arregloConsultas) throws Exception {
        try {
            conectarBD();
            con.setAutoCommit(false);
            sent = con.createStatement();
            for (Object consulta : arregloConsultas) {
                sent.executeUpdate(String.valueOf(consulta));
            }
            con.commit();
            con.setAutoCommit(true);
        } catch (Exception e) {
            con.rollback();
            throw new Exception(e.getMessage());
        } finally {
            if (con != null) {
                desconectarBD();
            }
        }
    }

    public ResultSet consultarBD_PA(String strSQL) throws Exception {
        ResultSet rs = null;
        try {
            conectarBD();
            cs = con.prepareCall(strSQL);
            rs = cs.executeQuery();
            return rs;
        } catch (Exception e) {
            throw new Exception("Error al ejecutar consulta con PA..." + " - " + e.getMessage() + " - " + "Consulta");
        } finally {
            if (con != null) {
                desconectarBD();
                //cs.close();
            }
        }
    }

    public void ejecutarBD_PA(String strSQL) throws Exception {
        try {
            conectarBD();
            cs = con.prepareCall(strSQL);
            cs.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al ejecutar consulta con PA..." + " - " + e.getMessage());
        } finally {
            if (con != null) {
                desconectarBD();
                //cs.close();
            }
        }
    }
    
    public Connection getCon(){
        return con;
    }

}
