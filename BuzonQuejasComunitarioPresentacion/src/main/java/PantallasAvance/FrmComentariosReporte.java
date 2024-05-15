/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasAvance;

import Excepciones.FindException;
import Pantallas.ControlNavegacion;
import dto.ComentarioDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registrarAvance.IRegistrarAvance;
import registrarAvance.RegistrarAvance;

/**
 *
 * @author hisam
 */
public class FrmComentariosReporte extends javax.swing.JFrame {

    ControlNavegacion control = new ControlNavegacion();
    ReporteDTO reporteDTO;
    InstitucionRegistradaDTO institucionDTO;
    IRegistrarAvance registrarAvance;
    List<ComentarioDTO> comentariosDTO;

    public FrmComentariosReporte(ReporteDTO reporteDTO, InstitucionRegistradaDTO institucionDTO) {
        initComponents();
        registrarAvance = new RegistrarAvance();
        comentariosDTO = new ArrayList<>();
        this.reporteDTO = reporteDTO;
        TablaReportesPendientes.setRowHeight(28);
        comentariosReporte(reporteDTO);

    }

    private void comentariosReporte(ReporteDTO reporteDTO) {
        try {
            comentariosDTO = registrarAvance.consultarComentarios(reporteDTO);
            llenarTabla();
        } catch (FindException ex) {
            Logger.getLogger(FrmComentariosReporte.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    this,
                    "No existen comentarios",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Título");
        model.addColumn("Descripción");
        model.addColumn("Fecha de Creación");
        model.addColumn("Imágen");

        for (ComentarioDTO comentario : comentariosDTO) {
            model.addRow(new Object[]{
                comentario.getTitulo(),
                comentario.getComentario(),
                comentario.getFechaCreacion(),
                comentario.getPhoto(),});
        }

        TablaReportesPendientes.setModel(model);
        TablaReportesPendientes.setDefaultEditor(Object.class, null);
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
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReportesPendientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comentarios del reporte");

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
        lblDireccionReporte.setText("Comentarios del reporte");
        pnlFondo.add(lblDireccionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Fuga de aguas negras");
        pnlFondo.add(jlbContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnAceptar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(181, 18, 57));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 104, 43));

        TablaReportesPendientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaReportesPendientes);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 560, 140));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        control.mostrarCrearComentario(reporteDTO, institucionDTO);
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaReportesPendientes;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel lblDireccionReporte;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
