/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasHistorial;

/**
 *
 * @author Dell
 */
public class FrmHistorial extends javax.swing.JFrame {

    /**
     * Creates new form FrmHistorial
     */
    public FrmHistorial() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAvances = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnAdminAcceso = new javax.swing.JButton();
        btnLevantarReporte2 = new javax.swing.JButton();
        logoGobiernoMexico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbHistorial = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        chkbxTitulo = new javax.swing.JCheckBox();
        chkbxFecha = new javax.swing.JCheckBox();
        chkbxInstitucion = new javax.swing.JCheckBox();
        chkbxIncidente = new javax.swing.JCheckBox();
        chkbxUbicacion = new javax.swing.JCheckBox();
        jlbContexto1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnGenerarPDF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();
        jlbContexto2 = new javax.swing.JLabel();
        jlbContexto3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(241, 241, 241));
        btnAvances.setText("Avances");
        btnAvances.setContentAreaFilled(false);
        btnAvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancesActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(241, 241, 241));
        btnHistorial.setText("Historial ");
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnAdminAcceso.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAdminAcceso.setForeground(new java.awt.Color(241, 241, 241));
        btnAdminAcceso.setText("Admin");
        btnAdminAcceso.setContentAreaFilled(false);
        btnAdminAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAccesoActionPerformed(evt);
            }
        });

        btnLevantarReporte2.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnLevantarReporte2.setForeground(new java.awt.Color(241, 241, 241));
        btnLevantarReporte2.setText("Levantar Reporte");
        btnLevantarReporte2.setContentAreaFilled(false);
        btnLevantarReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevantarReporte2ActionPerformed(evt);
            }
        });

        logoGobiernoMexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(10, 50, 6));
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlbHistorial.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jlbHistorial.setForeground(new java.awt.Color(33, 33, 33));
        jlbHistorial.setText("Historial de reportes");

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Seleccione los filtros con los que desee realizar la búsqueda.");

        chkbxTitulo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        chkbxTitulo.setForeground(new java.awt.Color(110, 110, 110));
        chkbxTitulo.setText("Título del reporte:");
        chkbxTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxTituloActionPerformed(evt);
            }
        });

        chkbxFecha.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        chkbxFecha.setForeground(new java.awt.Color(110, 110, 110));
        chkbxFecha.setText("Fecha de creación");
        chkbxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxFechaActionPerformed(evt);
            }
        });

        chkbxInstitucion.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        chkbxInstitucion.setForeground(new java.awt.Color(110, 110, 110));
        chkbxInstitucion.setText("Institución:");

        chkbxIncidente.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        chkbxIncidente.setForeground(new java.awt.Color(110, 110, 110));
        chkbxIncidente.setText("Incidente:");

        chkbxUbicacion.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        chkbxUbicacion.setForeground(new java.awt.Color(110, 110, 110));
        chkbxUbicacion.setText("Ubicación:");

        jlbContexto1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jlbContexto1.setForeground(new java.awt.Color(33, 33, 33));
        jlbContexto1.setText("Filtros:");

        jTextField1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(110, 110, 110));

        jComboBox1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(110, 110, 110));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(110, 110, 110));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(181, 18, 57));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGenerarPDF.setBackground(new java.awt.Color(181, 18, 57));
        btnGenerarPDF.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnGenerarPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarPDF.setText("Generar PDF...");
        btnGenerarPDF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        tblReportes.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tblReportes.setForeground(new java.awt.Color(110, 110, 110));
        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Título", "Estado", "Número de resultados", ""
            }
        ));
        tblReportes.setSelectionForeground(new java.awt.Color(110, 110, 110));
        jScrollPane2.setViewportView(tblReportes);

        jlbContexto2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jlbContexto2.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto2.setText("desde:");

        jlbContexto3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jlbContexto3.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto3.setText("hasta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlbContexto1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbContexto)
                            .addComponent(jlbHistorial))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkbxInstitucion)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbxIncidente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkbxTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(chkbxUbicacion)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkbxFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbContexto2)
                        .addGap(186, 186, 186)
                        .addComponent(jlbContexto3)
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jlbContexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbContexto1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbHistorial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxTitulo)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxUbicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxFecha)
                    .addComponent(jlbContexto2)
                    .addComponent(jlbContexto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxInstitucion)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxIncidente)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnLevantarReporte2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnAdminAcceso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(btnAvances))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(btnHistorial))
                    .addComponent(logoGobiernoMexico))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoGobiernoMexico)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLevantarReporte2)
                            .addComponent(btnAdminAcceso)
                            .addComponent(btnAvances)
                            .addComponent(btnHistorial))))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancesActionPerformed

    }//GEN-LAST:event_btnAvancesActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed

    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnAdminAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAccesoActionPerformed

    }//GEN-LAST:event_btnAdminAccesoActionPerformed

    private void btnLevantarReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevantarReporte2ActionPerformed

    }//GEN-LAST:event_btnLevantarReporte2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void chkbxTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxTituloActionPerformed

    private void chkbxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxFechaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAcceso;
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnLevantarReporte2;
    private javax.swing.JCheckBox chkbxFecha;
    private javax.swing.JCheckBox chkbxIncidente;
    private javax.swing.JCheckBox chkbxInstitucion;
    private javax.swing.JCheckBox chkbxTitulo;
    private javax.swing.JCheckBox chkbxUbicacion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel jlbContexto1;
    private javax.swing.JLabel jlbContexto2;
    private javax.swing.JLabel jlbContexto3;
    private javax.swing.JLabel jlbHistorial;
    private javax.swing.JLabel logoGobiernoMexico;
    private javax.swing.JTable tblReportes;
    // End of variables declaration//GEN-END:variables
}
