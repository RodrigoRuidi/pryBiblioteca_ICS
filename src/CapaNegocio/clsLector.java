package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadLector;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsLector extends EntidadLector {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;
    ArrayList<String> sentencias = new ArrayList<String>();

    public clsLector() {
        objC = new clsConexion();
    }

    public EntidadLector consultarLector() throws Exception {
        try {
            EntidadLector lector = null;
            SQL = "select * from lector where dnilector = '" + super.getDnilector() + "'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                lector = new EntidadLector();
                lector.setDnilector(rs.getString(1));
                lector.setNombre(rs.getString(2));
                lector.setApellidos(rs.getString(3));
                lector.setFechanac(rs.getDate(4));
                lector.setVigencia(rs.getBoolean(5));
                lector.setTelefono(rs.getString(6));
                lector.setDireccion(rs.getString(7));
                lector.setSexo(rs.getString(8));
            }
            return lector;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public ArrayList<EntidadLector> llenarLectores() throws Exception {
        ArrayList<EntidadLector> lectores = new ArrayList<EntidadLector>();
        try {
            SQL = "select * from lector";
            rs = objC.consultarBD(SQL);
            while (rs.next()) {
                EntidadLector objEL = new EntidadLector();
                objEL.setDnilector(rs.getString(1));
                objEL.setNombre(rs.getString(2));
                objEL.setApellidos(rs.getString(3));
                objEL.setFechanac(rs.getDate(4));
                objEL.setVigencia(rs.getBoolean(5));
                objEL.setTelefono(rs.getString(6));
                objEL.setDireccion(rs.getString(7));
                objEL.setSexo(rs.getString(8));
                
                lectores.add(objEL);
            }
            return lectores;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean validarLector() throws Exception {
        try {
            SQL = "select * from lector where dnilector = '" + super.getDnilector() + "'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return false;
    }

    public void insertarLector() throws Exception {
        try {
            SQL = "insert into lector values('" + super.getDnilector() + "', '" + super.getNombre() + "', '" + super.getApellidos() + "', '" + super.getFechanac() + "', " + super.getVigencia() + ", '" + super.getTelefono() + "', '" + super.getDireccion() + "', '" + super.getSexo() + "')";
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarLector() throws Exception {
        try {
            SQL = "update lector set nombre = '" + super.getNombre() + "', apellidos = '" + super.getApellidos() + "', fechanac = '" + super.getFechanac() + "', vigencia = " + super.getVigencia() + ", telefono = '" + super.getTelefono() + "', direccion = '" + super.getDireccion() + "', sexo = '" + super.getSexo() + "' where dnilector = '" + super.getDnilector() + "'";
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    /*
    public void eliminarLector() throws Exception {
        try {
            SQL = "delete from lector where dnilector = '" + super.getDnilector() + "'";
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    */
    
        public void Eliminar(int codigopre, Boolean devolucion, ArrayList<String> isbns) throws Exception {

        try {
            sentencias.add("delete from detalle_prestamo where codigopre = " + codigopre);

            if (devolucion) {
                for (String i : isbns) {
                    sentencias.add("update libro set numejemplar = (numejemplar + 1) where isbn = '" + i + "'");
                }
            }

            sentencias.add("delete from prestamo where codigopre = '" + codigopre + "'");

        } catch (Exception e) {
            throw new Exception("Error en eliminar prestamo y su detalle");
        }

    }

    public void EliminarLector(String dni) throws Exception {
        try {
            sentencias.add("delete from lector where dnilector = '" + dni + "'");

            objC.ejecutarBDTransacciones(sentencias);
            sentencias.clear();
        } catch (Exception e) {
            throw new Exception("Error en eliminar lector");
        }
    }

    public void listarLector(JTable tblListado) throws Exception {
        try {
            SQL = "select * from pa_listarLector()";
            rs = objC.consultarBD_PA(SQL);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("FECHA NAC");
            modelo.addColumn("VIGENCIA");
            modelo.addColumn("TELÉFONO");
            modelo.addColumn("DIRECCIÓN");
            modelo.addColumn("SEXO");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[8];

                for (int i = 0; i < datos.length; i++) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getDate(4);
                    datos[4] = rs.getString(5).equalsIgnoreCase("t") ? "Vigente" : "No vigente";
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                    datos[7] = rs.getString(8).equalsIgnoreCase("M") ? "Masculino" : "Femenino";
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
