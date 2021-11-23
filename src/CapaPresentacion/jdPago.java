/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaNegocio.Entidades.EntidadMotivoPago;
import CapaNegocio.clsMotivoPago;
import CapaNegocio.clsPago;
import CapaNegocio.clsPrestamo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class jdPago extends javax.swing.JDialog {

    /**
     * Creates new form jdPago
     */
    public jdPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Operación pago de prestamo");
        setLocationRelativeTo(null);
        String dia, mes, ano;
        Calendar c = new GregorianCalendar();
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        ano = Integer.toString(c.get(Calendar.YEAR));
        txtFecha.setText(dia + '/' + mes + '/' + ano);
        modelo.addColumn("N°");
        modelo.addColumn("FECHA");
        modelo.addColumn("MONTO");
        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("CÓDIGO MOTIVO");
        modelo.addColumn("CÓDIGO PRESTAMO");
        limpiarP();
        deshabilitar();
        llenarComboMotivo();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/iconSystem.png")).getImage());
    }

    clsPago objPago = null;
    clsMotivoPago objMP = null;
    clsPrestamo objPrestamo = null;

    public static String codigoprestamo;
    public static int motivoP;
    public static Double monto;
    public static String descripcion;

    DefaultTableModel modelo = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cboMotivo = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagosMotivo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcionPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNPago = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        btnAgregarPago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(83, 109, 254));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(83, 109, 254), null));

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel11.setText("Motivo:");

        cboMotivo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cboMotivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnNuevo.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(83, 109, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(83, 109, 254), null));

        tblPagosMotivo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblPagosMotivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPagosMotivo.setSelectionBackground(new java.awt.Color(83, 109, 254));
        jScrollPane1.setViewportView(tblPagosMotivo);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Descripción:");

        txtDescripcionPago.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtDescripcionPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionPagoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("Monto:");

        txtMonto.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("N° pago:");

        txtNPago.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Código prestamo:");

        txtCodigoP.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnAgregarPago.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregarPago.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnAgregarPago.setText("Agregar pago");
        btnAgregarPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        btnAgregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcionPago)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNPago, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnAgregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescripcionPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPagoActionPerformed
        try {
            if (btnAgregarPago.getText().equalsIgnoreCase("Agregar pago")) {
                btnAgregarPago.setText("Guardar pago");
                objPago = new clsPago();
                txtNPago.setText(String.valueOf(objPago.generarNumeroPago()));
                verificarCodigoP();
                txtNPago.setEditable(false);
                habilitarPago();
            } else {
                if (txtMonto.getText().isEmpty() || txtDescripcionPago.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Rellene todos los campos");
                } else {
                    agregarP();
                    if (Integer.parseInt(tblPagosMotivo.getValueAt(0, 4).toString()) == 1) {
                        cboMotivo.setSelectedIndex(0);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarPagoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            if (btnNuevo.getText().equalsIgnoreCase("Nuevo")) {
                btnNuevo.setText("Guardar");
                objMP = new clsMotivoPago();
                habilitar();
            } else {
                registrarPagos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            jdDevolucion objDV = new jdDevolucion(null, true);
            txtCodigoP.setText(codigoprestamo);

            clsMotivoPago objMP = new clsMotivoPago();
            objMP.setCodigomot(motivoP);
            EntidadMotivoPago Entidadmotivo = objMP.buscarMotivoPago();
            cboMotivo.getModel().setSelectedItem(Entidadmotivo);

            txtMonto.setText(monto == null ? "" : String.valueOf(monto));
            txtDescripcionPago.setText(descripcion == null ? "" : descripcion);
        } catch (Exception ex) {
            Logger.getLogger(jdPago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtDescripcionPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionPagoKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_txtDescripcionPagoKeyTyped

    private void registrarPagos() {
        try {

            objMP = new clsMotivoPago();

            if (validarLlenado()) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos");
            } else {

                EntidadMotivoPago motivoPago = (EntidadMotivoPago) cboMotivo.getSelectedItem();

                objMP.insertar(tblPagosMotivo, motivoPago.getDescripcion(), Integer.parseInt(txtCodigoP.getText()));

                JOptionPane.showMessageDialog(this, "Pagos realizados correctamente");

                dispose();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void agregarP() {
        try {
            EntidadMotivoPago motivoPago = (EntidadMotivoPago) cboMotivo.getSelectedItem();
            tblPagosMotivo.setModel(modelo);
            String datos[] = new String[6];
            datos[0] = txtNPago.getText();
            datos[1] = txtFecha.getText();
            datos[2] = txtMonto.getText();
            datos[3] = txtDescripcionPago.getText();
            datos[4] = String.valueOf(motivoPago.getCodigomot());
            datos[5] = txtCodigoP.getText();
            modelo.addRow(datos);
            limpiarP();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void verificarCodigoP() {
        int codigo = 0;
        if (tblPagosMotivo.getRowCount() > 0) {
            for (int i = 0; i < tblPagosMotivo.getRowCount(); i++) {
                if (tblPagosMotivo.getValueAt(i, 0).toString().equalsIgnoreCase(txtNPago.getText())) {
                    codigo = Integer.parseInt(tblPagosMotivo.getValueAt(i, 0).toString()) + 1;
                    txtNPago.setText(String.valueOf(codigo));
                }
            }
        }
    }

    private void habilitar() {
        txtNPago.setEnabled(true);
        txtCodigoP.setEnabled(true);
        txtMonto.setEnabled(true);
        txtDescripcionPago.setEnabled(true);
        btnAgregarPago.setEnabled(true);

        if (motivoP == 1) {
            cboMotivo.setEnabled(false);
        } else {
            cboMotivo.setEnabled(true);
        }

    }

    private void deshabilitar() {
        cboMotivo.setEnabled(false);
        txtNPago.setEnabled(false);
        txtCodigoP.setEnabled(false);
        txtMonto.setEnabled(false);
        txtDescripcionPago.setEnabled(false);
        btnAgregarPago.setEnabled(false);
    }

    private void habilitarPago() {
        txtMonto.setEditable(true);
        txtDescripcionPago.setEditable(true);
    }

    private void deshabilitarPago() {
        txtNPago.setEditable(false);
        txtCodigoP.setEditable(false);
        txtMonto.setEditable(false);
        txtDescripcionPago.setEditable(false);
    }

    private void limpiarP() {
        txtFecha.setEditable(false);
        txtNPago.setEditable(false);
        txtNPago.setText("");
        txtMonto.setText("");
        txtDescripcionPago.setText("");
        deshabilitarPago();

        codigoprestamo = null;
        motivoP = 2;
        monto = null;
        descripcion = null;

        if (motivoP == 1) {
            cboMotivo.setEnabled(false);
        } else {
            cboMotivo.setEnabled(true);
        }

        btnAgregarPago.setText("Agregar pago");
    }

    private Boolean validarLlenado() {
        return tblPagosMotivo.getRowCount() == 0;
    }

    private void validarLetras(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO LETRAS", "SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void validarNumeros(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS", "SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarComboMotivo() {
        try {
            clsMotivoPago objM = new clsMotivoPago();
            ArrayList<EntidadMotivoPago> motivos = objM.listarMotivos();
            cboMotivo.setModel(new DefaultComboBoxModel(motivos.toArray()));
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdPago dialog = new jdPago(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPago;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboMotivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPagosMotivo;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtDescripcionPago;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNPago;
    // End of variables declaration//GEN-END:variables
}
