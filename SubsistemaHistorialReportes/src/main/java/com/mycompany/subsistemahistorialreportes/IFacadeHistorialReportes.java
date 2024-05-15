/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.subsistemahistorialreportes;

import dto.ReporteDTO;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface IFacadeHistorialReportes {
    
    public List<ReporteDTO> obtenerReportePorTitulo(String titulo, Calendar dia);

    public List<ReporteDTO> obtenerReportePorInstitucion(String institucion, Calendar dia);
    
    public List<ReporteDTO> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Calendar dia);
    
    public List<ReporteDTO> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Calendar dia);
    
    public List<ReporteDTO> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Calendar dia);
    
    public List<ReporteDTO> obtenerTodosLosReportes();
}
