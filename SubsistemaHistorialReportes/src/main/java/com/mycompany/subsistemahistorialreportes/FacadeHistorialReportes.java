/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subsistemahistorialreportes;

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
    public List<ReporteDTO> obtenerReportePorIncidente(String incidente, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorIncidente(incidente, dia);
            return reportes;
        } catch (FindException ex) {
            Logger.getLogger(FacadeHistorialReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ReporteDTO> obtenerReportePorDia(Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorDia(dia);
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
    public List<ReporteDTO> obtenerReportePorTituloYIncidente(String titulo, String incidente, Calendar dia) {
        try {
            List<ReporteDTO> reportes = historial.obtenerReportePorTituloYIncidente(titulo,incidente, dia);
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
    
    
    
}
