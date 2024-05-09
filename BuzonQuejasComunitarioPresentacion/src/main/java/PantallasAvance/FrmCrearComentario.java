/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasAvance;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author hisam
 */
public class FrmCrearComentario extends javax.swing.JFrame {
byte[] photo = null;
String fileName = null;
    /**
     * Creates new form CrearComentario
     */
    public FrmCrearComentario() {
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
        lblH2 = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        btnComentariosReporte = new javax.swing.JButton();
        lblTituloReporte = new javax.swing.JLabel();
        lblDireccionReporte1 = new javax.swing.JLabel();
        lblDescripcionReporte = new javax.swing.JLabel();
        lblDireccionReporte = new javax.swing.JLabel();
        lblFolioReporte = new javax.swing.JLabel();
        lblFechaHora = new javax.swing.JLabel();
        lblComentario = new javax.swing.JLabel();
        lblTituloComentario = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        lblComentario1 = new javax.swing.JLabel();
        btnContinuar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblSubirImagen = new javax.swing.JLabel();

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

        lblH2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblH2.setForeground(new java.awt.Color(33, 33, 33));
        lblH2.setText("Reporte:");
        pnlFondo.add(lblH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Seleccione el reporte que le desea hacer modificaciones.");
        pnlFondo.add(jlbContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnComentariosReporte.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnComentariosReporte.setForeground(new java.awt.Color(181, 18, 57));
        btnComentariosReporte.setText("Comentarios reporte");
        btnComentariosReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnComentariosReporte.setContentAreaFilled(false);
        btnComentariosReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentariosReporteActionPerformed(evt);
            }
        });
        pnlFondo.add(btnComentariosReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 350, 170, 43));

        lblTituloReporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTituloReporte.setText("Fuga de Aguas Negras");
        pnlFondo.add(lblTituloReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        lblDireccionReporte1.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        lblDireccionReporte1.setForeground(new java.awt.Color(33, 33, 33));
        lblDireccionReporte1.setText("Comentario");
        pnlFondo.add(lblDireccionReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblDescripcionReporte.setText("Representa un peligro sanitario.");
        pnlFondo.add(lblDescripcionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblDireccionReporte.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDireccionReporte.setText("Av. Náinari #314, Col. Quinta Díaz, CP: 821900");
        pnlFondo.add(lblDireccionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblFolioReporte.setText("Folio: 48902");
        pnlFondo.add(lblFolioReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblFechaHora.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        lblFechaHora.setText("20/04/24 13:10");
        pnlFondo.add(lblFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblComentario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblComentario.setForeground(new java.awt.Color(33, 33, 33));
        lblComentario.setText("Imagen:");
        pnlFondo.add(lblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        lblTituloComentario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblTituloComentario.setForeground(new java.awt.Color(33, 33, 33));
        lblTituloComentario.setText("Título*:");
        pnlFondo.add(lblTituloComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(33, 33, 33));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        pnlFondo.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, -1));

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 290, 50));

        lblComentario1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblComentario1.setForeground(new java.awt.Color(33, 33, 33));
        lblComentario1.setText("Comentario*:");
        pnlFondo.add(lblComentario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        btnContinuar1.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnContinuar1.setForeground(new java.awt.Color(181, 18, 57));
        btnContinuar1.setText("Continuar");
        btnContinuar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnContinuar1.setContentAreaFilled(false);
        btnContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar1ActionPerformed(evt);
            }
        });
        pnlFondo.add(btnContinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 104, 43));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("*Campo obligatorio.");
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btnImagen.setText("Subir Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        pnlFondo.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        lblImagen.setText("jLabel2");
        pnlFondo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        lblSubirImagen.setText("jLabel2");
        pnlFondo.add(lblSubirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

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

    private void btnComentariosReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentariosReporteActionPerformed

    }//GEN-LAST:event_btnComentariosReporteActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar1ActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        lblImagen.setIcon(new ImageIcon(file.toString()));
        fileName = file.getAbsolutePath();
        lblSubirImagen.setText(fileName);
    }//GEN-LAST:event_btnImagenActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComentariosReporte;
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JButton btnImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblComentario1;
    private javax.swing.JLabel lblDescripcionReporte;
    private javax.swing.JLabel lblDireccionReporte;
    private javax.swing.JLabel lblDireccionReporte1;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblFolioReporte;
    private javax.swing.JLabel lblH2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubirImagen;
    private javax.swing.JLabel lblTituloComentario;
    private javax.swing.JLabel lblTituloReporte;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}