/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.InstitucionDTO;
import dto.ReporteDTO;
import java.util.List;

/**
 *
 * @author castr
 */
public interface IFacadeLevantarReporte {

    public ReporteDTO levantarReporte(ReporteDTO reporteNuevo);
    
    public InstitucionDTO obtenerInstitucion(InstitucionDTO institucionSeleccionada);

    public List<InstitucionDTO> obtenerInstituciones();
}
