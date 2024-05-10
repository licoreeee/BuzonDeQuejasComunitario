/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import dto.IncidenteDTO;
import dto.InstitucionNuevaDTO;
import dto.ReporteDTO;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.diseño.levantarreportess.IFacadeLevantarReporte;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FrmInstitucionesRegistradas extends javax.swing.JFrame {

    private ControlNavegacion controladores;

    /**
     * Creates new form FrmSeleccionIncidentes
     */
    public FrmInstitucionesRegistradas() {
        initComponents();
        this.controladores = new ControlNavegacion();
//        this.institucion = institucion;
//        mostrarTabla(institucion.getIncidentes());
    }

//    public FrmInstitucionesRegistradas(ReporteDTO reporteDTO) {
//        this.reporteDTO = reporteDTO;
//    }
//
//    DefaultTableModel modeloTabla = new DefaultTableModel() {
//        @Override
//        public boolean isCellEditable(int row, int column) {
//            return false; // Hacer que todas las celdas sean no editables
//        }
//    };

//    private void mostrarTabla(List<IncidenteDTO> incidentes) {
//        modeloTabla.addColumn("Incidente");
//        Object[] datosTabla = new Object[1];
//
//        // Verificar si la lista de incidentes no es null antes de iterar sobre ella
//        if (incidentes != null) {
//            incidentes.forEach(institucionObtenida -> {
//                datosTabla[0] = institucionObtenida.getNombreIncidente();
//                modeloTabla.addRow(datosTabla);
//            });
//        }
//
//        tblInstitucionesRegistradas.setModel(modeloTabla);
//    }
//
//    private void obtenerDatosSeleccionados() {
//        int filaSeleccionada = tblInstitucionesRegistradas.getSelectedRow();
//
//        if (filaSeleccionada != -1) {
//            Object[] datosFila = new Object[tblInstitucionesRegistradas.getColumnCount()];
//
//            for (int i = 0; i < tblInstitucionesRegistradas.getColumnCount(); i++) {
//                datosFila[i] = tblInstitucionesRegistradas.getValueAt(filaSeleccionada, i);
//            }
//            IncidenteDTO incidenteDTO = new IncidenteDTO();
//            incidenteDTO.setNombreIncidente(datosFila[0].toString());
//        } else {
//            Logger.getLogger(FrmInstitucionesRegistradas.class.getName()).log(Level.SEVERE, "No se selecciono ningun elemento de la tabla");
//
//        }
//    }

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
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInstitucionesRegistradas = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_gobierno_mexico.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jLabel7.setBackground(new java.awt.Color(10, 50, 6));
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

        btnAgregar.setBackground(new java.awt.Color(241, 241, 241));
        btnAgregar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(181, 18, 57));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 18, 57)));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 107, 40));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Instituciones Registradas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 378, -1));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 110, 110));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Instituciones y organizaciones colaboradoras para las");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 350, -1));

        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 110, 110));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("funcionalidades y uso ciudadano publico.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 284, -1));

        tblInstitucionesRegistradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        tblInstitucionesRegistradas.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        tblInstitucionesRegistradas.setForeground(new java.awt.Color(33, 33, 33));
        tblInstitucionesRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instituciones"
            }
        ));
        tblInstitucionesRegistradas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblInstitucionesRegistradas.setGridColor(new java.awt.Color(110, 110, 110));
        tblInstitucionesRegistradas.setSelectionForeground(new java.awt.Color(33, 33, 33));
        tblInstitucionesRegistradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblInstitucionesRegistradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblInstitucionesRegistradas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 440, 210));

        btnSiguiente.setBackground(new java.awt.Color(241, 241, 241));
        btnSiguiente.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(181, 18, 57));
        btnSiguiente.setText("Salir");
        btnSiguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 18, 57)));
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 107, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 350));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        controladores.mostrarCodigoAdmin();
        dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        controladores.mostrarInfoInstitucion();
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInstitucionesRegistradas;
    // End of variables declaration//GEN-END:variables
}
