/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.itson.disenioSoftware.buzonQuejasComunitarioDominio.Incidente;
import javax.swing.table.DefaultTableModel;
import org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso.IFacadeLevantarReporte;

/**
 *
 * @author victo
 */
public class FrmSeleccionIncidentes extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ArrayList<Incidente> incidentes;
    private IFacadeLevantarReporte fachadaLevantarReporte;
    private ControlNavegacion controladores;
    
    
    /**
     * Creates new form FrSeleccionIncidentes
     * @param fachadaLevantarReporte
     */
    public FrmSeleccionIncidentes(IFacadeLevantarReporte fachadaLevantarReporte) {
        initComponents();
        this.fachadaLevantarReporte = fachadaLevantarReporte;
        this.controladores = new ControlNavegacion();
//        modelo = new DefaultTableModel();
//        modelo.addColumn("Nombre");
//        
//        JTable tblIncidentes = new JTable(modelo);
//        JScrollPane scrollPane = new JScrollPane(tblIncidentes);
//        
//        getContentPane().add(scrollPane);
//        
//        for (Incidente incidente : incidentes) {
//            Object[] fila = {incidente.getNombreIncidente()};
//            modelo.addRow(fila);
//        }
//        
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setVisible(true);
//        

    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel6 = new javax.swing.JLabel();
        btnLevantarReporte = new javax.swing.JButton();
        btnAvances = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncidentes = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLevantarReporte.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnLevantarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnLevantarReporte.setText("Levantar Reporte");
        btnLevantarReporte.setBorderPainted(false);
        btnLevantarReporte.setContentAreaFilled(false);
        getContentPane().add(btnLevantarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 50, -1, -1));

        btnAvances.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnAvances.setForeground(new java.awt.Color(255, 255, 255));
        btnAvances.setText("Avances");
        btnAvances.setBorderPainted(false);
        btnAvances.setContentAreaFilled(false);
        getContentPane().add(btnAvances, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        btnHistorial.setFont(new java.awt.Font("Inter Light", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        getContentPane().add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jLabel7.setBackground(new java.awt.Color(10, 50, 6));
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Incidentes encargados por OOMAPAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 378, -1));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 110, 110));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Seleccione entre los incidentes disponibles las cuales considere son las indicadas");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 564, -1));

        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 110, 110));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("para darle seguimiento al reporte.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 284, -1));

        tblIncidentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        tblIncidentes.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        tblIncidentes.setForeground(new java.awt.Color(33, 33, 33));
        tblIncidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Title 3"
            }
        ));
        tblIncidentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblIncidentes.setGridColor(new java.awt.Color(110, 110, 110));
        tblIncidentes.setSelectionForeground(new java.awt.Color(33, 33, 33));
        tblIncidentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblIncidentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblIncidentes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 573, 170));

        btnSiguiente.setBackground(new java.awt.Color(241, 241, 241));
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
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 353, 107, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paso 2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 450, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 350));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        controladores.mostrarLevantarReporte();
        dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvances;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnLevantarReporte;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIncidentes;
    // End of variables declaration//GEN-END:variables
}
