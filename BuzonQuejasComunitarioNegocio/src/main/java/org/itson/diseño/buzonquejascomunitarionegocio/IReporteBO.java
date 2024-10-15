package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ReporteDTO;
import entidades.Reporte;
import excepciones.NegociosException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IReporteBO {


    /**
     * Convierte un objeto ReporteDTO a un objeto Reporte.
     *
     * @param reporteDTO Objeto ReporteDTO a convertir.
     * @return Objeto Reporte convertido.
     */
    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException;

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException;

    /**
     * Obtiene todos los reportes abiertos por una institución.
     *
     * @param siglasInstitucion Siglas de la institución.
     * @return Lista de ReporteDTO de los reportes abiertos por la institución.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion(String idInstitucion) throws FindException;
    
    /**
     * Actualiza el estado de un reporte.
     *
     * @param reporteDTO Objeto ReporteDTO con el estado actualizado.
     * @throws PersistenciaException Si ocurre un error durante la actualización.
     */
    public void actualizarEstado(ReporteDTO reporteDTO) throws PersistenciaException;
    
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
    List<ReporteDTO> obtenerReportePorTitulo(String titulo, Calendar dia) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorInstitucion(String institucion, Calendar dia) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Calendar dia) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Calendar dia) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Calendar dia) throws FindException;
    
    /**
     * Convierte una lista de objetos Reporte a una lista de objetos ReporteDTO.
     *
     * @param reportes Lista de objetos Reporte a convertir.
     * @return Lista de objetos ReporteDTO convertidos.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    List<ReporteDTO> convertirReportesAEntidad(List<Reporte> reportes) throws NegociosException;
    
    /**
     * Convierte un objeto Date a un objeto Calendar sin incluir la hora.
     *
     * @param date Objeto Date a convertir.
     * @return Objeto Calendar sin la hora.
     */
    Calendar dateToCalendar(Date date);
    
    /**
     * Convierte un objeto Calendar a un objeto Date.
     *
     * @param calendar Objeto Calendar a convertir.
     * @return Objeto Date convertido.
     */
    Date calendarToDate(Calendar calendar);
    
    /**
     * Transporta datos de un ReporteDTO.
     *
     * @param reporteDTO El ReporteDTO a transportar.
     * @return El ReporteDTO transportado.
     * @throws NegociosException Si ocurre un error durante el transporte.
     */
    ReporteDTO transportarDatos(ReporteDTO reporteDTO) throws NegociosException;
    List<ReporteDTO> obtenerTodosLosReportes() throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorPeriodo(Calendar fechaInicio, Calendar fechaFin, Calendar dia) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorPeriodoYTitulo(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucionYIncidente(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion, String incidente) throws FindException;
    
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
    List<ReporteDTO> obtenerReportePorPeriodoYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String institucion) throws FindException;
}
