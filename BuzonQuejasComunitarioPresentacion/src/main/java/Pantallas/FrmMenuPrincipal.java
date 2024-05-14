/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import org.itson.diseño.levantarreportess.IFacadeLevantarReporte;



/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    private IFacadeLevantarReporte fachadaLevantarReporte;
    private ControlNavegacion controladores;

    public FrmMenuPrincipal( ) {
        initComponents();
        this.fachadaLevantarReporte = fachadaLevantarReporte;
        this.controladores = new ControlNavegacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAvances = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnAdminAcceso = new javax.swing.JButton();
        btnLevantarReporte2 = new javax.swing.JButton();
        logoGobiernoMexico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLevantarReporteImg = new javax.swing.JButton();
        lblProgramaBienestar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(241, 241, 241));
        btnAvances.setText("Avances");
        btnAvances.setContentAreaFilled(false);
        btnAvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancesActionPerformed(evt);
            }
        });
        jPanel1.add(btnAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(241, 241, 241));
        btnHistorial.setText("Historial ");
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        btnAdminAcceso.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAdminAcceso.setForeground(new java.awt.Color(241, 241, 241));
        btnAdminAcceso.setText("Admin");
        btnAdminAcceso.setContentAreaFilled(false);
        btnAdminAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAccesoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        btnLevantarReporte2.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnLevantarReporte2.setForeground(new java.awt.Color(241, 241, 241));
        btnLevantarReporte2.setText("Levantar Reporte");
        btnLevantarReporte2.setContentAreaFilled(false);
        btnLevantarReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevantarReporte2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLevantarReporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        logoGobiernoMexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        jPanel1.add(logoGobiernoMexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(10, 50, 6));
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        btnLevantarReporteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LevantarReporte.png"))); // NOI18N
        btnLevantarReporteImg.setBorder(null);
        btnLevantarReporteImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevantarReporteImgActionPerformed(evt);
            }
        });
        jPanel1.add(btnLevantarReporteImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblProgramaBienestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programaParaElBienestarDeLaFamilia.png"))); // NOI18N
        jPanel1.add(lblProgramaBienestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLevantarReporteImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevantarReporteImgActionPerformed
        controladores.mostrarSeleccionInstitucion();
        dispose();
    }//GEN-LAST:event_btnLevantarReporteImgActionPerformed

    private void btnAvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancesActionPerformed
        controladores.mostrarPortalInstituciones();
        dispose();
    }//GEN-LAST:event_btnAvancesActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        controladores.mostrarHistorial();
        dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnLevantarReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevantarReporte2ActionPerformed
        controladores.mostrarSeleccionInstitucion();
        dispose();
    }//GEN-LAST:event_btnLevantarReporte2ActionPerformed

    private void btnAdminAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAccesoActionPerformed
        controladores.mostrarCodigoAdmin();
        dispose();

    }//GEN-LAST:event_btnAdminAccesoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAcceso;
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnLevantarReporte2;
    private javax.swing.JButton btnLevantarReporteImg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblProgramaBienestar;
    private javax.swing.JLabel logoGobiernoMexico;
    // End of variables declaration//GEN-END:variables
}
