package Pantallas;

import dto.IncidentesDTO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.diseno.subsistemaagregarincidentes.FacadeAgregarIncidentes;
import org.itson.diseno.subsistemaagregarincidentes.IFacadeAgregarIncidentes;
import org.itson.diseno.subsistemaagregarinstitucion.FacadeAgregarInstitucion;
import org.itson.diseno.subsistemaagregarinstitucion.IFacadeAgregarInstitucion;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FrmIncidentes extends javax.swing.JFrame {

    private final ControlNavegacion controladores;
    private final IFacadeAgregarIncidentes facadeIncidentes;
    private final IFacadeAgregarInstitucion facadeInstituciones;
    private final InstitucionNuevaDTO institucionNuevaDTO;
    private final InstitucionRegistradaDTO institucionRegistradaDTO;
    private boolean cambiosRealizados = false;

    /**
     * Creates new form FrmSeleccionIncidentes
     *
     *
     * @param institucionNuevaDTO
     */
    public FrmIncidentes(InstitucionNuevaDTO institucionNuevaDTO) {
        this.controladores = new ControlNavegacion();
        this.facadeInstituciones = new FacadeAgregarInstitucion();
        this.facadeIncidentes = new FacadeAgregarIncidentes();
        this.institucionNuevaDTO = institucionNuevaDTO;
        this.institucionRegistradaDTO = null;
        initComponents();
    }

    /**
     * Creates new form FrmSeleccionIncidentes
     *
     *
     * @param institucionRegistradaDTO
     */
    public FrmIncidentes(InstitucionRegistradaDTO institucionRegistradaDTO) {
        this.controladores = new ControlNavegacion();
        this.facadeInstituciones = new FacadeAgregarInstitucion();
        this.facadeIncidentes = new FacadeAgregarIncidentes();
        this.institucionRegistradaDTO = institucionRegistradaDTO;
        this.institucionNuevaDTO = null;
        initComponents();
        agregarIncidentesAInstitucionRegistrada();
    }

    private void confirmarOperaciones() {
        if (institucionRegistradaDTO == null) { //FLUJO PRINCIPAL  
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas confirmar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "La acción se ha cancelado.");
            } else if (opcion == JOptionPane.YES_OPTION) {
                facadeInstituciones.agregarInstitucion(institucionNuevaDTO);
                agregarIncidentesAInstitucionNueva();
                JOptionPane.showMessageDialog(this, "La acción se ha confirmado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                controladores.mostrarConfirmado();
                dispose();
            }
        } else if (institucionNuevaDTO == null) { //FLUJO ALTERNATIVO
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas confirmar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "La acción se ha cancelado.");
            } else if (opcion == JOptionPane.YES_OPTION) {
                agregarIncidentesAInstitucionRegistrada();
                JOptionPane.showMessageDialog(this, "La acción se ha confirmado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                controladores.mostrarConfirmado();
                dispose();
            }
        }
    }

    private void actualizarTabla() {
        try {
            DefaultTableModel modeloTabla = (DefaultTableModel) tblIncidentes.getModel();
            modeloTabla.fireTableDataChanged();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la tabla de incidentes.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void agregarIncidentesAInstitucionRegistrada() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblIncidentes.getModel();
            List<String> incidentesActuales = new ArrayList<>();
            for (int i = 0; i < model.getRowCount(); i++) {
                incidentesActuales.add((String) model.getValueAt(i, 0));
            }
//            model.setRowCount(0);

            String id = institucionRegistradaDTO.getId();
            List<IncidentesDTO> listaIncidentesRegistrados = facadeIncidentes.consultarIncidentes(id);
            for (IncidentesDTO incidente : listaIncidentesRegistrados) {
                String informacion = incidente.getInformacion();

                if (!incidentesActuales.contains(informacion)) {
                    model.addRow(new Object[]{informacion});
                }
            }

            model.fireTableDataChanged();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarIncidentesAInstitucionNueva() {
        try {
            List<IncidentesDTO> listaIncidentes = new ArrayList<>();
            DefaultTableModel model = (DefaultTableModel) tblIncidentes.getModel();
            List<InstitucionRegistradaDTO> institucionesRegistradas = facadeInstituciones.consultarInstituciones();
            InstitucionRegistradaDTO institucionRegistrada = null;
            for (InstitucionRegistradaDTO inst : institucionesRegistradas) {
                if (inst.getCodigoGestion().equals(institucionNuevaDTO.getCodigoGestion())) {
                    institucionRegistrada = inst;
                    break;
                }
            }
            if (institucionRegistrada == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la institución correspondiente.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                String informacion = (String) model.getValueAt(i, 0);
                IncidentesDTO incidente = new IncidentesDTO();
                incidente.setInformacion(informacion);
                incidente.setInstitucionRegistradaDTO(institucionRegistrada);
                listaIncidentes.add(incidente);
            }
            facadeIncidentes.agregarIncidentes(listaIncidentes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema mientras se agregaban incidentes.", "Error", JOptionPane.ERROR_MESSAGE);
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarNuevo = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncidentes = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
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

        btnAgregarNuevo.setBackground(new java.awt.Color(241, 241, 241));
        btnAgregarNuevo.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnAgregarNuevo.setForeground(new java.awt.Color(181, 18, 57));
        btnAgregarNuevo.setText("Nuevo");
        btnAgregarNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 18, 57)));
        btnAgregarNuevo.setContentAreaFilled(false);
        btnAgregarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 107, 40));

        btnConfirmar.setBackground(new java.awt.Color(241, 241, 241));
        btnConfirmar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(181, 18, 57));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 18, 57)));
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 107, 40));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Incidentes de institución");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 378, -1));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 110, 110));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Aquí se pueden agregar los incidentes para la institucion.");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, -1));

        tblIncidentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        tblIncidentes.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        tblIncidentes.setForeground(new java.awt.Color(33, 33, 33));
        tblIncidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incidentes"
            }
        ));
        tblIncidentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblIncidentes.setGridColor(new java.awt.Color(110, 110, 110));
        tblIncidentes.setSelectionForeground(new java.awt.Color(33, 33, 33));
        tblIncidentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblIncidentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblIncidentes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 440, 210));

        btnVolver.setBackground(new java.awt.Color(241, 241, 241));
        btnVolver.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(181, 18, 57));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 18, 57)));
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 107, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 350));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if (institucionRegistradaDTO == null) { //FLUJO PRINCIPAL
            controladores.mostrarInfoInstitucion();
            dispose();
        } else if (institucionNuevaDTO == null) { //FLUJO ALTERNATIVO 
            controladores.mostrarInstitucionesRegistradas();
            dispose();
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (!cambiosRealizados) {
            JOptionPane.showMessageDialog(this, "No se han realizado cambios.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            confirmarOperaciones();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAgregarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNuevoActionPerformed
        String nuevoIncidente = JOptionPane.showInputDialog(this, "Ingrese la informacion del nuevo incidente:");
        if (nuevoIncidente == null) {
            return;
        } else if (nuevoIncidente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un incidente correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblIncidentes.getModel();
            model.addRow(new Object[]{nuevoIncidente});
            actualizarTabla();
            cambiosRealizados = true;
        }
    }//GEN-LAST:event_btnAgregarNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarNuevo;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIncidentes;
    // End of variables declaration//GEN-END:variables
}
