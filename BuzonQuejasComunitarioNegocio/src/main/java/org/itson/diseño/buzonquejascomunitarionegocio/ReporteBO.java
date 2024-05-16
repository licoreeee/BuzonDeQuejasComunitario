package org.itson.diseño.buzonquejascomunitarionegocio;

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

    /**
     * Convierte un objeto ReporteDTO a un objeto Reporte.
     *
     * @param reporteDTO Objeto ReporteDTO a convertir.
     * @return Objeto Reporte convertido.
     */
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

    /**
     * Convierte un objeto Reporte a un objeto ReporteDTO.
     *
     * @param reporte Objeto Reporte a convertir.
     * @return Objeto ReporteDTO convertido.
     * @throws NegociosException Si ocurre un error en la conversión.
     */
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

    /**
     * Obtiene todos los reportes abiertos por una institución.
     *
     * @param siglasInstitucion Siglas de la institución.
     * @return Lista de ReporteDTO de los reportes abiertos por la institución.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
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

    /**
     * Actualiza el estado de un reporte.
     *
     * @param reporteDTO Objeto ReporteDTO con el estado actualizado.
     * @throws PersistenciaException Si ocurre un error durante la actualización.
     */
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

    /**
     * Convierte una lista de objetos Reporte a una lista de objetos ReporteDTO.
     *
     * @param reportes Lista de objetos Reporte a convertir.
     * @return Lista de objetos ReporteDTO convertidos.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
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

    /**
     * Convierte un objeto Date a un objeto Calendar sin incluir la hora.
     *
     * @param date Objeto Date a convertir.
     * @return Objeto Calendar sin la hora.
     */
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

    /**
     * Convierte un objeto Calendar a un objeto Date.
     *
     * @param calendar Objeto Calendar a convertir.
     * @return Objeto Date convertido.
     */
    @Override
    public Date calendarToDate(Calendar calendar) {
        return calendar.getTime();
    }

    /**
     * Obtiene una lista de reportes por título y fecha.
     *
     * @param titulo Título del reporte a buscar.
     * @param dia Fecha del reporte a buscar.
     * @return Lista de ReporteDTO que coinciden con el título y la fecha
     * especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
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

    /**
     * Obtiene una lista de reportes por institución y fecha.
     *
     * @param institucion Institución asociada a los reportes a buscar.
     * @param dia Fecha de los reportes a buscar.
     * @return Lista de ReporteDTO que coinciden con la institución y la fecha
     * especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
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

    /**
     * Obtiene una lista de reportes por título, institución y fecha.
     *
     * @param titulo Título del reporte a buscar.
     * @param institucion Institución asociada al reporte a buscar.
     * @param dia Fecha del reporte a buscar.
     * @return Lista de ReporteDTO que coinciden con el título, la institución y
     * la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
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

    /**
     * Obtiene una lista de reportes por institución, incidente y fecha.
     *
     * @param institucion Institución asociada a los reportes a buscar.
     * @param incidente Tipo de incidente asociado a los reportes a buscar.
     * @param dia Fecha de los reportes a buscar.
     * @return Lista de ReporteDTO que coinciden con la institución, el
     * incidente y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
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

    /**
     * Obtiene una lista de reportes por título, institución, incidente y fecha.
     *
     * @param titulo Título del reporte a buscar.
     * @param institucion Institución asociada al reporte a buscar.
     * @param incidente Tipo de incidente asociado al reporte a buscar.
     * @param dia Fecha del reporte a buscar.
     * @return Lista de ReporteDTO que coinciden con el título, la institución,
     * el incidente y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
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

    /**
     * Obtiene una lista de todos los reportes.
     *
     * @return Lista de todos los ReporteDTO disponibles.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
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

    /**
     * Transporta datos de un ReporteDTO.
     *
     * @param reporteDTO El ReporteDTO a transportar.
     * @return El ReporteDTO transportado.
     * @throws NegociosException Si ocurre un error durante el transporte.
     */
    @Override
    public ReporteDTO transportarDatos(ReporteDTO reporteDTO) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Obtiene una lista de reportes por período de tiempo.
     *
     * @param fechaInicio Fecha de inicio del período.
     * @param fechaFin Fecha de fin del período.
     * @param dia Fecha de los reportes a buscar dentro del período.
     * @return Lista de ReporteDTO que coinciden con el período y la fecha
     * especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
    @Override
    public List<ReporteDTO> obtenerReportePorPeriodo(Calendar fechaInicio, Calendar fechaFin, Calendar dia) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            Date inicioDate = calendarToDate(fechaInicio);
            Date finDate = calendarToDate(fechaFin);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorPeriodo(inicioDate, finDate, diaDate));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    /**
     * Obtiene una lista de reportes por período de tiempo y título.
     *
     * @param fechaInicio Fecha de inicio del período.
     * @param fechaFin Fecha de fin del período.
     * @param dia Fecha de los reportes a buscar dentro del período.
     * @param titulo Título del reporte a buscar.
     * @return Lista de ReporteDTO que coinciden con el período, la fecha y el
     * título especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYTitulo(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            Date inicioDate = calendarToDate(fechaInicio);
            Date finDate = calendarToDate(fechaFin);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorPeriodoYTitulo(inicioDate, finDate, diaDate, titulo));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    /**
     * Obtiene una lista de reportes por período de tiempo, título e
     * institución.
     *
     * @param fechaInicio Fecha de inicio del período.
     * @param fechaFin Fecha de fin del período.
     * @param dia Fecha de los reportes a buscar dentro del período.
     * @param titulo Título del reporte a buscar.
     * @param institucion Institución asociada al reporte a buscar.
     * @return Lista de ReporteDTO que coinciden con el período, la fecha, el
     * título y la institución especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            Date inicioDate = calendarToDate(fechaInicio);
            Date finDate = calendarToDate(fechaFin);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorPeriodoYTituloYInstitucion(inicioDate, finDate, diaDate, titulo, institucion));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    /**
     * Obtiene una lista de reportes por período de tiempo, título, institución
     * e incidente.
     *
     * @param fechaInicio Fecha de inicio del período.
     * @param fechaFin Fecha de fin del período.
     * @param dia Fecha de los reportes a buscar dentro del período.
     * @param titulo Título del reporte a buscar.
     * @param institucion Institución asociada al reporte a buscar.
     * @param incidente Tipo de incidente asociado al reporte a buscar.
     * @return Lista de ReporteDTO que coinciden con el período, la fecha, el
     * título, la institución y el incidente especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucionYIncidente(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion, String incidente) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            Date inicioDate = calendarToDate(fechaInicio);
            Date finDate = calendarToDate(fechaFin);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorPeriodoYTituloYInstiticionYIncidente(inicioDate, finDate, diaDate, titulo, institucion, incidente));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

    /**
     * Obtiene una lista de reportes por período de tiempo e institución.
     *
     * @param fechaInicio Fecha de inicio del período.
     * @param fechaFin Fecha de fin del período.
     * @param dia Fecha de los reportes a buscar dentro del período.
     * @param institucion Institución asociada a los reportes a buscar.
     * @return Lista de ReporteDTO que coinciden con el período, la fecha y la
     * institución especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la
     * búsqueda.
     */
    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String institucion) throws FindException {
        try {
            Date diaDate = calendarToDate(dia);
            Date inicioDate = calendarToDate(fechaInicio);
            Date finDate = calendarToDate(fechaFin);
            List<ReporteDTO> reportesDTO = convertirReportesAEntidad(reportesDAO.obtenerReportePorPeriodoYInstitucion(inicioDate, finDate, diaDate, institucion));
            return reportesDTO;
        } catch (NegociosException ex) {
            new NegociosException().getMessage();
        }
        return null;
    }

}
