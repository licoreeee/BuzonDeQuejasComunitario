package negocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.IReportesDAO;
import dao.ReportesDAO;
import dto.ReporteDTO;
import entidades.Reporte;
import excepciones.NegociosException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ReporteBO implements IReporteBO {

    private final IReportesDAO reportesDAO;
    final IConexion conexion;

    public ReporteBO() {
        conexion = new Conexion();
        reportesDAO = new ReportesDAO(conexion);
    }

    @Override

    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) {
        Date date = reporteDTO.getFechaCreacion().getTime();
        Reporte reporte = new Reporte(reporteDTO.getFolio(),
                reporteDTO.getTitulo(),
                reporteDTO.getDescripcion(),
                date);
        reporte.setId(new ObjectId(reporteDTO.getId()));
        reporte.setPhoto(new Binary(reporteDTO.getPhoto()));
        return reporte;
    }

    @Override
    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException {
        byte[] photo = null;
        Calendar calendar = null;
        if (reporte.getPhoto() != null) {
            photo = reporte.getPhoto().getData();
        }
        calendar.setTime(reporte.getFechaCreacion());
        ReporteDTO reporteDTO = new ReporteDTO(reporte.getId().toString(), reporte.getFolio(), reporte.getTitulo(),
                reporte.getDescripcion(), calendar, photo);
        return reporteDTO;
    }

    @Override
    public boolean validarFormatoDTO(ReporteDTO reporteDTO) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion(String siglasInstitucion) throws FindException {

        List<ReporteDTO> reportesDTO = new ArrayList<>();
        List<Reporte> reportes = reportesDAO.obtenerReportePorInstitucion(siglasInstitucion);
        if (!reportes.isEmpty()) {
            for (Reporte reporte : reportes) {
                if (reporte.getEstado()) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(reporte.getFechaCreacion());
                    ReporteDTO reporteDTO = new ReporteDTO(
                            reporte.getFolio(),
                            reporte.getTitulo(),
                            reporte.getDescripcion(),
                            calendar,
                            reporte.getEstado(),
                            reporte.getCalle(),
                            reporte.getColonia());

                    reportesDTO.add(reporteDTO);
                }
            }
            return reportesDTO;

        } else {
            throw new FindException("No se encontró ningún reporte, intente más tarde.");
        }
    }

    @Override
    public void actualizarEstado(ReporteDTO reporteDTO) throws PersistenciaException {
        Reporte reporte = new Reporte(
                reporteDTO.getFolio(),
                reporteDTO.getEstado());
        try {
            reportesDAO.actualizarEstado(reporte);
        } catch (PersistenciaException ex) {
            throw ex;
        }
    }

    @Override
    public List<ReporteDTO> convertirReportesAEntidad(List<Reporte> reportes) throws NegociosException {
        List<ReporteDTO> reportesDTO = new ArrayList<>();
        for (Reporte reporte : reportes) {
            ReporteDTO reporteDTO = new ReporteDTO(
                    reporte.getId().toString(),
                    reporte.getTitulo(),
                    reporte.getEstado());
            reporteDTO.setFechaCreacion(dateToCalendar(reporte.getFechaCreacion()));
            reportesDTO.add(reporteDTO);
        }
        return reportesDTO;
    }

    @Override
    public Calendar dateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar;
    }

    @Override
    public Date calendarToDate(Calendar calendar) {
        return calendar.getTime();
    }

    @Override
    public List<ReporteDTO> obtenerReportePorTitulo(String titulo, Calendar dia) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorTitulo(titulo, diaDate));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorInstitucion(String institucion, Calendar dia) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorInstitucion(institucion, diaDate));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Calendar dia) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorTituloYInstitucion(titulo, institucion, diaDate));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Calendar dia) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorInstitucionYIncidente(institucion, incidente, diaDate));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Calendar dia) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorTituloYInstitucionYIncidente(titulo, institucion, incidente, diaDate));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerTodosLosReportes() throws FindException {
        try {
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerTodosLosReportes());
            return reportesDTO ;
        } catch (Exception e) {
            new NegociosException().getMessage();
        }
        return null;
    }

    @Override
    public ReporteDTO transportarDatos(ReporteDTO reporteDTO) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
