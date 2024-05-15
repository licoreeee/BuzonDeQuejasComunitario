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


    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException;

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException;

    public boolean validarFormatoDTO(ReporteDTO reporteDTO) throws NegociosException;

    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion(String idInstitucion) throws FindException;
    
    public void actualizarEstado(ReporteDTO reporteDTO) throws PersistenciaException;
    
    List<ReporteDTO> obtenerReportePorTitulo(String titulo, Calendar dia) throws FindException;
    
    List<ReporteDTO> obtenerReportePorInstitucion(String institucion, Calendar dia) throws FindException;
    
    List<ReporteDTO> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Calendar dia) throws FindException;
    
    List<ReporteDTO> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Calendar dia) throws FindException;
    
    List<ReporteDTO> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Calendar dia) throws FindException;
    
    List<ReporteDTO> convertirReportesAEntidad(List<Reporte> reportes) throws NegociosException;
    
    Calendar dateToCalendar(Date date);
    
    Date calendarToDate(Calendar calendar);
    
    ReporteDTO transportarDatos(ReporteDTO reporteDTO) throws NegociosException;
    List<ReporteDTO> obtenerTodosLosReportes() throws FindException;
}
