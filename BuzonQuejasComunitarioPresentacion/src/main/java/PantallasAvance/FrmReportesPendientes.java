package PantallasAvance;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import Pantallas.ControlNavegacion;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public class FrmReportesPendientes extends javax.swing.JFrame {

    ControlNavegacion control;
    IRegistrarAvance registrarAvance;
    InstitucionRegistradaDTO institucionDTO;
    List<ReporteDTO> reportesDTO;

    public FrmReportesPendientes(InstitucionRegistradaDTO institucionDTO) {
        initComponents();
        control = new ControlNavegacion();
        this.institucionDTO = institucionDTO;
        registrarAvance = new RegistrarAvance();
        reportesDTO = new ArrayList<>();
        llenarTabla(institucionDTO);
    }

    public void llenarTabla(InstitucionRegistradaDTO institucionDTO) {
        try {
            reportesDTO = registrarAvance.obtenerReportesAbiertosPorInstitucion(institucionDTO.getSiglas());
        } catch (FindException ex) {
            Logger.getLogger(FrmReportesPendientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;

        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Folio");
        model.addColumn("Título");
        model.addColumn("Descripción");
        model.addColumn("Fecha de Creación");
        model.addColumn("Calle");
        model.addColumn("Colonia");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm");

        for (ReporteDTO reporte : reportesDTO) {

            String formattedDate = sdf.format(reporte.getFechaCreacion().getTime());

            model.addRow(new Object[]{
                reporte.getFolio(),
                reporte.getTitulo(),
                reporte.getDescripcion(),
                formattedDate,
                reporte.getCalle(),
                reporte.getColonia()
            });
        }

        TablaReportesPendientes.setModel(model);
        TablaReportesPendientes.setDefaultEditor(Object.class, null);
    }

    private void btnComentario() {
        int filaSeleccionada = TablaReportesPendientes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar un reporte.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String folioString = TablaReportesPendientes.getValueAt(filaSeleccionada, 0).toString();
            Integer folio = Integer.valueOf(folioString);
            String titulo = TablaReportesPendientes.getValueAt(filaSeleccionada, 1).toString();
            String descripcion = TablaReportesPendientes.getValueAt(filaSeleccionada, 2).toString();
            String fechaString = TablaReportesPendientes.getValueAt(filaSeleccionada, 3).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Calendar fechaCreacion = Calendar.getInstance();
            try {
                Date fechaDate = sdf.parse(fechaString);
                fechaCreacion.setTime(fechaDate);

            } catch (ParseException ex) {
                Logger.getLogger(FrmReportesPendientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            String calle = TablaReportesPendientes.getValueAt(filaSeleccionada, 4).toString();
            String colonia = TablaReportesPendientes.getValueAt(filaSeleccionada, 5).toString();
            ReporteDTO reporteDTOSeleccionado = new ReporteDTO(
                    folio, titulo, descripcion, fechaCreacion, calle, colonia);
            control.mostrarCrearComentario(reporteDTOSeleccionado);
            dispose();
        }
    }

    private void btnCerrar() {
        int filaSeleccionada = TablaReportesPendientes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debe seleccionar un reporte.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String folioString = TablaReportesPendientes.getValueAt(filaSeleccionada, 0).toString();
            Integer folio = Integer.valueOf(folioString);

            ReporteDTO reporteDTOSeleccionado = new ReporteDTO(
                    folio, true);

            try {
                registrarAvance.actualizarEstado(reporteDTOSeleccionado);
            } catch (PersistenciaException ex) {
                Logger.getLogger(FrmReportesPendientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        actualizarTabla();
    }

    private void actualizarTabla() {
        try {
            List<ReporteDTO> reportesActivos = new ArrayList<>();
            for (ReporteDTO reporte : reportesDTO) {
                if (reporte.getEstado()) {
                    reportesActivos.add(reporte);
                }
            }
            DefaultTableModel modeloTabla = (DefaultTableModel) TablaReportesPendientes.getModel();
            modeloTabla.fireTableDataChanged();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Error al actualizar la tabla de incidentes.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
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

        pnlFondo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        lblDireccionReporte = new javax.swing.JLabel();
        jlbContexto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReportesPendientes = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnComentar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes pendientes");

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
        lblDireccionReporte.setText("Reportes pendientes");
        pnlFondo.add(lblDireccionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jlbContexto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jlbContexto.setForeground(new java.awt.Color(110, 110, 110));
        jlbContexto.setText("Seleccione el reporte que le desea hacer modificaciones.");
        pnlFondo.add(jlbContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

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

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 560, 160));

        btnCerrar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(181, 18, 57));
        btnCerrar.setText("Cerrar reporte");
        btnCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 350, 120, 43));

        btnComentar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnComentar.setForeground(new java.awt.Color(181, 18, 57));
        btnComentar.setText("Comentar");
        btnComentar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnComentar.setContentAreaFilled(false);
        btnComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnComentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 104, 43));

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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        btnCerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarActionPerformed
        btnComentario();
    }//GEN-LAST:event_btnComentarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaReportesPendientes;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComentar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel lblDireccionReporte;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
