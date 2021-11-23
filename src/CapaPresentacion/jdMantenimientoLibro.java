/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaNegocio.Entidades.EntidadArea;
import CapaNegocio.Entidades.EntidadAutor;
import CapaNegocio.Entidades.EntidadEditorial;
import CapaNegocio.Entidades.EntidadLibro;
import CapaNegocio.clsArea;
import CapaNegocio.clsAutor;
import CapaNegocio.clsAutoria;
import CapaNegocio.clsEditorial;
import CapaNegocio.clsLibro;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Ruidias
 */
public class jdMantenimientoLibro extends javax.swing.JDialog {

    ArrayList<EntidadAutor> autores = new ArrayList<EntidadAutor>();
    DefaultListModel modeloJL = null;
    clsLibro objL = null;

    public jdMantenimientoLibro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Mantenimiento de libro");
        setResizable(true);
        setLocationRelativeTo(null);
        validarAno();
        listar();
        deshabilitar();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/iconSystem.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtISBN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboEditorial = new javax.swing.JComboBox<>();
        cboArea = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnActualizarE = new javax.swing.JButton();
        btnActualizarA = new javax.swing.JButton();
        btnMantenimientoE = new javax.swing.JButton();
        btnMantenimientoA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTitulo = new javax.swing.JTextArea();
        jspEdicion = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistAutores = new javax.swing.JList<>();
        cboAutor = new javax.swing.JComboBox<>();
        btnAgregarAutor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jspEjemplares = new javax.swing.JSpinner();
        jycAno = new com.toedter.calendar.JYearChooser();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtTotalEjemplares = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnListarxEditorial = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnListarAmbos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(83, 109, 254), null));

        txtISBN.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISBNKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel1.setText("ISBN:");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("Título:");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Año publ:");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("Edición:");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Editorial:");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Área:");

        cboEditorial.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cboEditorial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEditorialItemStateChanged(evt);
            }
        });

        cboArea.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconSearch.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizarE.setBackground(new java.awt.Color(255, 149, 5));
        btnActualizarE.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnActualizarE.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarE.setText("Actualizar");
        btnActualizarE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 5)));
        btnActualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEActionPerformed(evt);
            }
        });

        btnActualizarA.setBackground(new java.awt.Color(255, 149, 5));
        btnActualizarA.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnActualizarA.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarA.setText("Actualizar");
        btnActualizarA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 149, 5)));
        btnActualizarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAActionPerformed(evt);
            }
        });

        btnMantenimientoE.setBackground(new java.awt.Color(255, 204, 51));
        btnMantenimientoE.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnMantenimientoE.setForeground(new java.awt.Color(0, 0, 0));
        btnMantenimientoE.setText("+");
        btnMantenimientoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        btnMantenimientoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoEActionPerformed(evt);
            }
        });

        btnMantenimientoA.setBackground(new java.awt.Color(255, 204, 51));
        btnMantenimientoA.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnMantenimientoA.setForeground(new java.awt.Color(0, 0, 0));
        btnMantenimientoA.setText("+");
        btnMantenimientoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        btnMantenimientoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoAActionPerformed(evt);
            }
        });

        txtTitulo.setColumns(20);
        txtTitulo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtTitulo.setRows(5);
        jScrollPane2.setViewportView(txtTitulo);

        jspEdicion.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jspEdicion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));

        jPanel3.setBackground(new java.awt.Color(83, 109, 254));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setText("Autor(es):");

        jlistAutores.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jlistAutores);

        cboAutor.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        btnAgregarAutor.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregarAutor.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconAddUser.png"))); // NOI18N
        btnAgregarAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cboAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarAutor)
                        .addGap(66, 66, 66)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarAutor)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel8.setText("Ejemplares:");

        jspEjemplares.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jspEjemplares.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jycAno.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboEditorial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActualizarA, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(btnActualizarE, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMantenimientoA, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(btnMantenimientoE, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jspEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jycAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jspEdicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnBuscar))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jycAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMantenimientoE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMantenimientoA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jspEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        btnEliminar.setBackground(new java.awt.Color(236, 78, 32));
        btnEliminar.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 78, 32)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtTotalEjemplares.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel9.setText("Total de libros:");

        btnListarxEditorial.setBackground(new java.awt.Color(255, 255, 255));
        btnListarxEditorial.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnListarxEditorial.setForeground(new java.awt.Color(0, 0, 0));
        btnListarxEditorial.setText("Listar por editorial");
        btnListarxEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnListarxEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarxEditorialActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(255, 255, 255));
        btnListar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(0, 0, 0));
        btnListar.setText("Listar todo");
        btnListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnListarAmbos.setBackground(new java.awt.Color(255, 255, 255));
        btnListarAmbos.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnListarAmbos.setForeground(new java.awt.Color(0, 0, 0));
        btnListarAmbos.setText("Listar Ambos");
        btnListarAmbos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnListarAmbos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAmbosActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(83, 109, 254));

        tblListado.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblListado.setSelectionBackground(new java.awt.Color(83, 109, 254));
        jScrollPane4.setViewportView(tblListado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListarxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListarAmbos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnListarxEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addContainerGap())
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

    private void btnMantenimientoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoEActionPerformed
        jdMantenimientoEditorial objME = new jdMantenimientoEditorial(null, true);
        objME.setVisible(true);
    }//GEN-LAST:event_btnMantenimientoEActionPerformed

    private void btnMantenimientoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoAActionPerformed
        jdMantenimientoArea objMA = new jdMantenimientoArea(null, true);
        objMA.setVisible(true);
    }//GEN-LAST:event_btnMantenimientoAActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarCombos();
    }//GEN-LAST:event_formWindowOpened

    private void btnActualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEActionPerformed
        llenarCombos();
    }//GEN-LAST:event_btnActualizarEActionPerformed

    private void btnActualizarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAActionPerformed
        llenarCombos();
    }//GEN-LAST:event_btnActualizarAActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cboEditorialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEditorialItemStateChanged

    }//GEN-LAST:event_cboEditorialItemStateChanged

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().equalsIgnoreCase("Nuevo")) {
            btnNuevo.setText("Guardar");
            habilitar();
        } else {
            registrar();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        agregarAutor();
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void txtISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyTyped
        validarNumeros(evt);
        limiteCaracteres(evt, txtISBN.getText(), 10);
    }//GEN-LAST:event_txtISBNKeyTyped

    private void btnListarxEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarxEditorialActionPerformed

        try {
            objL = new clsLibro();
            EntidadEditorial editorial = (EntidadEditorial) cboEditorial.getSelectedItem();
            objL.listarPAxEditorial(tblListado, editorial.getCodigoedi());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnListarxEditorialActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnListarAmbosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAmbosActionPerformed
        try {
            objL = new clsLibro();
            EntidadEditorial editorial = (EntidadEditorial) cboEditorial.getSelectedItem();
            EntidadArea area = (EntidadArea) cboArea.getSelectedItem();
            objL.listarPAxAmbos(tblListado, editorial.getCodigoedi(), area.getCodigoare());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnListarAmbosActionPerformed

    private void buscar() {
        try {

            objL = new clsLibro();

            if (txtISBN.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el ISBN del libro a buscar");
            } else {
                objL.setIsbn(txtISBN.getText());
                EntidadLibro Libro = objL.consultarLibro();

                if (Libro != null) {
                    txtISBN.setText(Libro.getIsbn());
                    txtTitulo.setText(Libro.getTitulo());
                    jycAno.setYear(Libro.getFechapub());
                    jspEdicion.setValue(Libro.getEdicion());

                    clsEditorial objE = new clsEditorial();
                    objE.setCodigoedi(Libro.getCodigoedi());
                    EntidadEditorial editorial = objE.consultarEditorial();
                    cboEditorial.getModel().setSelectedItem(editorial);

                    clsArea objA = new clsArea();
                    objA.setCodigoare(Libro.getCodigoare());
                    EntidadArea area = objA.consultarArea();
                    cboArea.getModel().setSelectedItem(area);
                    
                    jspEjemplares.setValue(Libro.getNumejemplar());

                    consultarAutoria(Libro.getIsbn());

                    txtISBN.setEnabled(false);
                    btnNuevo.setEnabled(false);
                    txtTitulo.requestFocus();
                    habilitar();
                } else {
                    JOptionPane.showMessageDialog(this, "No existe el libro");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void consultarAutoria(String isbn) {
        try {
            clsAutoria objAutoria = new clsAutoria();
            objAutoria.setIsbn(isbn);
            ArrayList<EntidadAutor> autores = objAutoria.consultarAutoriasLibro();
            modeloJL = new DefaultListModel();

            for (EntidadAutor a : autores) {
                modeloJL.addElement(a);
            }

            jlistAutores.setModel(modeloJL);
            btnAgregarAutor.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void registrar() {
        try {

            if (validarLlenado()) {
                JOptionPane.showMessageDialog(this, "Llenar todos los campos");
            } else {

                if (jlistAutores.getModel().getSize() == 0) {
                    JOptionPane.showMessageDialog(this, "Debe agregar un autor al libro");
                } else {
                    objL = new clsLibro();
                    objL.setIsbn(txtISBN.getText());
                    Boolean verificar = objL.validarLibro();
                    if (verificar) {
                        JOptionPane.showMessageDialog(this, "Ya existe el libro");
                        txtISBN.setText("");
                        txtISBN.requestFocus();
                    } else {
                        setear();

                        Boolean res = objL.insertarLibro();

                        if (res) {
                            JOptionPane.showMessageDialog(this, "Se registró correctamente el nuevo libro");
                            registrarAutoria();
                            objL.insertar();
                            listar();
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se registró el libro, intente nuevamente");
                        }
                    }
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void registrarAutoria() {

        int codigos[] = new int[jlistAutores.getModel().getSize()];
        for (int i = 0; i < jlistAutores.getModel().getSize(); i++) {
            EntidadAutor autor = (EntidadAutor) modeloJL.getElementAt(i);
            codigos[i] = autor.getCodigoaut();
        }

        try {

            for (int i = 0; i < codigos.length; i++) {

                Boolean res = objL.insertarAutoria(txtISBN.getText(), codigos[i]);
                if (res) {
                    JOptionPane.showMessageDialog(this, "Se registró correctamente la autoria con codigo del autor: " + codigos[i]);
                } else {
                    JOptionPane.showMessageDialog(this, "No se registró el libro, intente nuevamente");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void eliminar() {
        try {
            if (txtISBN.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el código del libro a eliminar");
            } else {
                int confirmacion = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar el libro ?");
                objL.setIsbn(txtISBN.getText());
                EntidadLibro Libro = objL.consultarLibro();

                if (Libro != null) {

                    if (confirmacion == 0) {
                        clsAutoria objAutoria = new clsAutoria();
                        objAutoria.setIsbn(txtISBN.getText());
                        Boolean resAutoria = objAutoria.eliminarAutoria();
                        if (resAutoria) {
                            JOptionPane.showMessageDialog(this, "Se elimino la autoria del libro");
                            Boolean res = objL.eliminar();
                            if (res) {
                                JOptionPane.showMessageDialog(this, "Se eliminó correctamente el libro");
                                listar();
                                limpiar();
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El código del libro no existe");
                    limpiar();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void agregarAutor() {
        EntidadAutor autor = (EntidadAutor) cboAutor.getSelectedItem();
        if (autores.contains(autor)) { //Verifica que el autor no este otra vez en el arraylist autores, para evitar duplicados
            JOptionPane.showMessageDialog(this, "El autor ya fue agregado");
        } else {
            autores.add(autor);
            modeloJL = new DefaultListModel();
            for (EntidadAutor a : autores) {
                modeloJL.addElement(a);
            }
            jlistAutores.setModel(modeloJL);
        }
    }

    private void llenarCombos() {

        try {

            clsEditorial objE = new clsEditorial();
            ArrayList<EntidadEditorial> editoriales = objE.llenarCombo(true);
            cboEditorial.setModel(new DefaultComboBoxModel(editoriales.toArray()));

            clsArea objA = new clsArea();
            ArrayList<EntidadArea> areas = objA.llenarCombo(true);
            cboArea.setModel(new DefaultComboBoxModel(areas.toArray()));

            clsAutor objAu = new clsAutor();
            ArrayList<EntidadAutor> autor = objAu.llenarAutores();
            cboAutor.setModel(new DefaultComboBoxModel(autor.toArray()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void listar() {
        try {
            objL = new clsLibro();
            objL.listarPA(tblListado);

            txtTotalEjemplares.setEditable(false);
            txtTotalEjemplares.setText(String.valueOf(objL.totalLibrosPA()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void limpiar() {
        txtISBN.setText("");
        txtTitulo.setText("");
        
        Calendar calendar = Calendar.getInstance();        
        jycAno.setYear(calendar.get(Calendar.YEAR));
                
        jspEdicion.setValue(1);
        jspEjemplares.setValue(1);
        llenarCombos();

        btnAgregarAutor.setEnabled(true);
        txtISBN.setEnabled(true);
        txtISBN.requestFocus();
        btnNuevo.setText("Nuevo");
        btnNuevo.setEnabled(true);
        deshabilitar();
        autores.clear();
        if (modeloJL != null) {
            modeloJL.clear();
        }

    }
    
    private void validarAno(){
        Calendar calendar = Calendar.getInstance();        
        jycAno.setEndYear(calendar.get(Calendar.YEAR));
        jycAno.setStartYear(1000);
    }

    private Boolean validarLlenado() {
        return txtISBN.getText().isEmpty() || txtTitulo.getText().isEmpty() || (cboArea.getSelectedIndex() == -1) || (cboAutor.getSelectedIndex() == -1) || (cboEditorial.getSelectedIndex() == -1);
    }

    private void setear() {
        objL = new clsLibro();
        objL.setIsbn(txtISBN.getText());
        objL.setTitulo(txtTitulo.getText());
        objL.setFechapub(jycAno.getYear());
        objL.setEdicion(Integer.parseInt(jspEdicion.getValue().toString()));
        objL.setNumejemplar(Integer.parseInt(jspEjemplares.getValue().toString()));

        EntidadEditorial editorial = (EntidadEditorial) cboEditorial.getSelectedItem();
        EntidadArea area = (EntidadArea) cboArea.getSelectedItem();

        objL.setCodigoedi(editorial.getCodigoedi());
        objL.setCodigoare(area.getCodigoare());
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

    private void limiteCaracteres(java.awt.event.KeyEvent evt, String caracteres, int limite) {
        if (caracteres.length() == limite) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "NÚMERO DE CARACTERES EXCEDIDO", "SISTEMA", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void habilitar() {
        txtTitulo.setEditable(true);
        jycAno.setEnabled(true);
        jspEdicion.setEnabled(true);
        cboEditorial.setEnabled(true);
        btnActualizarE.setEnabled(true);
        btnMantenimientoE.setEnabled(true);
        cboArea.setEnabled(true);
        btnActualizarA.setEnabled(true);
        btnMantenimientoA.setEnabled(true);
        jspEjemplares.setEnabled(true);
        cboAutor.setEnabled(true);
        btnAgregarAutor.setEnabled(true);
        btnListar.setEnabled(true);
        btnListarAmbos.setEnabled(true);
        btnListarxEditorial.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

    private void deshabilitar() {
        txtTitulo.setEditable(false);
        jycAno.setEnabled(false);
        jspEdicion.setEnabled(false);
        cboEditorial.setEnabled(false);
        btnActualizarE.setEnabled(false);
        btnMantenimientoE.setEnabled(false);
        cboArea.setEnabled(false);
        btnActualizarA.setEnabled(false);
        btnMantenimientoA.setEnabled(false);
        jspEjemplares.setEnabled(false);
        cboAutor.setEnabled(false);
        btnAgregarAutor.setEnabled(false);
        btnListar.setEnabled(false);
        btnListarAmbos.setEnabled(false);
        btnListarxEditorial.setEnabled(false);
        btnEliminar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(jdMantenimientoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdMantenimientoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdMantenimientoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdMantenimientoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdMantenimientoLibro dialog = new jdMantenimientoLibro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizarA;
    private javax.swing.JButton btnActualizarE;
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListarAmbos;
    private javax.swing.JButton btnListarxEditorial;
    private javax.swing.JButton btnMantenimientoA;
    private javax.swing.JButton btnMantenimientoE;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboAutor;
    private javax.swing.JComboBox<String> cboEditorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jlistAutores;
    private javax.swing.JSpinner jspEdicion;
    private javax.swing.JSpinner jspEjemplares;
    private com.toedter.calendar.JYearChooser jycAno;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextArea txtTitulo;
    private javax.swing.JTextField txtTotalEjemplares;
    // End of variables declaration//GEN-END:variables
}
