/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historialReportes;

import dto.ReporteDTO;
import Excepciones.FindException;
import java.util.Calendar;
import java.util.List;
import org.itson.diseño.buzonquejascomunitarionegocio.IReporteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.ReporteBO;

/**
 *
 * @author Dell
 */
public class HistorialReportes {
    
    private IReporteBO reporteBO;

    public HistorialReportes() {
        reporteBO = new ReporteBO();
    }
    
    public List<ReporteDTO> obtenerReportePorTitulo(String titulo, Calendar dia) throws FindException{
            List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorTitulo(titulo, dia);
            return reportes;
    }

    public List<ReporteDTO> obtenerReportePorInstitucion(String institucion, Calendar dia) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorInstitucion(institucion, dia);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Calendar dia) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorTituloYInstitucion(titulo,institucion, dia);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Calendar dia) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorInstitucionYIncidente(institucion,incidente, dia);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Calendar dia) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorTituloYInstitucionYIncidente(titulo,institucion,incidente, dia);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerTodosLosReportes() throws FindException{
        List<ReporteDTO> reportes;
        reportes = reporteBO.obtenerTodosLosReportes();
        return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorPeriodo(Calendar fechaInicio, Calendar fechaFin, Calendar dia) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorPeriodo(fechaInicio, fechaFin, dia);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorPeriodoYTitulo(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorPeriodoYTitulo(fechaInicio, fechaFin, dia, titulo);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorPeriodoYTituloYInstitucion(fechaInicio, fechaFin, dia, titulo, institucion);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucionYIncidente(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion, String incidente) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorPeriodoYTituloYInstitucionYIncidente(fechaInicio, fechaFin, dia, titulo, institucion, incidente);
            return reportes;
    }
    
    public List<ReporteDTO> obtenerReportePorPeriodoYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String institucion) throws FindException{
        List<ReporteDTO> reportes;
            reportes = reporteBO.obtenerReportePorPeriodoYInstitucion(fechaInicio, fechaFin, dia, institucion);
            return reportes;
    }
    
}
