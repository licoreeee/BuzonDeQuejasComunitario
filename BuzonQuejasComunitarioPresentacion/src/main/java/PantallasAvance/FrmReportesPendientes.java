/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PantallasAvance;

import Pantallas.ControlNavegacion;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
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
    }
    public ActionListener botonValidar() {
        ActionListener validarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReporteDTO reporteSelec = gestionIncidencias.recuperarReportes().get(tablaReportes.getSelectedRow()) ;
                if (!reporteSelec.isValidado()) {
                    dispose() ;
                    System.out.println((reporteSelec.getAlumno().getNombre())) ;
                    FrmValidarReporte frmValidar = new FrmValidarReporte(gestionIncidencias, reporteSelec) ;
                    frmValidar.setVisible(true);
                } else {
                    JOptionPane.showConfirmDialog(new JFrame(), "Este reporte ya ha sido validado previamente", "Reporte Validado", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
                }
                
            }
        } ;
        
        return validarListener ;
    }
    
    
    
    
    
    public void refrescarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() ;
        List<ReporteDTO> reportes = gestionIncidencias.recuperarReportes() ;
        Object[] datosTabla = new Object[9];
        modeloTabla.addColumn("CURP");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Grado y Grupo");
        modeloTabla.addColumn("Fecha y Hora");
        modeloTabla.addColumn("Gravedad");
        modeloTabla.addColumn("Motivo");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Notificado");
        modeloTabla.addColumn("Validar");
        
        
        
        for (int i = 0; i < reportes.size(); i++) {
            datosTabla[0] = reportes.get(i).getAlumno().getCurp() ;
            datosTabla[1] = reportes.get(i).getAlumno().getNombre() ;
            datosTabla[2] = reportes.get(i).getAlumno().getGradoGrupo() ;
            datosTabla[3] = reportes.get(i).getFechaHora().getTime() ;
            datosTabla[4] = reportes.get(i).getNivelIncidencia() ;
            datosTabla[5] = reportes.get(i).getMotivo() ;
            datosTabla[6] = reportes.get(i).getDescripcion() ;
            if (reportes.get(i).isNotificado()) {
                datosTabla[7] = "NOTIFICADO" ;
            } else {
                datosTabla[7] = "PENDIENTE" ;
            }
            if (reportes.get(i).isValidado()) {
                datosTabla[8] = "VALIDADO" ;
            } 
            
            modeloTabla.addRow(datosTabla);
        }
        
        tablaReportes.setModel(modeloTabla);
        tablaReportes.setRowHeight(30);
        tablaReportes.getColumnModel().getColumn(8).setCellRenderer(new JButtonRenderer("Validar"));
        tablaReportes.getColumnModel().getColumn(8).setCellEditor(new JButtonCellEditor("Validar",botonValidar()));

    }

public class JButtonCellEditor implements TableCellEditor {

    private final JButton button;
    private int row;
    private ActionListener actionListener;

    public JButtonCellEditor(String text, ActionListener actionListener) {
        this.button = new JButton(text);
//        this.button.setFont(new Font("Sans Serif", Font.BOLD, 16));
//        this.button.setBackground(new Color(188, 149, 92));
//        this.button.setForeground(new Color(242, 242, 242));
        this.actionListener = actionListener;
        this.button.addActionListener((ActionEvent evt)->{
            this.actionListener.actionPerformed(
                new ActionEvent(this.button, ActionEvent.ACTION_PERFORMED, this.row+"")
            );
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row;
        return this.button;
    }

    @Override
    public Object getCellEditorValue() {
        return true;
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean stopCellEditing() {
        return true;
    }

    @Override
    public void cancelCellEditing() {}

    @Override
    public void addCellEditorListener(CellEditorListener l) {}

    @Override
    public void removeCellEditorListener(CellEditorListener l) {}
}
    
    public class JButtonRenderer implements TableCellRenderer {

    private final JButton button;

    public JButtonRenderer(String text) {
        this.button = new JButton(text);
//        this.button.setFont(new Font("Sans Serif", Font.BOLD, 16));
//        this.button.setBackground(new Color(188, 149, 92));
//        this.button.setForeground(new Color(242, 242, 242));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this.button;
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
