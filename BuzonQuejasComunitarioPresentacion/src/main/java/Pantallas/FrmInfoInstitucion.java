/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import dto.InstitucionNuevaDTO;
import javax.swing.JOptionPane;

/**
 * Ventana para ingresar información de la institución. Permite al usuario
 * ingresar el nombre, siglas y una descripción adicional de la institución.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FrmInfoInstitucion extends javax.swing.JFrame {

    private ControlNavegacion controladores;

    /**
     * Constructor de la clase FrmInfoInstitucion. Inicializa los componentes de
     * la interfaz gráfica y establece el controlador de navegación.
     */
    public FrmInfoInstitucion() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        cmpSiglas = new javax.swing.JTextField();
        jlbObligatorio = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcionAdicional = new javax.swing.JTextArea();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jlbTitulo.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(33, 33, 33));
        jlbTitulo.setText("Informacion Institucion");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 92, -1, -1));

        jlbNombre.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(33, 33, 33));
        jlbNombre.setText("Nombre*:");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Descripción adicional*:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Siglas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        cmpNombre.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpNombre.setForeground(new java.awt.Color(33, 33, 33));
        cmpNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNombreActionPerformed(evt);
            }
        });
        jPanel1.add(cmpNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 410, -1));

        cmpSiglas.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmpSiglas.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cmpSiglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpSiglasActionPerformed(evt);
            }
        });
        jPanel1.add(cmpSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 410, 30));

        jlbObligatorio.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        jlbObligatorio.setForeground(new java.awt.Color(110, 110, 110));
        jlbObligatorio.setText("*Campo obligatorio.");
        jPanel1.add(jlbObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        btnVolver.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(181, 18, 57));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 104, 43));

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
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 104, 43));

        txaDescripcionAdicional.setColumns(20);
        txaDescripcionAdicional.setRows(5);
        jScrollPane1.setViewportView(txaDescripcionAdicional);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 410, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void cmpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNombreActionPerformed

    private void cmpSiglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpSiglasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpSiglasActionPerformed

    /**
     * Método para manejar el evento de clic en el botón "Siguiente". Obtiene
     * los datos ingresados por el usuario, valida que el nombre y la
     * descripción no estén vacíos, y muestra la ventana de incidentes
     * correspondiente a la institución ingresada.
     *
     * @param evt Evento de acción del botón.
     */
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        String nombre = cmpNombre.getText();
        String siglas = cmpSiglas.getText();
        String descripcion = txaDescripcionAdicional.getText();

        if (nombre.isEmpty() || descripcion.isEmpty() || nombre.isBlank() || descripcion.isBlank() || siglas.isBlank()) {
            JOptionPane.showMessageDialog(this, "Es necesario ingresar el nombre y la descripción de la institución", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            if (siglas.isEmpty() || siglas.isBlank()) {
                InstitucionNuevaDTO institucionNuevaDTO = new InstitucionNuevaDTO();
                institucionNuevaDTO.setNombre(nombre);
                institucionNuevaDTO.setSiglas(null);
                institucionNuevaDTO.setDescripcionAdicional(descripcion);

                controladores.mostrarIncidentes(institucionNuevaDTO);
                dispose();
            } else {
                InstitucionNuevaDTO institucionNuevaDTO = new InstitucionNuevaDTO();
                institucionNuevaDTO.setNombre(nombre);
                institucionNuevaDTO.setSiglas(siglas);
                institucionNuevaDTO.setDescripcionAdicional(descripcion);

                controladores.mostrarIncidentes(institucionNuevaDTO);
                dispose();
            }
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * Método para manejar el evento de clic en el botón "Volver". Muestra la
     * ventana de instituciones registradas y cierra la ventana actual.
     *
     * @param evt Evento de acción del botón.
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        controladores.mostrarInstitucionesRegistradas();
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cmpNombre;
    private javax.swing.JTextField cmpSiglas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbObligatorio;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTextArea txaDescripcionAdicional;
    // End of variables declaration//GEN-END:variables
}
