/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import dto.ReporteDTO;
import org.itson.diseño.levantarreportess.IFacadeLevantarReporte;



/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FrmLevantarReporte extends javax.swing.JFrame {

    private IFacadeLevantarReporte fachadaLevantarReporte;
    private ControlNavegacion controladores;

    /**
     * Creates new form FrmLevantarReporte
     */
    public FrmLevantarReporte() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHistorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlbLevantarReporte = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmpTitulo = new javax.swing.JTextField();
        cmpDescripcion = new javax.swing.JTextField();
        jlbObligatorio = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAvances = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Levantar reporte");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Levantar reporte");
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 50, 6));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        jPanel2.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 49, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jlbLevantarReporte.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jlbLevantarReporte.setForeground(new java.awt.Color(33, 33, 33));
        jlbLevantarReporte.setText("Levantar reporte");
        jPanel1.add(jlbLevantarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 92, -1, -1));

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Escriba una breve descripción sobre la situación seleccionada.");
        jPanel1.add(jlbContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 123, -1, -1));

        jlbTitulo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(33, 33, 33));
        jlbTitulo.setText("Título*:");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Descripción*:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        cmpTitulo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpTitulo.setForeground(new java.awt.Color(33, 33, 33));
        cmpTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpTituloActionPerformed(evt);
            }
        });
        jPanel1.add(cmpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 565, -1));

        cmpDescripcion.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(cmpDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 565, 75));

        jlbObligatorio.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        jlbObligatorio.setForeground(new java.awt.Color(110, 110, 110));
        jlbObligatorio.setText("*Campo obligatorio.");
        jPanel1.add(jlbObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(181, 18, 57));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 104, 43));

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(255, 255, 255));
        btnAvances.setText("Avances");
        btnAvances.setBorderPainted(false);
        btnAvances.setContentAreaFilled(false);
        jPanel1.add(btnAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void cmpTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpTituloActionPerformed

    private void cmpDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpDescripcionActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String titulo = cmpTitulo.getText();
        String descripcion = cmpDescripcion.getText();
        
//        ReporteDTO reporte = new ReporteDTO();
//        reporte.setTitulo(titulo);
//        reporte.setDescripcion(descripcion);
//        
//        controladores.mostrarDireccion(reporte);
        dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
//            java.util.logging.Logger.getLogger(FrmLevantarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmLevantarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmLevantarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmLevantarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmLevantarReporte().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JTextField cmpDescripcion;
    private javax.swing.JTextField cmpTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel jlbLevantarReporte;
    private javax.swing.JLabel jlbObligatorio;
    private javax.swing.JLabel jlbTitulo;
    // End of variables declaration//GEN-END:variables
}
