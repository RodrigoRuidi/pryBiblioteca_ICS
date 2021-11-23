/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.clsConexion;
import CapaNegocio.clsUsuario;
import java.awt.Color;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Ruidias
 */
public class jdLogin extends javax.swing.JDialog {

    public Preferences pref = Preferences.userRoot().node("Recuerdame");

    public jdLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        btnContra.setVisible(false);
        btnConfigbd.setVisible(false);
    }

    clsUsuario objU = null;
    int xx, xy;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        btnContra = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jcbRecordar = new javax.swing.JCheckBox();
        btnConfigbd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnCancelar.setBackground(new java.awt.Color(236, 78, 32));
        btnCancelar.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 78, 32)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(83, 109, 254));
        btnIngresar.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 109, 254)));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(83, 109, 254));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/imageLogin.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar sesión");

        txtContra.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        txtContra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnContra.setBackground(new java.awt.Color(255, 255, 255));
        btnContra.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnContra.setForeground(new java.awt.Color(255, 102, 102));
        btnContra.setText("¿Olvidó su contraseña?");
        btnContra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnNuevo.setText("¿Eres nuevo?");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jcbRecordar.setBackground(new java.awt.Color(255, 255, 255));
        jcbRecordar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jcbRecordar.setForeground(new java.awt.Color(0, 0, 0));
        jcbRecordar.setText("Recordar");
        jcbRecordar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConfigbd.setBackground(new java.awt.Color(255, 149, 5));
        btnConfigbd.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnConfigbd.setText("Configurar BD");
        btnConfigbd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 5)));
        btnConfigbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigbdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jcbRecordar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnContra))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btnNuevo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfigbd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jcbRecordar)
                .addGap(18, 18, 18)
                .addComponent(btnContra)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfigbd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        btnNuevo.setForeground(new Color(83, 109, 254));
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        btnNuevo.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jdRegistroUsuario objRU = new jdRegistroUsuario(null, true);
        objRU.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraActionPerformed
        jdModificarContra objM = new jdModificarContra(null, true);
        objM.setVisible(true);
    }//GEN-LAST:event_btnContraActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            if (txtUsuario.getText().isEmpty() || txtContra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese todos los campos");
            } else {
                objU = new clsUsuario();
                objU.setNombreusu(txtUsuario.getText());
                objU.setContrasena(txtContra.getText());
                Boolean verificarNU = objU.verificarNombreU();
                if (verificarNU) {
                    String[] usuario = objU.login();
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta, intente nuevamente");
                        txtContra.setText("");
                        txtContra.requestFocus();
                        btnContra.setVisible(true);
                    } else {
                        Boolean verificarU = objU.verificarUsuario();
                        if (verificarU) {
                            if (jcbRecordar.isSelected()) {
                                save();
                            } else {
                                eliminar();
                            }
                            dispose();
                            new frmMenuPrincipal().setVisible(true);
                            frmMenuPrincipal.nombreU = usuario[0];
                            frmMenuPrincipal.cargoU = usuario[1];
                        } else {
                            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea dar de alta al usuario?");
                            if (confirmacion == 0) {
                                objU.darAltaUsuario();
                                JOptionPane.showMessageDialog(this, "Se dio de alta al usuario " + usuario + " y se le da la bienvenida al sistema");
                                if (jcbRecordar.isSelected()) {
                                    save();
                                } else {
                                    eliminar();
                                }
                                dispose();
                                new frmMenuPrincipal().setVisible(true);
                                frmMenuPrincipal.nombreU = usuario[0];
                                frmMenuPrincipal.cargoU = usuario[1];                                
                            } else {
                                JOptionPane.showMessageDialog(this, "El usuario tiene que estar activo para ingresar al sistema");
                                limpiar();
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Nombre de usuario incorrecto, intente nuevamente");
                    limpiar();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage() + " Error formulario");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String usuario = null;
        usuario = pref.get("Usuario", usuario);
        txtUsuario.setText(usuario);
        
        String contra = null;
        contra = pref.get("Contraseña", contra);
        txtContra.setText(contra);
        
        if (!txtUsuario.getText().isEmpty() && !txtContra.getText().isEmpty()) {
            jcbRecordar.setSelected(true);
        }
        
        try {
            jdConfigBD objCB = new jdConfigBD(null, true);
            Preferences prefBDL = objCB.prefBD;

            String bd = null;
            bd = prefBDL.get("BD", bd);

            String contrabd = null;
            contrabd = prefBDL.get("Contra", contrabd);

            clsConexion.nombrebd = bd;
            clsConexion.contra = contrabd;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnConfigbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigbdActionPerformed
        jdConfigBD objCB = new jdConfigBD(null, true);
        objCB.setVisible(true);
    }//GEN-LAST:event_btnConfigbdActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void limpiar() {
        txtUsuario.setText("");
        txtContra.setText("");
        txtUsuario.requestFocus();
    }

    public void save() {
        if (txtUsuario.getText() == null || txtContra.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese todos los campos");
        } else {
            pref.put("Usuario", txtUsuario.getText());
            pref.put("Contraseña", txtContra.getText());
        }
    }

    public void eliminar() throws BackingStoreException {
        if (!jcbRecordar.isSelected()) {
            pref.clear();
            //pref.remove("Usuario");
            //pref.remove("Contraseña");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdLogin dialog = new jdLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfigbd;
    private javax.swing.JButton btnContra;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcbRecordar;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
