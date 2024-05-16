/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import dto.ReporteDTO;
import java.util.Random;
import org.itson.diseño.levantarreportess.IFacadeLevantarReporte;

/**
 *
 * @author Usuario
 */
public class FrmFolio extends javax.swing.JFrame {

    private IFacadeLevantarReporte fachadaLevantarReporte;
    private ControlNavegacion controladores;
    private ReporteDTO reporteDTO;

    /**
     * Creates new form FrmFolio
     *
     * @param reporteDTO
     */
    public FrmFolio(ReporteDTO reporteDTO) {
        initComponents();
        this.reporteDTO = reporteDTO;
        this.fachadaLevantarReporte = fachadaLevantarReporte;
        this.controladores = new ControlNavegacion();
        generarFolio();

    }

    private void generarFolio() {
        etqDinamicaFolio.setText(String.valueOf(reporteDTO.getFolio()));
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
        jPanel2 = new javax.swing.JPanel();
        btnAvances = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        etqDinamicaFolio = new javax.swing.JLabel();
        btnVolverMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Folio");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 50, 6));
        jPanel2.setForeground(new java.awt.Color(0, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(290, 80));

        btnAvances.setBackground(new java.awt.Color(0, 102, 51));
        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(255, 255, 255));
        btnAvances.setText("Avances");
        btnAvances.setBorder(null);
        btnAvances.setBorderPainted(false);
        btnAvances.setContentAreaFilled(false);
        btnAvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancesActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(0, 102, 51));
        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setBorder(null);
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(140, 140, 140)
                .addComponent(btnAvances)
                .addGap(18, 18, 18)
                .addComponent(btnHistorial)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvances)
                    .addComponent(btnHistorial))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 0, 0));

        lblMensaje.setFont(new java.awt.Font("Inter Medium", 0, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Reporte levantado con éxito, su número de folio es:");

        etqDinamicaFolio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqDinamicaFolio.setForeground(new java.awt.Color(255, 255, 255));
        etqDinamicaFolio.setText("Folio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblMensaje)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqDinamicaFolio)
                .addGap(247, 247, 247))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqDinamicaFolio)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        btnVolverMenuPrincipal.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnVolverMenuPrincipal.setForeground(new java.awt.Color(204, 0, 0));
        btnVolverMenuPrincipal.setText("Volver a la página de inicio");
        btnVolverMenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnVolverMenuPrincipal.setContentAreaFilled(false);
        btnVolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 216, 40));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuPrincipalActionPerformed
        controladores.mostrarMenuPrincipal();
        dispose();
    }//GEN-LAST:event_btnVolverMenuPrincipalActionPerformed

    private void btnAvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancesActionPerformed
        // TODO add your handling code here:
        controladores.mostrarPortalInstituciones();
        dispose();
    }//GEN-LAST:event_btnAvancesActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        controladores.mostrarHistorial();
        dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmFolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmFolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmFolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmFolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmFolio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnVolverMenuPrincipal;
    private javax.swing.JLabel etqDinamicaFolio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
