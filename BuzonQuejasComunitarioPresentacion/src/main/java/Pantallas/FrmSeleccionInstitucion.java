/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso.IFacadeLevantarReporte;

/**
 *
 * @author castr
 */
public class FrmSeleccionInstitucion extends javax.swing.JFrame {

    private IFacadeLevantarReporte fachadaLevantarReporte;
    private ControlNavegacion controladores;

    /**
     * Creates new form FrmSeleccionInstitucion
     */
    public FrmSeleccionInstitucion(IFacadeLevantarReporte fachadaLevantarReporte) {
        initComponents();
        obtenerInformacionInstitucion();
        this.fachadaLevantarReporte = fachadaLevantarReporte;
        this.controladores = new ControlNavegacion();
    }

    public void obtenerInformacionInstitucion() {
        String seleccionado = (String) cboSeleccionInstitucion.getSelectedItem();
        switch (seleccionado) {
            case "CFE":
                lblInformacionInstitucion.setText("Comision Federal de electricidad, problemas relacionados con la electricidad");
                break;
            case "OOMAPAS":
                lblInformacionInstitucion.setText("Organismo Operador Municipal de Agua Potable, Alcantarillado y Saneamiento, fugas de agua");
                break;
            case "Policia Municipal de Cajeme":
                lblInformacionInstitucion.setText("Cuestiones de seguridad o atencion en alguna zona que lo requiera");
                break;
            case "Residuos Sólidos Urbanos":
                lblInformacionInstitucion.setText("Cuestiones de desechos o basura en alguna zona que lo requiera");
                break;
            case "IMCYC":
                lblInformacionInstitucion.setText("nstituto Mexicano del Cemento y del Concreto, en caso de baches o problemas similares");
                break;
            default:
                lblInformacionInstitucion.setText("");
        }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();
        lblInformacionInstitucion = new javax.swing.JLabel();
        btnLevantarReporte = new javax.swing.JButton();
        btnAvances = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        cboSeleccionInstitucion = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        lblContenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 360));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paso 1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 450, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        lblDescripcion1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(110, 110, 110));
        lblDescripcion1.setText("Seleccione entre las instituciones disponibles las cuales considere son las indicadas para darle ");
        jPanel1.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 510, 20));

        lblDescripcion2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        lblDescripcion2.setForeground(new java.awt.Color(110, 110, 110));
        lblDescripcion2.setText("seguimiento al reporte.");
        jPanel1.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 500, 20));

        lblInformacionInstitucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblInformacionInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 500, -1));

        btnLevantarReporte.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnLevantarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnLevantarReporte.setText("Levantar Reporte");
        btnLevantarReporte.setBorder(null);
        btnLevantarReporte.setContentAreaFilled(false);
        jPanel1.add(btnLevantarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 130, -1));

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(255, 255, 255));
        btnAvances.setText("Avances");
        btnAvances.setBorder(null);
        btnAvances.setContentAreaFilled(false);
        jPanel1.add(btnAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        btnSiguiente.setBackground(new java.awt.Color(229, 229, 229));
        btnSiguiente.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(181, 18, 57));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 18, 57)));
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 110, 40));

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setBorder(null);
        btnHistorial.setContentAreaFilled(false);
        jPanel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        cboSeleccionInstitucion.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cboSeleccionInstitucion.setForeground(new java.awt.Color(33, 33, 33));
        cboSeleccionInstitucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CFE", "OOMAPAS", "Policia Municipal de Cajeme", "Residuos Sólidos Urbanos", "IMCYC" }));
        cboSeleccionInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSeleccionInstitucionActionPerformed(evt);
            }
        });
        jPanel1.add(cboSeleccionInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 250, 40));

        lblTitulo.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(33, 33, 33));
        lblTitulo.setText("Instituciones correspondientes");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblHeader.setBackground(new java.awt.Color(10, 50, 6));
        lblHeader.setOpaque(true);
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        lblContenido.setBackground(new java.awt.Color(255, 255, 255));
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
        obtenerInformacionInstitucion();
    }//GEN-LAST:event_cboSeleccionInstitucionActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        controladores.mostrarSeleccionIncidentes();
        dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (btnHistoriala SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//
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
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnLevantarReporte;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cboSeleccionInstitucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContenido;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInformacionInstitucion;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
