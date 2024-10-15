/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historialReportes;

import Excepciones.FindException;
import dto.ReporteDTO;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class FacadeHistorialReportes implements IFacadeHistorialReportes{
    
    private HistorialReportes historial;

    public FacadeHistorialReportes() {
        historial = new HistorialReportes();
    }

    @Override
    public List<ReporteDTO> obtenerReportePorTitulo(String titulo, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorTitulo(titulo, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorInstitucion(String institucion, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorInstitucion(institucion, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorTituloYInstitucion(titulo,institucion, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorInstitucionYIncidente(institucion,incidente, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorTituloYInstitucionYIncidente(titulo,institucion,incidente, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerTodosLosReportes() {
        try {
            List<ReporteDTO> reportes = historial.obtenerTodosLosReportes();
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }   

    @Override
    public List<ReporteDTO> obtenerReportePorPeriodo(Calendar fechaInicio, Calendar fechaFin, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorPeriodo(fechaInicio, fechaFin, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYTitulo(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorPeriodoYTitulo(fechaInicio, fechaFin, dia, titulo);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorPeriodoYTituloYInstitucion(fechaInicio, fechaFin, dia, titulo, institucion);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYTituloYInstitucionYIncidente(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String titulo, String institucion, String incidente) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorPeriodoYTituloYInstitucionYIncidente(fechaInicio, fechaFin, dia, titulo, institucion, incidente);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorPeriodoYInstitucion(Calendar fechaInicio, Calendar fechaFin, Calendar dia, String institucion) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorPeriodoYInstitucion(fechaInicio, fechaFin, dia, institucion);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
