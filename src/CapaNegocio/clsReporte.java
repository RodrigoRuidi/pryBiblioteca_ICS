package CapaNegocio;

import CapaDatos.clsConexion;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Rodrigo Ruidias
 */
public class clsReporte {

    public String RUTA_REPORTES = "src\\Reportes\\";

    public JRViewer reporteInterno(String archivoReporte, Map<String, Object> parametros) throws Exception {
        try {
            clsConexion objConexion = new clsConexion();
            objConexion.conectarBD();            
            JasperPrint miReporte = JasperFillManager.fillReport(RUTA_REPORTES + archivoReporte, parametros, objConexion.getCon());
            JRViewer visorReporte = new JRViewer(miReporte);
            return visorReporte;
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
            throw new Exception("Error al generar reporte!");
        }
    }
}
