/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaNegocio.Entidades.EntidadLector;
import CapaNegocio.clsLector;
import CapaNegocio.clsLibro;
import CapaNegocio.clsPrestamo;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class jdPrestamo extends javax.swing.JDialog {

    /**
     * Creates new form jdPrestamo
     */
    public jdPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Prestamo libro");
        listarLibros();
        limpiar();
        String dia, mes, ano;
        Calendar c = new GregorianCalendar();
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        ano = Integer.toString(c.get(Calendar.YEAR));
        txtFecha.setText(dia + '/' + mes + '/' + ano);
        modelo.addColumn("ISBN");
        modelo.addColumn("TITULO");
        deshabilitar();
    }

    clsLector objLector = null;
    clsLibro objL = null;
    clsPrestamo objP = null;
    DefaultTableModel modelo = new DefaultTableModel();
    private String verificarisbn;
    private int cantidadejemplares;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNPrestamo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLectorNuevo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnAgregarLibro = new javax.swing.JButton();
        btnQuitarLibro = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLibroSeleccionado = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(83, 109, 254));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Prestamo N°:");

        txtNPrestamo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");

        txtFecha.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(83, 109, 254), null));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("DNI Lector:");

        txtDNI.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconSearchUser.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnLectorNuevo.setBackground(new java.awt.Color(255, 204, 51));
        btnLectorNuevo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnLectorNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnLectorNuevo.setText("Nuevo lector");
        btnLectorNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        btnLectorNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLectorNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLectorNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLectorNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(83, 109, 254), null));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Libros:");

        tblLibros.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblLibros.setSelectionBackground(new java.awt.Color(83, 109, 254));
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        btnAgregarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarLibro.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnAgregarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconAddBook.png"))); // NOI18N
        btnAgregarLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        btnQuitarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitarLibro.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnQuitarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnQuitarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconDeleteBook.png"))); // NOI18N
        btnQuitarLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnQuitarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQuitarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarLibro)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuitarLibro))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnNuevo.setBackground(new java.awt.Color(0, 153, 51));
        btnNuevo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(83, 109, 254));

        tblLibroSeleccionado.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblLibroSeleccionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblLibroSeleccionado.setSelectionBackground(new java.awt.Color(83, 109, 254));
        jScrollPane2.setViewportView(tblLibroSeleccionado);

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Libros seleccionados:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarLector();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLectorNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLectorNuevoActionPerformed
        jdMantenimientoLector objML = new jdMantenimientoLector(null, true);
        objML.setVisible(true);
        listarLibros();
    }//GEN-LAST:event_btnLectorNuevoActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        if (txtDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe buscar primero al lector que se le dará el prestamo");
        } else {
            agregarlibro();
        }
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnQuitarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarLibroActionPerformed
        int pos = tblLibroSeleccionado.getSelectedRow();
        if (pos >= 0) {
            if (txtDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe buscar primero al lector que se le dará el prestamo");
            } else {
                modelo.removeRow(tblLibroSeleccionado.getSelectedRow());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el libro que desea quitar");
        }
    }//GEN-LAST:event_btnQuitarLibroActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {

            if (btnNuevo.getText().equalsIgnoreCase("Nuevo")) {

                objP = new clsPrestamo();
                txtNPrestamo.setText(String.valueOf(objP.generarCodigo()));
                btnNuevo.setText("Guardar");
                habilitar();

            } else {
                if (txtNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe buscar a un lector antes de realizar el prestamo");
                } else {
                    if (verificarisbn == null) {
                        JOptionPane.showMessageDialog(this, "Seleccione el libro que desea prestar");
                    } else {
                        if (tblLibroSeleccionado.getRowCount() == 0) {
                            JOptionPane.showMessageDialog(this, "Debe seleccionar un libro como mínimo para realizar el prestamo");
                        } else {
                            Registrar();
                        }
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        validarNumeros(evt);
        limiteCaracteres(evt, txtDNI.getText(), 8);
    }//GEN-LAST:event_txtDNIKeyTyped

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
        if (evt.getClickCount() == 1) {
            int pos = tblLibros.getSelectedRow();
            if (pos >= 0) {
                verificarisbn = tblLibros.getValueAt(pos, 0).toString();
                cantidadejemplares = Integer.parseInt(tblLibros.getValueAt(pos, 4).toString());
            }
        }
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void buscarLector() {
        try {

            if (txtDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el DNI del lector primero");
            } else {
                objLector = new clsLector();
                objLector.setDnilector(txtDNI.getText());

                EntidadLector lector = objLector.consultarLector();
                if (lector != null) {
                    objP = new clsPrestamo();
                    objP.setDnilector(txtDNI.getText());
                    Boolean vencido = false;
                    ArrayList<String> dnis = objP.prestamosvencidos();

                    for (String dni : dnis) {
                        if (dni.equalsIgnoreCase(objP.getDnilector())) {
                            vencido = true;
                        }
                    }
                    
                    Boolean activo = objP.prestamosactivos();

                    if (vencido) {
                        int confirmacion = JOptionPane.showConfirmDialog(this, "Usted cuenta con un prestamo vencido. ¿Desea devolver el libro?");
                        if (confirmacion == 0) {
                            jdDevolucion objDev = new jdDevolucion(null, true);
                            jdDevolucion.dniLectorPV = txtDNI.getText();
                            objDev.buscarLectorPV();
                            objDev.setVisible(true);
                        } else {
                            txtDNI.setText("");
                            txtDNI.requestFocus();
                        }
                    } else {
                        if (activo) {
                            int confirmacion = JOptionPane.showConfirmDialog(this, "Usted cuenta con un prestamo activo. ¿Desea devolver el libro?");
                            if (confirmacion == 0) {
                                jdDevolucion objDev = new jdDevolucion(null, true);
                                jdDevolucion.dniLectorPV = txtDNI.getText();
                                objDev.buscarLectorPV();
                                objDev.setVisible(true);
                            } else {
                                txtDNI.setText("");
                                txtDNI.requestFocus();
                            }
                        } else {
                            txtNombre.setText(lector.getNombre() + " " + lector.getApellidos());
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El lector no existe");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void agregarlibro() {
        tblLibroSeleccionado.setModel(modelo);
        int pos = tblLibros.getSelectedRow();
        if (pos >= 0) {

            int con = 0;

            if (tblLibroSeleccionado.getRowCount() > 0) {
                for (int i = 0; i < tblLibroSeleccionado.getRowCount(); i++) {
                    if (tblLibroSeleccionado.getValueAt(i, 0).toString().equalsIgnoreCase(tblLibros.getValueAt(pos, 0).toString())) {
                        con++;
                    }
                }
            }

            if (cantidadejemplares > con && con < 1) {

                String datos[] = new String[2];
                datos[0] = tblLibros.getValueAt(pos, 0).toString();
                datos[1] = tblLibros.getValueAt(pos, 1).toString();

                modelo.addRow(datos);

            } else {
                JOptionPane.showMessageDialog(this, "Ha superado la cantidad de ejemplares que puede prestar");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una libro");
        }

    }

    private void Registrar() {
        try {
            setear();
            objP.registrar(Integer.parseInt(txtNPrestamo.getText()), tblLibroSeleccionado);
            JOptionPane.showMessageDialog(this, "Se registro correctamente el prestamo al lector " + txtNombre.getText());
            listarLibros();
            limpiar();
            modelo.setRowCount(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + " Aqui");
        }
    }

    private void listarLibros() {
        try {

            objL = new clsLibro();
            objL.listarPA(tblLibros);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void limpiar() {
        txtNPrestamo.setText("");
        txtDNI.setText("");
        txtNombre.setText("");

        txtNombre.setEnabled(false);
        txtNPrestamo.setEnabled(false);
        txtFecha.setEnabled(false);

        btnNuevo.setText("Nuevo");

        txtDNI.requestFocus();
        deshabilitar();

    }

    public void setear() {
        objP = new clsPrestamo();
        objP.setCodigopre(Integer.parseInt(txtNPrestamo.getText()));
        objP.setFechapre(txtFecha.getText());
        objP.setDnilector(txtDNI.getText());
    }

    private void validarNumeros(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS", "SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limiteCaracteres(java.awt.event.KeyEvent evt, String caracteres, int limite) {
        if (caracteres.length() == limite) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "NÚMERO DE CARACTERES EXCEDIDO", "SISTEMA", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void habilitar() {
        txtDNI.setEditable(true);
        btnBuscar.setEnabled(true);
        btnLectorNuevo.setEnabled(true);
        btnAgregarLibro.setEnabled(true);
        btnQuitarLibro.setEnabled(true);
        tblLibros.setEnabled(true);
        tblLibroSeleccionado.setEnabled(true);
    }

    private void deshabilitar() {
        txtDNI.setEditable(false);
        btnBuscar.setEnabled(false);
        btnLectorNuevo.setEnabled(false);
        btnAgregarLibro.setEnabled(false);
        btnQuitarLibro.setEnabled(false);
        tblLibros.setEnabled(false);
        tblLibroSeleccionado.setEnabled(false);
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
            java.util.logging.Logger.getLogger(jdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdPrestamo dialog = new jdPrestamo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLectorNuevo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnQuitarLibro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLibroSeleccionado;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNPrestamo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
