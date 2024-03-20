/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

/**
 *
 * @author victo
 */
public class FrmDireccion extends javax.swing.JFrame {

    /**
     * Creates new form FrmDireccion
     */
    public FrmDireccion() {
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

        lblLogo = new javax.swing.JLabel();
        btnLevantarReporte = new javax.swing.JButton();
        btnAvances = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();
        lblDireccionReporte = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        jlbColonia = new javax.swing.JLabel();
        jlbNumeroExterior = new javax.swing.JLabel();
        jlbCalle = new javax.swing.JLabel();
        jlbCP = new javax.swing.JLabel();
        jlbDescripcionExtra = new javax.swing.JLabel();
        cmpCalle = new javax.swing.JTextField();
        cmpNumeroExterior = new javax.swing.JTextField();
        cmpCP = new javax.swing.JTextField();
        cmpColonia = new javax.swing.JTextField();
        cmpColonia1 = new javax.swing.JTextField();
        btnTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        btnLevantarReporte.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnLevantarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnLevantarReporte.setText("Levantar Reporte");
        btnLevantarReporte.setBorder(null);
        btnLevantarReporte.setContentAreaFilled(false);
        getContentPane().add(btnLevantarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 130, -1));

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(255, 255, 255));
        btnAvances.setText("Avances");
        btnAvances.setBorder(null);
        btnAvances.setContentAreaFilled(false);
        getContentPane().add(btnAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setBorder(null);
        btnHistorial.setContentAreaFilled(false);
        getContentPane().add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        lblHeader.setBackground(new java.awt.Color(10, 50, 6));
        lblHeader.setOpaque(true);
        getContentPane().add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

        lblDireccionReporte.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        lblDireccionReporte.setForeground(new java.awt.Color(33, 33, 33));
        lblDireccionReporte.setText("Dirección del reporte");

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Describra la locación de donde está ubicado el incidente.");

        jlbColonia.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbColonia.setForeground(new java.awt.Color(33, 33, 33));
        jlbColonia.setText("Colonia*:");

        jlbNumeroExterior.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbNumeroExterior.setForeground(new java.awt.Color(33, 33, 33));
        jlbNumeroExterior.setText("Número exterior:");

        jlbCalle.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbCalle.setForeground(new java.awt.Color(33, 33, 33));
        jlbCalle.setText("Calle*:");

        jlbCP.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbCP.setForeground(new java.awt.Color(33, 33, 33));
        jlbCP.setText("C.P.:");

        jlbDescripcionExtra.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbDescripcionExtra.setForeground(new java.awt.Color(33, 33, 33));
        jlbDescripcionExtra.setText("Descripción extra:");

        cmpCalle.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpCalle.setForeground(new java.awt.Color(33, 33, 33));
        cmpCalle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCalleActionPerformed(evt);
            }
        });

        cmpNumeroExterior.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpNumeroExterior.setForeground(new java.awt.Color(33, 33, 33));
        cmpNumeroExterior.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpNumeroExterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNumeroExteriorActionPerformed(evt);
            }
        });

        cmpCP.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpCP.setForeground(new java.awt.Color(33, 33, 33));
        cmpCP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCPActionPerformed(evt);
            }
        });

        cmpColonia.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpColonia.setForeground(new java.awt.Color(33, 33, 33));
        cmpColonia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpColoniaActionPerformed(evt);
            }
        });

        cmpColonia1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpColonia1.setForeground(new java.awt.Color(33, 33, 33));
        cmpColonia1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpColonia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpColonia1ActionPerformed(evt);
            }
        });

        btnTerminar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(181, 18, 57));
        btnTerminar.setText("Terminar");
        btnTerminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnTerminar.setContentAreaFilled(false);
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paso 4.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(jlbColonia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbCP)
                        .addGap(220, 220, 220))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(jlbDescripcionExtra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmpColonia)
                            .addComponent(jlbContexto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccionReporte, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFondoLayout.createSequentialGroup()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(jlbCalle)
                                        .addGap(354, 354, 354))
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(cmpCalle)
                                        .addGap(26, 26, 26)))
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNumeroExterior)
                                    .addComponent(cmpNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFondoLayout.createSequentialGroup()
                                .addComponent(cmpColonia1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cmpCP)))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDireccionReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbContexto)
                .addGap(18, 18, 18)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNumeroExterior)
                    .addComponent(jlbCalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbColonia)
                    .addComponent(jlbCP))
                .addGap(8, 8, 8)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpColonia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbDescripcionExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 600, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmpCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCalleActionPerformed

    private void cmpNumeroExteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNumeroExteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNumeroExteriorActionPerformed

    private void cmpCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpCPActionPerformed

    private void cmpColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpColoniaActionPerformed

    private void cmpColonia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpColonia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpColonia1ActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDireccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnLevantarReporte;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JTextField cmpCP;
    private javax.swing.JTextField cmpCalle;
    private javax.swing.JTextField cmpColonia;
    private javax.swing.JTextField cmpColonia1;
    private javax.swing.JTextField cmpNumeroExterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbCP;
    private javax.swing.JLabel jlbCalle;
    private javax.swing.JLabel jlbColonia;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel jlbDescripcionExtra;
    private javax.swing.JLabel jlbNumeroExterior;
    private javax.swing.JLabel lblDireccionReporte;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
