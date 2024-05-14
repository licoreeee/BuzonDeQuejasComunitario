package PantallasAvance;

import Excepciones.PersistenciaException;
import Pantallas.ControlNavegacion;
import dto.ComentarioDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import java.io.File;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import registrarAvance.IRegistrarAvance;
import registrarAvance.RegistrarAvance;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FrmCrearComentario extends javax.swing.JFrame {

    private ComentarioDTO comentarioDTO;
    private final IRegistrarAvance registrarAvance;
    byte[] photo;
    String fileName;
    ReporteDTO reporteDTO;
    private InstitucionRegistradaDTO institucionDTO;
    ControlNavegacion control = new ControlNavegacion();

    /**
     * Creates new form CrearComentario
     *
     * @param reporteDTO
     */
    public FrmCrearComentario(ReporteDTO reporteDTO, InstitucionRegistradaDTO institucionDTO) {
        initComponents();
        registrarAvance = new RegistrarAvance();
        photo = null;
        this.reporteDTO = reporteDTO;
        this.institucionDTO = institucionDTO;
        fileName = null;
        setDatosReporte();
    }

    private void setDatosReporte() {
        lblSubirImagen.setText("");
        lblTituloReporte.setText(reporteDTO.getTitulo());
        lblDireccionReporte.setText(reporteDTO.getCalle() + ", " + reporteDTO.getColonia());
        lblFolioReporte.setText("Folio: " + String.valueOf(reporteDTO.getFolio()));
        Calendar fechaCreacion = reporteDTO.getFechaCreacion();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String fechaFormateada = sdf.format(fechaCreacion.getTime());
        lblFechaHora.setText(fechaFormateada);
        String descripcion = reporteDTO.getDescripcion();
        if (descripcion.length() > 20) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < descripcion.length()) {
                sb.append(descripcion.substring(
                        i,
                        Math.min(i + 20, descripcion.length())));
                sb.append("<br>");
                i += 20;
            }
            lblDescripcionReporte.setText("<html>" + sb.toString() + "</html>");
        } else {
            lblDescripcionReporte.setText(descripcion);
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
        btnAtrás = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        lblSubirImagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear comentario");

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
        pnlFondo.add(lblDireccionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lblFolioReporte.setText("Folio: 48902");
        pnlFondo.add(lblFolioReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblFechaHora.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        lblFechaHora.setText("20/04/24 13:10");
        pnlFondo.add(lblFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        lblComentario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblComentario.setForeground(new java.awt.Color(33, 33, 33));
        lblComentario.setText("Imagen:");
        pnlFondo.add(lblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        lblTituloComentario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblTituloComentario.setForeground(new java.awt.Color(33, 33, 33));
        lblTituloComentario.setText("Título*:");
        pnlFondo.add(lblTituloComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(33, 33, 33));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        pnlFondo.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 280, -1));

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 290, 50));

        lblComentario1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblComentario1.setForeground(new java.awt.Color(33, 33, 33));
        lblComentario1.setText("Comentario*:");
        pnlFondo.add(lblComentario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        btnAtrás.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnAtrás.setForeground(new java.awt.Color(181, 18, 57));
        btnAtrás.setText("Atrás");
        btnAtrás.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnAtrás.setContentAreaFilled(false);
        btnAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrásActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 104, 43));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("formato jpg");
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        btnImagen.setText("Subir Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        pnlFondo.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        lblSubirImagen.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        lblSubirImagen.setText("path");
        pnlFondo.add(lblSubirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel2.setText("*Campo obligatorio.");
        pnlFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btnContinuar.setFont(new java.awt.Font("Inter Light", 0, 16)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(181, 18, 57));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 104, 43));

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

    private void btnComentariosReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentariosReporteActionPerformed
        control.mostrarComentariosReporte(reporteDTO, institucionDTO);
    }//GEN-LAST:event_btnComentariosReporteActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrásActionPerformed
        control.mostrarReportesPendientes(institucionDTO);
        dispose();
    }//GEN-LAST:event_btnAtrásActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        boolean isValid = cargarImagen();
        if (!isValid) {
            photo = null;
            lblSubirImagen.setText("");
            JOptionPane.showMessageDialog(
                    null,
                    "El archivo seleccionado no es una imagen con formato JPG",
                    "Formato de imagen inválido",
                    JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnImagenActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
 if (txtTitulo.getText().isBlank() || txtComentario.getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Llenar correctamente los espacios en blanco",
                    "Espacios vacíos",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (photo == null) {
                try {
                    comentarioDTO = new ComentarioDTO(
                            txtTitulo.getText(),
                            txtComentario.getText(),
                            reporteDTO.getFolio(),
                            new Date());
                    registrarAvance.registarComentario(comentarioDTO);
                    control.mostrarComentarioExitoso();
                    dispose();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(FrmCrearComentario.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(
                            null,
                            ex.getMessage(),
                            "Error de persistencia",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    comentarioDTO = new ComentarioDTO(
                            txtTitulo.getText(),
                            txtComentario.getText(),
                            photo,
                            reporteDTO.getFolio(),
                            new Date());
                    registrarAvance.registarComentario(comentarioDTO);
                    control.mostrarComentarioExitoso();
                    dispose();
                } catch (PersistenciaException e) {
                    Logger.getLogger(
                            FrmCrearComentario.class.getName()).log(
                            Level.SEVERE,
                            null,
                            e);
                    JOptionPane.showMessageDialog(
                            null,
                            e.getMessage(),
                            "Error de persistencia",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnContinuarActionPerformed
    private boolean isValidImage(String fileName) {
        return fileName.toLowerCase().endsWith(".jpg");
    }

    private boolean cargarImagen() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result != JFileChooser.APPROVE_OPTION) {
            // El usuario no seleccionó ningún archivo
            return false;
        }
        File file = chooser.getSelectedFile();
        fileName = file.getAbsolutePath();
        lblSubirImagen.setText(fileName);

        if (!isValidImage(fileName)) {
            return false;
        }

        File image = new File(fileName);
        try (FileInputStream fis = new FileInputStream(image)) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                baos.write(buf, 0, readNum);
            }
            photo = baos.toByteArray();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmCrearComentario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error al cargar la imágen",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(FrmCrearComentario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error al leer el archivo",
                    JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrás;
    private javax.swing.JButton btnComentariosReporte;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubirImagen;
    private javax.swing.JLabel lblTituloComentario;
    private javax.swing.JLabel lblTituloReporte;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
