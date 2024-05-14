//package org.itson.diseño.buzonquejascomunitarionegocio;
//
//import Excepciones.FindException;
//import Excepciones.PersistenciaException;
//import conexion.Conexion;
//import conexion.IConexion;
//import dao.IReportesDAO;
//import dao.ReportesDAO;
//import dto.ComentarioDTO;
//import dto.ReporteDTO;
//import entidades.Reporte;
//import excepciones.NegociosException;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import org.bson.types.Binary;
//import org.bson.types.ObjectId;
//
///**
// * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
// */
//public class ReporteBO implements IReporteBO {
//
//    private final IReportesDAO reportesDAO;
//    final IConexion conexion;
//
//    public ReporteBO() {
//        conexion = new Conexion();
//        reportesDAO = new ReportesDAO(conexion);
//    }
//
//    @Override
//
//    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) {
//        Date date = reporteDTO.getFechaCreacion().getTime();
//        Reporte reporte = new Reporte(reporteDTO.getFolio(),
//                reporteDTO.getTitulo(),
//                reporteDTO.getDescripcion(),
//                date);
//        reporte.setId(new ObjectId(reporteDTO.getId()));
//        reporte.setPhoto(new Binary(reporteDTO.getPhoto()));
//        return reporte;
//    }
//
//    @Override
//    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException {
//        byte[] photo = null;
//        Calendar calendar = null;
//        if (reporte.getPhoto() != null) {
//            photo = reporte.getPhoto().getData();
//        }
//        calendar.setTime(reporte.getFechaCreacion());
//        ReporteDTO reporteDTO = new ReporteDTO(reporte.getId().toString(), reporte.getFolio(), reporte.getTitulo(),
//                reporte.getDescripcion(), calendar, photo);
//        return reporteDTO;
//    }
//
//    @Override
//    public boolean validarFormatoDTO(ReporteDTO reporteDTO) throws NegociosException {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion(String siglasInstitucion) throws FindException {
//        try {
//            Calendar calendar = null;
//            List<ReporteDTO> reportesDTO = new ArrayList<>();
//            List<Reporte> reportes = reportesDAO.obtenerReportePorInstitucion(siglasInstitucion);
//            if (!reportes.isEmpty()) {
//                for (Reporte reporte : reportes) {
//                    if (reporte.getEstado()) {
//                        calendar.setTime(reporte.getFechaCreacion());
//                        ReporteDTO reporteDTO = new ReporteDTO(
//                                reporte.getFolio(),
//                                reporte.getTitulo(),
//                                reporte.getDescripcion(),
//                                calendar,
//                                reporte.getEstado(),
//                                reporte.getCalle(),
//                                reporte.getColonia());
//
//                        reportesDTO.add(reporteDTO);
//                    }
//                }
//                if (!reportesDTO.isEmpty()) {
//                    return reportesDTO;
//                } else {
//                    throw new FindException("No se encontró ningún reporte abierto.");
//                }
//            } else {
//                throw new FindException("No se encontró ningún reporte, intente más tarde.");
//            }
//        } catch (FindException e) {
//            throw e;
//        }
//    }
//
//    @Override
//    public void actualizarEstado(ReporteDTO reporteDTO) throws PersistenciaException{
//        ObjectId id = new ObjectId(reporteDTO.getId()); 
//        Reporte reporte = new Reporte(
//                id,
//                reporteDTO.getEstado());
//        try {
//            reportesDAO.actualizarEstado(reporte);
//        } catch (PersistenciaException ex) {
//            throw ex;
//        }
//    }
//
//
//}
