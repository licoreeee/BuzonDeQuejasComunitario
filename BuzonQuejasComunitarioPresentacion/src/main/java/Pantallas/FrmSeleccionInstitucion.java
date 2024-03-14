/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

/**
 *
 * @author castr
 */
public class FrmSeleccionInstitucion extends javax.swing.JFrame {

    /**
     * Creates new form FrmSeleccionInstitucion
     */
    public FrmSeleccionInstitucion() {
        initComponents();
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
        lblLogoGobiernoMexico = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();
        btnLevantarReporte = new javax.swing.JButton();
        btnAvances = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnHistorialAyuda = new javax.swing.JButton();
        cboSeleccionInstitucion = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        lblContenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 360));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoGobiernoMexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantallas/multimedia/logo_gobierno_mexico.png"))); // NOI18N
        jPanel1.add(lblLogoGobiernoMexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDescripcion1.setText("Seleccione entre las instituciones disponibles las cuales considere son las indicadas para darle ");
        jPanel1.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 510, 20));

        lblDescripcion2.setText("seguimiento al reporte.");
        jPanel1.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 500, -1));

        btnLevantarReporte.setBackground(new java.awt.Color(10, 50, 6));
        btnLevantarReporte.setText("Levantar Reporte");
        jPanel1.add(btnLevantarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 130, -1));

        btnAvances.setBackground(new java.awt.Color(10, 50, 6));
        btnAvances.setText("Avances");
        jPanel1.add(btnAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        btnSiguiente.setBackground(new java.awt.Color(229, 229, 229));
        btnSiguiente.setForeground(new java.awt.Color(181, 18, 57));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(181, 18, 57), 3, true));
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 100, 40));

        btnHistorialAyuda.setBackground(new java.awt.Color(10, 50, 6));
        btnHistorialAyuda.setText("Historial Ayudas");
        jPanel1.add(btnHistorialAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        cboSeleccionInstitucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CFE", "OOMAPAS", "Policia Municipal de Cajeme", "Residuos Sólidos Urbanos", "IMCYC" }));
        cboSeleccionInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSeleccionInstitucionActionPerformed(evt);
            }
        });
        jPanel1.add(cboSeleccionInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, 40));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Instituciones Correspondientes");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblHeader.setBackground(new java.awt.Color(10, 50, 6));
        lblHeader.setOpaque(true);
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        lblContenido.setBackground(new java.awt.Color(229, 229, 229));
        lblContenido.setOpaque(true);
        jPanel1.add(lblContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 600, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboSeleccionInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSeleccionInstitucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSeleccionInstitucionActionPerformed

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
//            java.util.logging.Logger.getLogger(FrmSeleccionInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmSeleccionInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmSeleccionInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmSeleccionInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmSeleccionInstitucion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnHistorialAyuda;
    private javax.swing.JButton btnLevantarReporte;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cboSeleccionInstitucion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContenido;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogoGobiernoMexico;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
