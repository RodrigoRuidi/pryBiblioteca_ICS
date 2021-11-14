package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadDevolucion;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsDevolucion extends EntidadDevolucion {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;
    ArrayList<String> sentencias = new ArrayList<String>();

    public clsDevolucion() {
        objC = new clsConexion();
    }

    public int generarCodigo() throws Exception {
        SQL = "select coalesce(max(codigodev), 0) + 1 as codigo from devolucion";
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

    public void insertarDevolucion(ArrayList<String> isbnes) throws Exception {
        try {
            SQL = "insert into devolucion values(" + super.getCodigodev() + ", '" + super.getFechadev() + "', " + super.getEstadopag() + ", " + super.getMontopag() + ", " + super.getCodigopre() + ")";
            sentencias.add(SQL);

            for (String isbn : isbnes) {
                sentencias.add("update libro set numejemplar = (numejemplar + 1) where isbn = '" + isbn + "'");
            }

            sentencias.add("update prestamo set estado = false, estadomora = false, estadomulta = false where codigopre = " + super.getCodigopre());
            sentencias.add("update detalle_prestamo set estadodev = true where codigopre = " + super.getCodigopre());

            objC.ejecutarBDTransacciones(sentencias);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
