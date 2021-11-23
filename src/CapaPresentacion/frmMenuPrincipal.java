/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaPresentacion.Reportes.jdLibrosMasPrestados;
import CapaPresentacion.Reportes.jdPrestamos;
import CapaPresentacion.Reportes.jdPrestamosRangoFecha;
import CapaPresentacion.Reportes.jdRepAreas;
import CapaPresentacion.Reportes.jdRepEditoriales;
import CapaPresentacion.Reportes.jdRepLectores;
import CapaPresentacion.Reportes.jdRepLibros;
import CapaPresentacion.Reportes.jdRepLibrosPorAutor;
import CapaPresentacion.Reportes.jdRepLibrosxEditorial;
import CapaPresentacion.Reportes.jdRepPagosLector;
import CapaPresentacion.Reportes.jdRepPorcentajeLibrosPrestadosArea;
import CapaPresentacion.Reportes.jdRepPorcentajeLibrosPrestadosEditorial;
import CapaPresentacion.Reportes.jdRepPrestamosVencidos;
import CapaPresentacion.Reportes.jdTotalAreas;
import CapaPresentacion.Reportes.jdTotalEditorial;
import CapaPresentacion.Reportes.jdTotalPrestamosPorMes;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Rodrigo Ruidias
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmMenuPrincipal() {
        this.setUndecorated(true);
        initComponents();
        this.setTitle("Menú principal");
        this.setLocationRelativeTo(null);
        adaptarImagen(lblGif, "src/CapaPresentacionImagenes/MainLibraryGif.gif");
        deshabilitarPanelesOpe();
        deshabilitarPanelesRepo();
        habilitarPanelesMan();
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/iconSystem.png")).getImage());
        lblUsuario.requestFocus();
    }

    public static String nombreU;
    public static String cargoU;
    int xx, xy;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrrarSesion = new javax.swing.JButton();
        btnPrestamoAD = new javax.swing.JButton();
        btnDevolucionAD = new javax.swing.JButton();
        btnReportesAD = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnManU = new javax.swing.JButton();
        btnLibroAD = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificarContra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblGif = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelManUsuario = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnEditorial1 = new javax.swing.JButton();
        panelAutor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAutor = new javax.swing.JButton();
        panelEditorial = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEditorial = new javax.swing.JButton();
        panelGeneralReporteAreas = new javax.swing.JPanel();
        panelAutor19 = new javax.swing.JPanel();
        btnReporteLectores9 = new javax.swing.JButton();
        panelAutor22 = new javax.swing.JPanel();
        btnReporteLectores11 = new javax.swing.JButton();
        panelGeneralReporteEditoriales = new javax.swing.JPanel();
        panelAutor9 = new javax.swing.JPanel();
        btnReporteLectores12 = new javax.swing.JButton();
        panelAutor23 = new javax.swing.JPanel();
        btnReporteLectores13 = new javax.swing.JButton();
        panelGeneralReporteLectores = new javax.swing.JPanel();
        panelAutor8 = new javax.swing.JPanel();
        btnReporteLectores8 = new javax.swing.JButton();
        panelAutor21 = new javax.swing.JPanel();
        btnReporteLectores10 = new javax.swing.JButton();
        panelGeneralReporteLibros = new javax.swing.JPanel();
        panelAutor13 = new javax.swing.JPanel();
        btnReporteLectores2 = new javax.swing.JButton();
        panelAutor14 = new javax.swing.JPanel();
        btnReporteEditoriales2 = new javax.swing.JButton();
        panelAutor15 = new javax.swing.JPanel();
        btnReportePrestamos2 = new javax.swing.JButton();
        panelAutor16 = new javax.swing.JPanel();
        btnReporteLibros2 = new javax.swing.JButton();
        panelAutor17 = new javax.swing.JPanel();
        btnReporteAreas2 = new javax.swing.JButton();
        panelAutor18 = new javax.swing.JPanel();
        btnReporteAutores2 = new javax.swing.JButton();
        panelGeneralReportePrestamos = new javax.swing.JPanel();
        panelAutor7 = new javax.swing.JPanel();
        btnReporteLectores3 = new javax.swing.JButton();
        panelAutor10 = new javax.swing.JPanel();
        btnReporteLectores6 = new javax.swing.JButton();
        panelAutor11 = new javax.swing.JPanel();
        btnReporteLectores4 = new javax.swing.JButton();
        panelAutor12 = new javax.swing.JPanel();
        btnReporteLectores7 = new javax.swing.JButton();
        panelGeneralReportes = new javax.swing.JPanel();
        panelAutor1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnReporteLectores = new javax.swing.JButton();
        panelAutor2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnReporteEditoriales = new javax.swing.JButton();
        panelAutor3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnReportePrestamos = new javax.swing.JButton();
        panelAutor4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnReporteLibros = new javax.swing.JButton();
        panelAutor5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnReporteAreas = new javax.swing.JButton();
        panelAutor6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnReporteAutores = new javax.swing.JButton();
        panelLector = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnAutor2 = new javax.swing.JButton();
        panelDevolucion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAutor3 = new javax.swing.JButton();
        panelPrestamo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnAutor1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        btnOperaciones = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        separadaroReportes = new javax.swing.JSeparator();
        separadorOperaciones = new javax.swing.JSeparator();
        separadorMantenimiento = new javax.swing.JSeparator();
        panelArea = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnArea = new javax.swing.JButton();
        panelLibro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnLibro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnUsuarioInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 600));

        btnCerrrarSesion.setBackground(new java.awt.Color(51, 0, 51));
        btnCerrrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/IconSignoff.png"))); // NOI18N
        btnCerrrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCerrrarSesion.setFocusPainted(false);
        btnCerrrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrrarSesionActionPerformed(evt);
            }
        });

        btnPrestamoAD.setBackground(new java.awt.Color(51, 0, 51));
        btnPrestamoAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReturnBook.png"))); // NOI18N
        btnPrestamoAD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPrestamoAD.setFocusPainted(false);
        btnPrestamoAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoADActionPerformed(evt);
            }
        });

        btnDevolucionAD.setBackground(new java.awt.Color(51, 0, 51));
        btnDevolucionAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconLoanBook.png"))); // NOI18N
        btnDevolucionAD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDevolucionAD.setFocusPainted(false);
        btnDevolucionAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionADActionPerformed(evt);
            }
        });

        btnReportesAD.setBackground(new java.awt.Color(51, 0, 51));
        btnReportesAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReport.png"))); // NOI18N
        btnReportesAD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReportesAD.setFocusPainted(false);
        btnReportesAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesADActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(51, 0, 51));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconSystem.png"))); // NOI18N
        btnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInicio.setFocusPainted(false);

        btnManU.setBackground(new java.awt.Color(51, 0, 51));
        btnManU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconUser.png"))); // NOI18N
        btnManU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnManU.setFocusPainted(false);
        btnManU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManUActionPerformed(evt);
            }
        });

        btnLibroAD.setBackground(new java.awt.Color(51, 0, 51));
        btnLibroAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconBook.png"))); // NOI18N
        btnLibroAD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLibroAD.setFocusPainted(false);
        btnLibroAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroADActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 0, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconExit.png"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnModificarContra.setBackground(new java.awt.Color(51, 0, 51));
        btnModificarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconEditPass.png"))); // NOI18N
        btnModificarContra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModificarContra.setFocusPainted(false);
        btnModificarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarContra)
                    .addComponent(btnSalir)
                    .addComponent(btnLibroAD)
                    .addComponent(btnManU)
                    .addComponent(btnInicio)
                    .addComponent(btnReportesAD)
                    .addComponent(btnDevolucionAD)
                    .addComponent(btnPrestamoAD)
                    .addComponent(btnCerrrarSesion))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio)
                .addGap(75, 75, 75)
                .addComponent(btnLibroAD)
                .addGap(18, 18, 18)
                .addComponent(btnDevolucionAD)
                .addGap(18, 18, 18)
                .addComponent(btnPrestamoAD)
                .addGap(18, 18, 18)
                .addComponent(btnReportesAD)
                .addGap(18, 18, 18)
                .addComponent(btnManU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(btnModificarContra)
                .addGap(18, 18, 18)
                .addComponent(btnCerrrarSesion)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 720));

        jPanel4.setBackground(new java.awt.Color(99, 57, 99));

        lblGif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Sistema de gestión");

        jLabel12.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("para una biblioteca");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblGif, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 810, 200));

        jPanel5.setBackground(new java.awt.Color(83, 109, 254));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelManUsuario.setBackground(new java.awt.Color(121, 138, 232));

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Usuario");

        btnEditorial1.setBackground(new java.awt.Color(121, 138, 232));
        btnEditorial1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconUserBig.png"))); // NOI18N
        btnEditorial1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditorial1.setFocusPainted(false);
        btnEditorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelManUsuarioLayout = new javax.swing.GroupLayout(panelManUsuario);
        panelManUsuario.setLayout(panelManUsuarioLayout);
        panelManUsuarioLayout.setHorizontalGroup(
            panelManUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditorial1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelManUsuarioLayout.setVerticalGroup(
            panelManUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditorial1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jPanel5.add(panelManUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 200, 150));

        panelAutor.setBackground(new java.awt.Color(121, 138, 232));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Autor");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAutor.setBackground(new java.awt.Color(121, 138, 232));
        btnAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconAuthorBig.png"))); // NOI18N
        btnAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAutor.setFocusPainted(false);
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutorLayout = new javax.swing.GroupLayout(panelAutor);
        panelAutor.setLayout(panelAutorLayout);
        panelAutorLayout.setHorizontalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutorLayout.setVerticalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel5.add(panelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 150));

        panelEditorial.setBackground(new java.awt.Color(121, 138, 232));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editorial");

        btnEditorial.setBackground(new java.awt.Color(121, 138, 232));
        btnEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconEditorialBig.png"))); // NOI18N
        btnEditorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEditorial.setFocusPainted(false);
        btnEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditorialLayout = new javax.swing.GroupLayout(panelEditorial);
        panelEditorial.setLayout(panelEditorialLayout);
        panelEditorialLayout.setHorizontalGroup(
            panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEditorialLayout.setVerticalGroup(
            panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel5.add(panelEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 200, 150));

        panelGeneralReporteAreas.setBackground(new java.awt.Color(83, 109, 254));

        panelAutor19.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores9.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores9.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores9.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores9.setText("<html><center>Reporte de áreas<html>");
        btnReporteLectores9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores9.setFocusPainted(false);
        btnReporteLectores9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor19Layout = new javax.swing.GroupLayout(panelAutor19);
        panelAutor19.setLayout(panelAutor19Layout);
        panelAutor19Layout.setHorizontalGroup(
            panelAutor19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores9, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor19Layout.setVerticalGroup(
            panelAutor19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor22.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores11.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores11.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores11.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores11.setText("<html><center>Reporte de total de áreas<html>");
        btnReporteLectores11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores11.setFocusPainted(false);
        btnReporteLectores11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor22Layout = new javax.swing.GroupLayout(panelAutor22);
        panelAutor22.setLayout(panelAutor22Layout);
        panelAutor22Layout.setHorizontalGroup(
            panelAutor22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores11, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor22Layout.setVerticalGroup(
            panelAutor22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeneralReporteAreasLayout = new javax.swing.GroupLayout(panelGeneralReporteAreas);
        panelGeneralReporteAreas.setLayout(panelGeneralReporteAreasLayout);
        panelGeneralReporteAreasLayout.setHorizontalGroup(
            panelGeneralReporteAreasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteAreasLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(panelAutor19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(panelAutor22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panelGeneralReporteAreasLayout.setVerticalGroup(
            panelGeneralReporteAreasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteAreasLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(panelGeneralReporteAreasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.add(panelGeneralReporteAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 710, 330));

        panelGeneralReporteEditoriales.setBackground(new java.awt.Color(83, 109, 254));

        panelAutor9.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores12.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores12.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores12.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores12.setText("<html><center>Reporte de editoriales<html>");
        btnReporteLectores12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores12.setFocusPainted(false);
        btnReporteLectores12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor9Layout = new javax.swing.GroupLayout(panelAutor9);
        panelAutor9.setLayout(panelAutor9Layout);
        panelAutor9Layout.setHorizontalGroup(
            panelAutor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores12, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor9Layout.setVerticalGroup(
            panelAutor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor23.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores13.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores13.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores13.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores13.setText("<html><center>Total de editoriales<html>");
        btnReporteLectores13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores13.setFocusPainted(false);
        btnReporteLectores13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor23Layout = new javax.swing.GroupLayout(panelAutor23);
        panelAutor23.setLayout(panelAutor23Layout);
        panelAutor23Layout.setHorizontalGroup(
            panelAutor23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores13, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor23Layout.setVerticalGroup(
            panelAutor23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeneralReporteEditorialesLayout = new javax.swing.GroupLayout(panelGeneralReporteEditoriales);
        panelGeneralReporteEditoriales.setLayout(panelGeneralReporteEditorialesLayout);
        panelGeneralReporteEditorialesLayout.setHorizontalGroup(
            panelGeneralReporteEditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteEditorialesLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(panelAutor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(panelAutor23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panelGeneralReporteEditorialesLayout.setVerticalGroup(
            panelGeneralReporteEditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteEditorialesLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelGeneralReporteEditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel5.add(panelGeneralReporteEditoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 710, 330));

        panelGeneralReporteLectores.setBackground(new java.awt.Color(83, 109, 254));

        panelAutor8.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores8.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores8.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores8.setText("<html><center>Reporte de lectores<html>");
        btnReporteLectores8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores8.setFocusPainted(false);
        btnReporteLectores8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor8Layout = new javax.swing.GroupLayout(panelAutor8);
        panelAutor8.setLayout(panelAutor8Layout);
        panelAutor8Layout.setHorizontalGroup(
            panelAutor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores8, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor8Layout.setVerticalGroup(
            panelAutor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor21.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores10.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores10.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores10.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores10.setText("<html><center>Reporte de pagos del lector<html>");
        btnReporteLectores10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores10.setFocusPainted(false);
        btnReporteLectores10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor21Layout = new javax.swing.GroupLayout(panelAutor21);
        panelAutor21.setLayout(panelAutor21Layout);
        panelAutor21Layout.setHorizontalGroup(
            panelAutor21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor21Layout.setVerticalGroup(
            panelAutor21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeneralReporteLectoresLayout = new javax.swing.GroupLayout(panelGeneralReporteLectores);
        panelGeneralReporteLectores.setLayout(panelGeneralReporteLectoresLayout);
        panelGeneralReporteLectoresLayout.setHorizontalGroup(
            panelGeneralReporteLectoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteLectoresLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(panelAutor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(panelAutor21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        panelGeneralReporteLectoresLayout.setVerticalGroup(
            panelGeneralReporteLectoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteLectoresLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelGeneralReporteLectoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel5.add(panelGeneralReporteLectores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 710, 330));

        panelGeneralReporteLibros.setBackground(new java.awt.Color(83, 109, 254));

        panelAutor13.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores2.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores2.setText("<html><center>Reporte de libros<html>");
        btnReporteLectores2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores2.setFocusPainted(false);
        btnReporteLectores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor13Layout = new javax.swing.GroupLayout(panelAutor13);
        panelAutor13.setLayout(panelAutor13Layout);
        panelAutor13Layout.setHorizontalGroup(
            panelAutor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor13Layout.setVerticalGroup(
            panelAutor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor14.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteEditoriales2.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteEditoriales2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteEditoriales2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteEditoriales2.setText("<html><center>Reporte de libros por editorial<html>");
        btnReporteEditoriales2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteEditoriales2.setFocusPainted(false);
        btnReporteEditoriales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEditoriales2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor14Layout = new javax.swing.GroupLayout(panelAutor14);
        panelAutor14.setLayout(panelAutor14Layout);
        panelAutor14Layout.setHorizontalGroup(
            panelAutor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteEditoriales2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor14Layout.setVerticalGroup(
            panelAutor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteEditoriales2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor15.setBackground(new java.awt.Color(121, 138, 232));

        btnReportePrestamos2.setBackground(new java.awt.Color(121, 138, 232));
        btnReportePrestamos2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReportePrestamos2.setForeground(new java.awt.Color(255, 255, 255));
        btnReportePrestamos2.setText("<html><center>Los 10 libros más prestados<html>");
        btnReportePrestamos2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReportePrestamos2.setFocusPainted(false);
        btnReportePrestamos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportePrestamos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor15Layout = new javax.swing.GroupLayout(panelAutor15);
        panelAutor15.setLayout(panelAutor15Layout);
        panelAutor15Layout.setHorizontalGroup(
            panelAutor15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReportePrestamos2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor15Layout.setVerticalGroup(
            panelAutor15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReportePrestamos2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor16.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLibros2.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLibros2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLibros2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLibros2.setText("<html><center>Reporte de libros prestados por editorial<html>");
        btnReporteLibros2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLibros2.setFocusPainted(false);
        btnReporteLibros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLibros2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor16Layout = new javax.swing.GroupLayout(panelAutor16);
        panelAutor16.setLayout(panelAutor16Layout);
        panelAutor16Layout.setHorizontalGroup(
            panelAutor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLibros2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor16Layout.setVerticalGroup(
            panelAutor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLibros2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor17.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteAreas2.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteAreas2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteAreas2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteAreas2.setText("<html><center>Reporte de libros por autor<html>");
        btnReporteAreas2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteAreas2.setFocusPainted(false);
        btnReporteAreas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAreas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor17Layout = new javax.swing.GroupLayout(panelAutor17);
        panelAutor17.setLayout(panelAutor17Layout);
        panelAutor17Layout.setHorizontalGroup(
            panelAutor17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAreas2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor17Layout.setVerticalGroup(
            panelAutor17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAreas2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor18.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteAutores2.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteAutores2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteAutores2.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteAutores2.setText("<html><center>Reporte de libros prestados por área<html>");
        btnReporteAutores2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteAutores2.setFocusPainted(false);
        btnReporteAutores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAutores2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor18Layout = new javax.swing.GroupLayout(panelAutor18);
        panelAutor18.setLayout(panelAutor18Layout);
        panelAutor18Layout.setHorizontalGroup(
            panelAutor18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAutores2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor18Layout.setVerticalGroup(
            panelAutor18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAutores2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeneralReporteLibrosLayout = new javax.swing.GroupLayout(panelGeneralReporteLibros);
        panelGeneralReporteLibros.setLayout(panelGeneralReporteLibrosLayout);
        panelGeneralReporteLibrosLayout.setHorizontalGroup(
            panelGeneralReporteLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralReporteLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGeneralReporteLibrosLayout.createSequentialGroup()
                        .addComponent(panelAutor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(panelAutor17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGeneralReporteLibrosLayout.createSequentialGroup()
                        .addComponent(panelAutor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAutor18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(panelGeneralReporteLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelGeneralReporteLibrosLayout.setVerticalGroup(
            panelGeneralReporteLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReporteLibrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralReporteLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelGeneralReporteLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(panelGeneralReporteLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 710, 330));

        panelGeneralReportePrestamos.setBackground(new java.awt.Color(83, 109, 254));

        panelAutor7.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores3.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores3.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores3.setText("<html><center>Reportes de préstamos<html>");
        btnReporteLectores3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores3.setFocusPainted(false);
        btnReporteLectores3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor7Layout = new javax.swing.GroupLayout(panelAutor7);
        panelAutor7.setLayout(panelAutor7Layout);
        panelAutor7Layout.setHorizontalGroup(
            panelAutor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor7Layout.setVerticalGroup(
            panelAutor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor10.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores6.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores6.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores6.setText("<html><center>Reporte de préstamos por meses<html>");
        btnReporteLectores6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores6.setFocusPainted(false);
        btnReporteLectores6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor10Layout = new javax.swing.GroupLayout(panelAutor10);
        panelAutor10.setLayout(panelAutor10Layout);
        panelAutor10Layout.setHorizontalGroup(
            panelAutor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor10Layout.setVerticalGroup(
            panelAutor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor11.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores4.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores4.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores4.setText("<html><center>Reporte de préstamos vencidos por mes<html>");
        btnReporteLectores4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores4.setFocusPainted(false);
        btnReporteLectores4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor11Layout = new javax.swing.GroupLayout(panelAutor11);
        panelAutor11.setLayout(panelAutor11Layout);
        panelAutor11Layout.setHorizontalGroup(
            panelAutor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor11Layout.setVerticalGroup(
            panelAutor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelAutor12.setBackground(new java.awt.Color(121, 138, 232));

        btnReporteLectores7.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnReporteLectores7.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteLectores7.setText("<html><center>Reporte de préstamos por rango de fecha<html>");
        btnReporteLectores7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores7.setFocusPainted(false);
        btnReporteLectores7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectores7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor12Layout = new javax.swing.GroupLayout(panelAutor12);
        panelAutor12.setLayout(panelAutor12Layout);
        panelAutor12Layout.setHorizontalGroup(
            panelAutor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores7, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAutor12Layout.setVerticalGroup(
            panelAutor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeneralReportePrestamosLayout = new javax.swing.GroupLayout(panelGeneralReportePrestamos);
        panelGeneralReportePrestamos.setLayout(panelGeneralReportePrestamosLayout);
        panelGeneralReportePrestamosLayout.setHorizontalGroup(
            panelGeneralReportePrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReportePrestamosLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(panelGeneralReportePrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGeneralReportePrestamosLayout.createSequentialGroup()
                        .addComponent(panelAutor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(panelAutor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGeneralReportePrestamosLayout.createSequentialGroup()
                        .addComponent(panelAutor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(panelAutor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panelGeneralReportePrestamosLayout.setVerticalGroup(
            panelGeneralReportePrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReportePrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralReportePrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelGeneralReportePrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(panelGeneralReportePrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 710, 330));

        panelGeneralReportes.setBackground(new java.awt.Color(83, 109, 254));

        panelAutor1.setBackground(new java.awt.Color(121, 138, 232));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lectores");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReporteLectores.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLectores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReportLectores.png"))); // NOI18N
        btnReporteLectores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLectores.setFocusPainted(false);
        btnReporteLectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLectoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor1Layout = new javax.swing.GroupLayout(panelAutor1);
        panelAutor1.setLayout(panelAutor1Layout);
        panelAutor1Layout.setHorizontalGroup(
            panelAutor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteLectores, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutor1Layout.setVerticalGroup(
            panelAutor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        panelAutor2.setBackground(new java.awt.Color(121, 138, 232));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Editoriales");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReporteEditoriales.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteEditoriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconEditorialBig.png"))); // NOI18N
        btnReporteEditoriales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteEditoriales.setFocusPainted(false);
        btnReporteEditoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEditorialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor2Layout = new javax.swing.GroupLayout(panelAutor2);
        panelAutor2.setLayout(panelAutor2Layout);
        panelAutor2Layout.setHorizontalGroup(
            panelAutor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteEditoriales, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutor2Layout.setVerticalGroup(
            panelAutor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutor2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        panelAutor3.setBackground(new java.awt.Color(121, 138, 232));

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Préstamos");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReportePrestamos.setBackground(new java.awt.Color(121, 138, 232));
        btnReportePrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconLoanBookBig.png"))); // NOI18N
        btnReportePrestamos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReportePrestamos.setFocusPainted(false);
        btnReportePrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportePrestamosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor3Layout = new javax.swing.GroupLayout(panelAutor3);
        panelAutor3.setLayout(panelAutor3Layout);
        panelAutor3Layout.setHorizontalGroup(
            panelAutor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportePrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutor3Layout.setVerticalGroup(
            panelAutor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutor3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReportePrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        panelAutor4.setBackground(new java.awt.Color(121, 138, 232));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Libros");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReporteLibros.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReportBooks.png"))); // NOI18N
        btnReporteLibros.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteLibros.setFocusPainted(false);
        btnReporteLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteLibrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor4Layout = new javax.swing.GroupLayout(panelAutor4);
        panelAutor4.setLayout(panelAutor4Layout);
        panelAutor4Layout.setHorizontalGroup(
            panelAutor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutor4Layout.setVerticalGroup(
            panelAutor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutor4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        panelAutor5.setBackground(new java.awt.Color(121, 138, 232));

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Áreas");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReporteAreas.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteAreas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReportAreas.png"))); // NOI18N
        btnReporteAreas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteAreas.setFocusPainted(false);
        btnReporteAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor5Layout = new javax.swing.GroupLayout(panelAutor5);
        panelAutor5.setLayout(panelAutor5Layout);
        panelAutor5Layout.setHorizontalGroup(
            panelAutor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteAreas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutor5Layout.setVerticalGroup(
            panelAutor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutor5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        panelAutor6.setBackground(new java.awt.Color(121, 138, 232));

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Autores");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReporteAutores.setBackground(new java.awt.Color(121, 138, 232));
        btnReporteAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReportLectores.png"))); // NOI18N
        btnReporteAutores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReporteAutores.setFocusPainted(false);
        btnReporteAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAutoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutor6Layout = new javax.swing.GroupLayout(panelAutor6);
        panelAutor6.setLayout(panelAutor6Layout);
        panelAutor6Layout.setHorizontalGroup(
            panelAutor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutor6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteAutores, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAutor6Layout.setVerticalGroup(
            panelAutor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutor6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporteAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeneralReportesLayout = new javax.swing.GroupLayout(panelGeneralReportes);
        panelGeneralReportes.setLayout(panelGeneralReportesLayout);
        panelGeneralReportesLayout.setHorizontalGroup(
            panelGeneralReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGeneralReportesLayout.createSequentialGroup()
                        .addComponent(panelAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(panelAutor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGeneralReportesLayout.createSequentialGroup()
                        .addComponent(panelAutor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAutor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(panelGeneralReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelGeneralReportesLayout.setVerticalGroup(
            panelGeneralReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelGeneralReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAutor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAutor6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(panelGeneralReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 710, 330));

        panelLector.setBackground(new java.awt.Color(121, 138, 232));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lector");

        btnAutor2.setBackground(new java.awt.Color(121, 138, 232));
        btnAutor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconLectorBig.png"))); // NOI18N
        btnAutor2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAutor2.setFocusPainted(false);
        btnAutor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLectorLayout = new javax.swing.GroupLayout(panelLector);
        panelLector.setLayout(panelLectorLayout);
        panelLectorLayout.setHorizontalGroup(
            panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnAutor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLectorLayout.setVerticalGroup(
            panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLectorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAutor2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel5.add(panelLector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 200, 200));

        panelDevolucion.setBackground(new java.awt.Color(121, 138, 232));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Devolución");

        btnAutor3.setBackground(new java.awt.Color(121, 138, 232));
        btnAutor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconReturnBookBig.png"))); // NOI18N
        btnAutor3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAutor3.setFocusPainted(false);
        btnAutor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutor3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDevolucionLayout = new javax.swing.GroupLayout(panelDevolucion);
        panelDevolucion.setLayout(panelDevolucionLayout);
        panelDevolucionLayout.setHorizontalGroup(
            panelDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnAutor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDevolucionLayout.setVerticalGroup(
            panelDevolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAutor3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel5.add(panelDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 200, 200));

        panelPrestamo.setBackground(new java.awt.Color(121, 138, 232));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Prestamo");

        btnAutor1.setBackground(new java.awt.Color(121, 138, 232));
        btnAutor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconLoanBookBig.png"))); // NOI18N
        btnAutor1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAutor1.setFocusPainted(false);
        btnAutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrestamoLayout = new javax.swing.GroupLayout(panelPrestamo);
        panelPrestamo.setLayout(panelPrestamoLayout);
        panelPrestamoLayout.setHorizontalGroup(
            panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnAutor1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrestamoLayout.setVerticalGroup(
            panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAutor1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel5.add(panelPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 200, 200));

        jPanel3.setBackground(new java.awt.Color(121, 138, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Menús");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 123, 60));

        btnReportes.setBackground(new java.awt.Color(121, 138, 232));
        btnReportes.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReportes.setFocusPainted(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel3.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 19, 112, -1));

        btnOperaciones.setBackground(new java.awt.Color(121, 138, 232));
        btnOperaciones.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnOperaciones.setText("Operaciones");
        btnOperaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOperaciones.setFocusPainted(false);
        btnOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 19, 112, -1));

        btnMantenimiento.setBackground(new java.awt.Color(121, 138, 232));
        btnMantenimiento.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMantenimiento.setFocusPainted(false);
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });
        jPanel3.add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 19, 112, -1));

        separadaroReportes.setBackground(new java.awt.Color(255, 255, 255));
        separadaroReportes.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(separadaroReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 50, 112, 10));

        separadorOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        separadorOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(separadorOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 50, 112, 10));

        separadorMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        separadorMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(separadorMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 49, 112, 10));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 30, 715, -1));

        panelArea.setBackground(new java.awt.Color(121, 138, 232));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Área");

        btnArea.setBackground(new java.awt.Color(121, 138, 232));
        btnArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconAreaBig.png"))); // NOI18N
        btnArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnArea.setFocusPainted(false);
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAreaLayout = new javax.swing.GroupLayout(panelArea);
        panelArea.setLayout(panelAreaLayout);
        panelAreaLayout.setHorizontalGroup(
            panelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAreaLayout.setVerticalGroup(
            panelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel5.add(panelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 296, 200, 150));

        panelLibro.setBackground(new java.awt.Color(121, 138, 232));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Libro");

        btnLibro.setBackground(new java.awt.Color(121, 138, 232));
        btnLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconBookBig.png"))); // NOI18N
        btnLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLibro.setFocusPainted(false);
        btnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLibroLayout = new javax.swing.GroupLayout(panelLibro);
        panelLibro.setLayout(panelLibroLayout);
        panelLibroLayout.setHorizontalGroup(
            panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLibroLayout.setVerticalGroup(
            panelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel5.add(panelLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 296, 200, 150));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 810, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconMinimize.png"))); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton15.setFocusPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconExit2.png"))); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton16.setFocusPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseDragged(evt);
            }
        });
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblUsuarioMousePressed(evt);
            }
        });

        btnUsuarioInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarioInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaPresentacionImagenes/iconLector.png"))); // NOI18N
        btnUsuarioInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUsuarioInicio.setFocusPainted(false);
        btnUsuarioInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUsuarioInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 810, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperacionesActionPerformed
        deshabilitarPanelesMan();
        deshabilitarPanelesRepo();
        habilitarPanelesOpe();
    }//GEN-LAST:event_btnOperacionesActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        deshabilitarPanelesOpe();
        deshabilitarPanelesRepo();
        habilitarPanelesMan();
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        deshabilitarPanelesMan();
        deshabilitarPanelesOpe();
        habilitarPanelesRepo();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnReportePrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportePrestamosActionPerformed
        panelGeneralReportePrestamos.setVisible(true);
        panelGeneralReportes.setVisible(false);
    }//GEN-LAST:event_btnReportePrestamosActionPerformed

    private void btnReporteLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLibrosActionPerformed
        panelGeneralReporteLibros.setVisible(true);
        panelGeneralReportes.setVisible(false);
    }//GEN-LAST:event_btnReporteLibrosActionPerformed

    private void btnReporteLectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectoresActionPerformed
        panelGeneralReporteLectores.setVisible(true);
        panelGeneralReportes.setVisible(false);
    }//GEN-LAST:event_btnReporteLectoresActionPerformed

    private void btnReporteAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAreasActionPerformed
        panelGeneralReporteAreas.setVisible(true);
        panelGeneralReportes.setVisible(false);
    }//GEN-LAST:event_btnReporteAreasActionPerformed

    private void btnReporteEditorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEditorialesActionPerformed
        panelGeneralReporteEditoriales.setVisible(true);
        panelGeneralReportes.setVisible(false);
    }//GEN-LAST:event_btnReporteEditorialesActionPerformed

    private void btnCerrrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrrarSesionActionPerformed
        dispose();
        jdLogin objL = new jdLogin(this, true);
        objL.setVisible(true);
    }//GEN-LAST:event_btnCerrrarSesionActionPerformed

    private void btnLibroADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroADActionPerformed
        jdMantenimientoLibro objML = new jdMantenimientoLibro(this, true);
        objML.setVisible(true);
    }//GEN-LAST:event_btnLibroADActionPerformed

    private void btnDevolucionADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionADActionPerformed
        jdDevolucion objRE = new jdDevolucion(null, true);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnDevolucionADActionPerformed

    private void btnPrestamoADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoADActionPerformed
        jdPrestamo objP = new jdPrestamo(this, true);
        objP.setVisible(true);
    }//GEN-LAST:event_btnPrestamoADActionPerformed

    private void btnReportesADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesADActionPerformed
        deshabilitarPanelesMan();
        deshabilitarPanelesOpe();
        habilitarPanelesRepo();
    }//GEN-LAST:event_btnReportesADActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblUsuario.setText(nombreU + " - " + cargoU);
        if (cargoU.equalsIgnoreCase("Bibliotecario")) {
            btnModificarContra.setVisible(false);
            btnManU.setVisible(false);
            btnLibroAD.setVisible(false);
            deshabilitarPanelesMan();
            btnMantenimiento.setVisible(false);
            habilitarPanelesOpe();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnManUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManUActionPerformed
        jdMantenimientoUsuario objMU = new jdMantenimientoUsuario(this, true);
        objMU.setVisible(true);
    }//GEN-LAST:event_btnManUActionPerformed

    private void btnModificarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarContraActionPerformed
        jdModificarContra objMC = new jdModificarContra(this, true);
        objMC.setVisible(true);
    }//GEN-LAST:event_btnModificarContraActionPerformed

    private void btnUsuarioInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioInicioActionPerformed

    private void btnReporteLectores9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores9ActionPerformed
        jdRepAreas objRE = new jdRepAreas(this, true);
        objRE.setTitle("Reporte de áreas");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores9ActionPerformed

    private void btnReporteLectores11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores11ActionPerformed
        jdTotalAreas objRE = new jdTotalAreas(this, true);
        objRE.setTitle("Reporte del total de áreas");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores11ActionPerformed

    private void btnReporteLectores12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores12ActionPerformed
        jdRepEditoriales objRE = new jdRepEditoriales(this, true);
        objRE.setTitle("Reporte de editoriales");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores12ActionPerformed

    private void btnReporteLectores13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores13ActionPerformed
        jdTotalEditorial objRE = new jdTotalEditorial(this, true);
        objRE.setTitle("Reporte del total de editoriales");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores13ActionPerformed

    private void btnReporteLectores8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores8ActionPerformed
        jdRepLectores objRE = new jdRepLectores(this, true);
        objRE.setTitle("Reporte de lectores");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores8ActionPerformed

    private void btnReporteLectores10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores10ActionPerformed
        jdRepPagosLector objRE = new jdRepPagosLector(this, true);
        objRE.setTitle("Reporte de pagos del lector");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores10ActionPerformed

    private void btnReporteLectores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores2ActionPerformed
        jdRepLibros objRE = new jdRepLibros(this, true);
        objRE.setTitle("Reporte de libros");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores2ActionPerformed

    private void btnReporteAreas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAreas2ActionPerformed
        jdRepLibrosPorAutor objRE = new jdRepLibrosPorAutor(this, true);
        objRE.setTitle("Reporte de libros por autor");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteAreas2ActionPerformed

    private void btnReporteEditoriales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEditoriales2ActionPerformed
        jdRepLibrosxEditorial objLE = new jdRepLibrosxEditorial(this, true);
        objLE.setTitle("Reporte de libros por editoriales");
        objLE.setSize(1280, 853);
        objLE.setLocationRelativeTo(null);
        objLE.setVisible(true);
    }//GEN-LAST:event_btnReporteEditoriales2ActionPerformed

    private void btnReporteLibros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLibros2ActionPerformed
        jdRepPorcentajeLibrosPrestadosEditorial objRE = new jdRepPorcentajeLibrosPrestadosEditorial(this, true);
        objRE.setTitle("Reporte de porcentaje de libros prestados por editorial");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLibros2ActionPerformed

    private void btnReporteAutores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAutores2ActionPerformed
        jdRepPorcentajeLibrosPrestadosArea objRE = new jdRepPorcentajeLibrosPrestadosArea(this, true);
        objRE.setTitle("Reporte de porcentaje de libros prestados por área");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteAutores2ActionPerformed

    private void btnReportePrestamos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportePrestamos2ActionPerformed
        jdLibrosMasPrestados objRE = new jdLibrosMasPrestados(this, true);
        objRE.setTitle("Reporte de libros más prestados");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReportePrestamos2ActionPerformed

    private void btnReporteLectores3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores3ActionPerformed
        jdPrestamos objRE = new jdPrestamos(this, true);
        objRE.setTitle("Reporte de préstamos");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores3ActionPerformed

    private void btnReporteLectores4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores4ActionPerformed
        jdRepPrestamosVencidos objRE = new jdRepPrestamosVencidos(this, true);
        objRE.setTitle("Reporte de préstamos vencidos");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores4ActionPerformed

    private void btnReporteLectores6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores6ActionPerformed
        jdTotalPrestamosPorMes objRE = new jdTotalPrestamosPorMes(this, true);
        objRE.setTitle("Reporte de préstamos por cada mes y día");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores6ActionPerformed

    private void btnReporteLectores7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteLectores7ActionPerformed
        jdPrestamosRangoFecha objRE = new jdPrestamosRangoFecha(this, true);
        objRE.setTitle("Reporte de préstamos por rango de fecha");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnReporteLectores7ActionPerformed

    private void btnAutor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutor2ActionPerformed
        jdMantenimientoLector objML = new jdMantenimientoLector(this, true);
        objML.setVisible(true);
    }//GEN-LAST:event_btnAutor2ActionPerformed

    private void btnAutor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutor3ActionPerformed
        jdDevolucion objRE = new jdDevolucion(null, true);
        objRE.setVisible(true);
    }//GEN-LAST:event_btnAutor3ActionPerformed

    private void btnAutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutor1ActionPerformed
        jdPrestamo objP = new jdPrestamo(this, true);
        objP.setVisible(true);
    }//GEN-LAST:event_btnAutor1ActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        jdMantenimientoAutor objMA = new jdMantenimientoAutor(this, true);
        objMA.setVisible(true);
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        jdMantenimientoArea objMA = new jdMantenimientoArea(this, true);
        objMA.setVisible(true);
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorialActionPerformed
        jdMantenimientoEditorial objME = new jdMantenimientoEditorial(this, true);
        objME.setVisible(true);
    }//GEN-LAST:event_btnEditorialActionPerformed

    private void btnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroActionPerformed
        jdMantenimientoLibro objML = new jdMantenimientoLibro(this, true);
        objML.setVisible(true);
    }//GEN-LAST:event_btnLibroActionPerformed

    private void btnReporteAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAutoresActionPerformed
        jdRepLectores objRE = new jdRepLectores(this, true);
        objRE.setTitle("Reporte de lectores");
        objRE.setSize(1280, 853);
        objRE.setLocationRelativeTo(null);
        objRE.setVisible(true);        
    }//GEN-LAST:event_btnReporteAutoresActionPerformed

    private void btnEditorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorial1ActionPerformed
        jdMantenimientoUsuario objMU = new jdMantenimientoUsuario(this, true);
        objMU.setVisible(true);
    }//GEN-LAST:event_btnEditorial1ActionPerformed

    private void lblUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_lblUsuarioMousePressed

    private void lblUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_lblUsuarioMouseDragged

    private void deshabilitarPanelesMan() {
        panelArea.setVisible(false);
        panelAutor.setVisible(false);
        panelEditorial.setVisible(false);
        panelLibro.setVisible(false);
        panelManUsuario.setVisible(false);
        separadorMantenimiento.setVisible(false);
    }

    private void habilitarPanelesMan() {
        panelArea.setVisible(true);
        panelAutor.setVisible(true);
        panelEditorial.setVisible(true);
        panelLibro.setVisible(true);
        panelManUsuario.setVisible(true);
        separadorMantenimiento.setVisible(true);
    }

    private void deshabilitarPanelesOpe() {
        panelLector.setVisible(false);
        panelPrestamo.setVisible(false);
        panelDevolucion.setVisible(false);
        separadorOperaciones.setVisible(false);
    }

    private void habilitarPanelesOpe() {
        panelLector.setVisible(true);
        panelPrestamo.setVisible(true);
        panelDevolucion.setVisible(true);
        separadorOperaciones.setVisible(true);
    }

    private void deshabilitarPanelesRepo() {
        panelGeneralReportes.setVisible(false);
        panelGeneralReportePrestamos.setVisible(false);
        panelGeneralReporteLibros.setVisible(false);
        panelGeneralReporteLectores.setVisible(false);
        panelGeneralReporteAreas.setVisible(false);
        panelGeneralReporteEditoriales.setVisible(false);
        separadaroReportes.setVisible(false);
    }

    private void habilitarPanelesRepo() {
        panelGeneralReportes.setVisible(true);
        panelGeneralReportePrestamos.setVisible(false);
        panelGeneralReporteLibros.setVisible(false);
        panelGeneralReporteLectores.setVisible(false);
        panelGeneralReporteAreas.setVisible(false);
        panelGeneralReporteEditoriales.setVisible(false);
        separadaroReportes.setVisible(true);
    }

    private void adaptarImagen(JLabel lbl, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
    }

    
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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnAutor1;
    private javax.swing.JButton btnAutor2;
    private javax.swing.JButton btnAutor3;
    private javax.swing.JButton btnCerrrarSesion;
    private javax.swing.JButton btnDevolucionAD;
    private javax.swing.JButton btnEditorial;
    private javax.swing.JButton btnEditorial1;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLibro;
    private javax.swing.JButton btnLibroAD;
    private javax.swing.JButton btnManU;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnModificarContra;
    private javax.swing.JButton btnOperaciones;
    private javax.swing.JButton btnPrestamoAD;
    private javax.swing.JButton btnReporteAreas;
    private javax.swing.JButton btnReporteAreas2;
    private javax.swing.JButton btnReporteAutores;
    private javax.swing.JButton btnReporteAutores2;
    private javax.swing.JButton btnReporteEditoriales;
    private javax.swing.JButton btnReporteEditoriales2;
    private javax.swing.JButton btnReporteLectores;
    private javax.swing.JButton btnReporteLectores10;
    private javax.swing.JButton btnReporteLectores11;
    private javax.swing.JButton btnReporteLectores12;
    private javax.swing.JButton btnReporteLectores13;
    private javax.swing.JButton btnReporteLectores2;
    private javax.swing.JButton btnReporteLectores3;
    private javax.swing.JButton btnReporteLectores4;
    private javax.swing.JButton btnReporteLectores6;
    private javax.swing.JButton btnReporteLectores7;
    private javax.swing.JButton btnReporteLectores8;
    private javax.swing.JButton btnReporteLectores9;
    private javax.swing.JButton btnReporteLibros;
    private javax.swing.JButton btnReporteLibros2;
    private javax.swing.JButton btnReportePrestamos;
    private javax.swing.JButton btnReportePrestamos2;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReportesAD;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarioInicio;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblGif;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelArea;
    private javax.swing.JPanel panelAutor;
    private javax.swing.JPanel panelAutor1;
    private javax.swing.JPanel panelAutor10;
    private javax.swing.JPanel panelAutor11;
    private javax.swing.JPanel panelAutor12;
    private javax.swing.JPanel panelAutor13;
    private javax.swing.JPanel panelAutor14;
    private javax.swing.JPanel panelAutor15;
    private javax.swing.JPanel panelAutor16;
    private javax.swing.JPanel panelAutor17;
    private javax.swing.JPanel panelAutor18;
    private javax.swing.JPanel panelAutor19;
    private javax.swing.JPanel panelAutor2;
    private javax.swing.JPanel panelAutor21;
    private javax.swing.JPanel panelAutor22;
    private javax.swing.JPanel panelAutor23;
    private javax.swing.JPanel panelAutor3;
    private javax.swing.JPanel panelAutor4;
    private javax.swing.JPanel panelAutor5;
    private javax.swing.JPanel panelAutor6;
    private javax.swing.JPanel panelAutor7;
    private javax.swing.JPanel panelAutor8;
    private javax.swing.JPanel panelAutor9;
    private javax.swing.JPanel panelDevolucion;
    private javax.swing.JPanel panelEditorial;
    private javax.swing.JPanel panelGeneralReporteAreas;
    private javax.swing.JPanel panelGeneralReporteEditoriales;
    private javax.swing.JPanel panelGeneralReporteLectores;
    private javax.swing.JPanel panelGeneralReporteLibros;
    private javax.swing.JPanel panelGeneralReportePrestamos;
    private javax.swing.JPanel panelGeneralReportes;
    private javax.swing.JPanel panelLector;
    private javax.swing.JPanel panelLibro;
    private javax.swing.JPanel panelManUsuario;
    private javax.swing.JPanel panelPrestamo;
    private javax.swing.JSeparator separadaroReportes;
    private javax.swing.JSeparator separadorMantenimiento;
    private javax.swing.JSeparator separadorOperaciones;
    // End of variables declaration//GEN-END:variables
}
