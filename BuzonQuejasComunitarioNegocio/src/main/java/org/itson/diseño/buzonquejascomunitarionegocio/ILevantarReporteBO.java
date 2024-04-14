/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import java.util.List;

/**
 *
 * @author castr
 */
public interface ILevantarReporteBO {
    
    ReporteDTO validarReporte(ReporteDTO reporteIngresado);
    
    List<ReporteDTO> mostrarReportes();
}
