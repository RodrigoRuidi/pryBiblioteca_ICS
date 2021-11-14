/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadMotivoPago;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsMotivoPago extends EntidadMotivoPago {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;
    ArrayList<String> sentencias = new ArrayList<String>();

    public clsMotivoPago() {
        objC = new clsConexion();
    }

    public int generarCodigoMotivo() throws Exception {

        SQL = "select coalesce(max(codigomot), 0) + 1 as codigo from motivo_pago";
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
    
    public EntidadMotivoPago buscarMotivoPago() throws Exception{
        try {
            EntidadMotivoPago objEM = null;
            SQL = "select * from motivo_pago where codigomot = " + super.getCodigomot();
            rs = objC.consultarBD(SQL);
            if (rs.next()) {
                objEM = new EntidadMotivoPago();
                objEM.setCodigomot(rs.getInt(1));
                objEM.setDescripcion(rs.getString(2));
                objEM.setEstado(rs.getBoolean(3));
            }
            return objEM;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void insertar(JTable tblListado, String motivo, int codigopre) throws Exception {
        try {
            for (int i = 0; i < tblListado.getRowCount(); i++) {
                sentencias.add("insert into pago values(" + Integer.parseInt(tblListado.getValueAt(i, 0).toString()) + ", '" + tblListado.getValueAt(i, 1).toString() + "', " + Double.parseDouble(tblListado.getValueAt(i, 2).toString()) + ", '" + tblListado.getValueAt(i, 3).toString() + "', " + Integer.parseInt(tblListado.getValueAt(i, 4).toString()) + ", " + Integer.parseInt(tblListado.getValueAt(i, 5).toString()) + ")");
            }
            if (motivo.equalsIgnoreCase("Mora")) {
                sentencias.add("update prestamo set estadomora = false where codigopre = " + codigopre);
            }
            objC.ejecutarBDTransacciones(sentencias);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public ArrayList<EntidadMotivoPago> listarMotivos() throws Exception{
        try {
            ArrayList<EntidadMotivoPago> motivos = new ArrayList<EntidadMotivoPago>();
            SQL = "select * from motivo_pago where codigomot > 1 order by 1 asc;";
            rs = objC.consultarBD(SQL);            
            while (rs.next()) {
                EntidadMotivoPago objMP = new EntidadMotivoPago();
                objMP.setCodigomot(rs.getInt(1));
                objMP.setDescripcion(rs.getString(2));
                objMP.setEstado(rs.getBoolean(3));
                motivos.add(objMP);
            }
            return motivos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
