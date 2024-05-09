/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasAvance;

/**
 *
 * @author hisam
 */
public class FrmPortalInstituciones extends javax.swing.JFrame {

    /**
     * Creates new form PortalInstituciones
     */
    public FrmPortalInstituciones() {
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

        pnlFondo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        lblDireccionReporte = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        jlbColonia = new javax.swing.JLabel();
        jlbCalle = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        JPasswordNip = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setMinimumSize(new java.awt.Dimension(600, 400));
        pnlFondo.setPreferredSize(new java.awt.Dimension(600, 400));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        pnlFondo.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        lblHeader.setBackground(new java.awt.Color(10, 50, 6));
        lblHeader.setOpaque(true);
        pnlFondo.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        lblDireccionReporte.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        lblDireccionReporte.setForeground(new java.awt.Color(33, 33, 33));
        lblDireccionReporte.setText("Portal de Instituciones");
        pnlFondo.add(lblDireccionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Ingrese el ID y el NIP de la institucion de la que desea ingresar.");
        pnlFondo.add(jlbContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jlbColonia.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbColonia.setForeground(new java.awt.Color(33, 33, 33));
        jlbColonia.setText("NIP:");
        pnlFondo.add(jlbColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jlbCalle.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbCalle.setForeground(new java.awt.Color(33, 33, 33));
        jlbCalle.setText("ID:");
        pnlFondo.add(jlbCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        txtID.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(33, 33, 33));
        txtID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        pnlFondo.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 130, -1));

        btnContinuar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(181, 18, 57));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 104, 43));

        JPasswordNip.setText("jPasswordField1");
        pnlFondo.add(JPasswordNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     
    }//GEN-LAST:event_btnContinuarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordNip;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jlbCalle;
    private javax.swing.JLabel jlbColonia;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel lblDireccionReporte;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}