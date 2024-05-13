/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasAvance;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import Pantallas.ControlNavegacion;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import org.itson.diseño.levantarreportess.IRegistrarAvance;
import org.itson.diseño.levantarreportess.RegistrarAvance;

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
        consultarComentariosInstitucion(institucionDTO);
        TablaReportesPendientes.setDefaultEditor(Object.class, null);
    }

    private void consultarComentariosInstitucion(InstitucionRegistradaDTO institucionDTO) {
        try {
            reportesDTO = registrarAvance.obtenerIncidentesAbiertosPorInstitucion(institucionDTO.getSiglas());
            insertarReportesEnTabla(reportesDTO);
        } catch (FindException ex) {
            Logger.getLogger(FrmReportesPendientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error con los reportes",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void insertarReportesEnTabla(List<ReporteDTO> reportes) {
        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 5 || columnIndex == 6) {
                    return JButton.class;
                } else {
                    return super.getColumnClass(columnIndex);
                }
            }
        };
        model.addColumn("Folio");
        model.addColumn("Título");
        model.addColumn("Descripción");
        model.addColumn("Calle");
        model.addColumn("Colonia");
        model.addColumn("Cerrar");
        model.addColumn("Comentar");

        for (ReporteDTO reporteDTO : reportes) {
            Object[] rowData = {
                reporteDTO.getFolio(),
                reporteDTO.getTitulo(),
                reporteDTO.getDescripcion(),
                reporteDTO.getCalle(),
                reporteDTO.getColonia(),
                botonCerrar(reporteDTO),
                botonComentar(reporteDTO.getId())
            };
            model.addRow(rowData);
        }

        TablaReportesPendientes.setModel(model);
    }

    private JButton botonCerrar(ReporteDTO reporteDTO) {
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener((ActionEvent e) -> {

            cerrarReporte(reporteDTO);
        });
        return btnCerrar;
    }

    private JButton botonComentar(String id) {
        JButton btnComentar = new JButton("Comentar");
        btnComentar.addActionListener((ActionEvent e) -> {
            comentarReporte(id);
        });
        return btnComentar;
    }

    private void cerrarReporte(ReporteDTO reporteDTO) {
        try {
            registrarAvance.actualizarEstado(reporteDTO);
        } catch (PersistenciaException ex) {
            Logger.getLogger(FrmReportesPendientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para comentar un reporte
    private void comentarReporte(String id) {
        control.mostrarCrearComentario();
        dispose();
    }

    public void refrescarTabla(List<ReporteDTO> reportes) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            reportesDTO = registrarAvance.obtenerIncidentesAbiertosPorInstitucion(institucionDTO.getId());
            Object[] datosTabla = new Object[9];
            model.addColumn("Folio");
            model.addColumn("Título");
            model.addColumn("Descripción");
            model.addColumn("Calle");
            model.addColumn("Colonia");
            model.addColumn("Cerrar");
            model.addColumn("Comentar");

            for (ReporteDTO reporteDTO : reportes) {
                Object[] rowData = {
                    reporteDTO.getFolio(),
                    reporteDTO.getTitulo(),
                    reporteDTO.getDescripcion(),
                    reporteDTO.getCalle(),
                    reporteDTO.getColonia(),
                    botonCerrar(reporteDTO),
                    botonComentar(reporteDTO.getId())
                };
                model.addRow(rowData);
            }

        

        TablaReportesPendientes.setModel(model);
        TablaReportesPendientes.setRowHeight(30);
        TablaReportesPendientes.getColumnModel().getColumn(5).setCellRenderer(new JButtonRenderer());
        TablaReportesPendientes.getColumnModel().getColumn(6).setCellEditor(new JButtonCellEditor());
    }
    catch (FindException ex) {
            Logger.getLogger(FrmReportesPendientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error con los reportes",
                    JOptionPane.ERROR_MESSAGE);
    }
}

public class JButtonCellEditor extends AbstractCellEditor implements TableCellEditor {

    private final JButton button;

    public JButtonCellEditor() {
        this.button = new JButton("Validar");
        this.button.addActionListener((ActionEvent evt) -> {
            // Aquí iría la lógica para validar el reporte correspondiente
            stopCellEditing();
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return this.button;
    }

    @Override
    public Object getCellEditorValue() {
        return true;
    }
}

public class JButtonRenderer extends JButton implements TableCellRenderer {

    public JButtonRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
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

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 560, 220));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaReportesPendientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbContexto;
    private javax.swing.JLabel lblDireccionReporte;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
