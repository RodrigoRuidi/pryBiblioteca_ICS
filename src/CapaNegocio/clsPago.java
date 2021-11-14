/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.clsConexion;
import CapaNegocio.Entidades.EntidadPago;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsPago extends EntidadPago {

    clsConexion objC;
    String SQL;
    ResultSet rs = null;

    public clsPago() {
        objC = new clsConexion();
    }

    public int generarNumeroPago() throws Exception {

        SQL = "select coalesce(max(numeropag), 0) + 1 as codigo from pago";
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

    public Boolean verificarPagos(int codigop) throws Exception {
        try {
            SQL = "select * from pago where codigopre = " + codigop;
            rs = objC.consultarBD(SQL);

            if (rs.next()) {
                return true;
            }

            return false;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public Boolean verificarPagosMora(int codigop) throws Exception {
        try {
            SQL = "select * from pago where codigopre = " + codigop + " and codigomot = 1";
            rs = objC.consultarBD(SQL);

            if (rs.next()) {
                return true;
            }

            return false;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void listarPagos(JTable tblListado, int codigop) throws Exception {
        try {
            SQL = "select numeropag, fechapag, montopag, p.descripcion, codigopre from pago as p inner join motivo_pago as mp on mp.codigomot = p.codigomot where mp.estado = true and codigopre = " + codigop;
            rs = objC.consultarBD(SQL);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("N°");
            modelo.addColumn("FECHA");
            modelo.addColumn("MONTO");
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("PRESTAMO");

            tblListado.setModel(modelo);

            while (rs.next()) {

                Object datos[] = new Object[5];

                for (int i = 0; i < datos.length; i++) {
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getDate(2);
                    datos[2] = rs.getDouble(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                }

                modelo.addRow(datos);

            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
