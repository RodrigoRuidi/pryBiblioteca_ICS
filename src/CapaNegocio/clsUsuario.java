package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadUsuario;
import java.sql.ResultSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsUsuario extends EntidadUsuario {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;

    public clsUsuario() {
        objC = new clsConexion();
    }

    /*
    AGREGAR EL NOMBRE DE USUARIO AL MENU PRINCIPAL CON LA HORA Y FECHA DEL SISTEMA
     */
    public String[] login() throws Exception {
        try {
            SQL = "select nombrecompleto, cargo from usuario where nombreusu = '" + super.getNombreusu() + "' and contrasena = MD5('" + super.getContrasena() + "')";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                String datos[] = new String[2];
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                return datos;
            }
            return null;
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "Error clase");
        }
    }

    public Boolean verificarNombreU() throws Exception {
        try {
            SQL = "select * from usuario where nombreusu = '" + super.getNombreusu() + "'";
            rs = objC.consultarBD(SQL);
            return rs.next();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public EntidadUsuario buscarUsuario() throws Exception {
        try {
            EntidadUsuario objEU = null;
            SQL = "select * from usuario where codigousu = " + super.getCodigousu();
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                objEU = new EntidadUsuario();
                objEU.setCodigousu(rs.getInt(1));
                objEU.setNombreusu(rs.getString(2));
                objEU.setNombrecompleto(rs.getString(4));
                objEU.setCargo(rs.getString(5));
                objEU.setEstado(rs.getBoolean(6));

                String pregunta = "";

                if (rs.getString(7).startsWith("¨")) {
                    pregunta = rs.getString(7).replace("¨", "¿");
                } else {
                    pregunta = "¿".concat(rs.getString(7));
                    if (!rs.getString(7).endsWith("?")) {
                        pregunta = pregunta.concat("?");
                    }
                }

                objEU.setPreguntasec(pregunta);
                objEU.setRespuesta(rs.getString(8));
            }
            return objEU;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public int generarCodigo() throws Exception{
        try {
            SQL = "select coalesce(max(codigousu), 0) + 1 from usuario";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return 0;
    }

    public void registarUsuario() throws Exception {
        try {
            SQL = "insert into usuario values((select coalesce(max(codigousu), 0) + 1 from usuario), '" + super.getNombreusu() + "', MD5('" + super.getContrasena() + "'), '" + super.getNombrecompleto() + "', '" + super.getCargo() + "', " + super.getEstado() + ", '" + super.getPreguntasec() + "', '" + super.getRespuesta() + "')";
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarUsuario() throws Exception {
        try {
            SQL = "update usuario set nombreusu = '" + super.getNombreusu() + "', nombrecompleto = '" + super.getNombrecompleto() + "', cargo = '" + super.getCargo() + "', estado = " + super.getEstado() + ", preguntasec = '" + super.getPreguntasec() + "', respuesta = '" + super.getRespuesta() + "' where codigousu = " + super.getCodigousu();
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void eliminarUsuario() throws Exception {
        try {
            SQL = "delete from usuario where codigousu = " + super.getCodigousu();
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public String obtenerPregunta() throws Exception {
        try {
            SQL = "select preguntasec from usuario where nombreusu = '" + super.getNombreusu() + "'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {

                String pregunta = "";

                if (rs.getString(1).startsWith("¨")) {
                    pregunta = rs.getString(1).replace("¨", "¿");
                } else {
                    pregunta = "¿".concat(rs.getString(1));
                    if (!rs.getString(1).endsWith("?")) {
                        pregunta = pregunta.concat("?");
                    }
                }

                return pregunta;
            }
            return "";
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean verificarPregunta() throws Exception {
        try {
            SQL = "select * from usuario where nombreusu = '" + super.getNombreusu() + "' and respuesta = '" + super.getRespuesta() + "'";
            rs = objC.consultarBD(SQL);
            return rs.next();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Boolean verificarUsuario() throws Exception {
        try {
            SQL = "select estado from usuario where nombreusu = '" + super.getNombreusu() + "'";
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                return rs.getBoolean(1);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return null;
    }

    public void darAltaUsuario() throws Exception {
        try {
            SQL = "update usuario set estado = true where nombreusu = '" + super.getNombreusu() + "'";
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarContra() throws Exception {
        try {
            SQL = "update usuario set contrasena = MD5('" + super.getContrasena() + "') where nombreusu = '" + super.getNombreusu() + "'";
            objC.ejecutarBD(SQL);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listarUsuarios(JTable tblListado) throws Exception {
        try {
            SQL = "select * from usuario";
            rs = objC.consultarBD(SQL);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("CÓDIGO");
            modelo.addColumn("USUARIO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("CARGO");
            modelo.addColumn("ESTADO");

            tblListado.setModel(modelo);

            while (rs.next()) {
                Object datos[] = new Object[modelo.getColumnCount()];

                for (int i = 0; i < datos.length; i++) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(4);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(6).equalsIgnoreCase("t") ? "Activo" : "No activo";
                }

                modelo.addRow(datos);
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
