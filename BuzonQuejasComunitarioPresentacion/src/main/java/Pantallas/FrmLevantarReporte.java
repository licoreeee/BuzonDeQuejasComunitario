/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

/**
 *
 * @author Usuario
 */
public class FrmLevantarReporte extends javax.swing.JFrame {

    /**
     * Creates new form FrmLevantarReporte
     */
    public FrmLevantarReporte() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAvances = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnLevantarReporte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlbLevantarReporte = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmpTitulo = new javax.swing.JTextField();
        cmpDescripcion = new javax.swing.JTextField();
        jlbObligatorio = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Levantar reporte");
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel2.setBackground(new java.awt.Color(10, 50, 6));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 80));

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(255, 255, 255));
        btnAvances.setText("Avances");
        btnAvances.setBorderPainted(false);
        btnAvances.setContentAreaFilled(false);

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);

        btnLevantarReporte.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnLevantarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnLevantarReporte.setText("Levantar Reporte");
        btnLevantarReporte.setBorderPainted(false);
        btnLevantarReporte.setContentAreaFilled(false);
        btnLevantarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevantarReporteActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLevantarReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvances)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistorial)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistorial)
                    .addComponent(btnAvances)
                    .addComponent(btnLevantarReporte))
                .addContainerGap())
        );

        jlbLevantarReporte.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jlbLevantarReporte.setForeground(new java.awt.Color(33, 33, 33));
        jlbLevantarReporte.setText("Levantar reporte");

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Escriba una breve descripción sobre la situación seleccionada.");

        jlbTitulo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(33, 33, 33));
        jlbTitulo.setText("Título*:");

        jLabel1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Descripción*:");

        cmpTitulo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpTitulo.setForeground(new java.awt.Color(33, 33, 33));
        cmpTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpTituloActionPerformed(evt);
            }
        });

        cmpDescripcion.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpDescripcionActionPerformed(evt);
            }
        });

        jlbObligatorio.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        jlbObligatorio.setForeground(new java.awt.Color(110, 110, 110));
        jlbObligatorio.setText("*Campo obligatorio.");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbObligatorio)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbContexto)
                        .addComponent(jlbLevantarReporte)
                        .addComponent(jlbTitulo)
                        .addComponent(jLabel1)
                        .addComponent(cmpDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                        .addComponent(cmpTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbLevantarReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbContexto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbObligatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 404));

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


        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnLevantarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevantarReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLevantarReporteActionPerformed

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
    private javax.swing.JButton btnLevantarReporte;
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
