/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.InstitucionNuevaDTO;
import dto.ReporteDTO;
import java.util.List;

/**
 *
 * @author castr
 */
public interface IFacadeLevantarReporte {

    public ReporteDTO levantarReporte(ReporteDTO reporteNuevo);
    
    public InstitucionNuevaDTO obtenerInstitucion(InstitucionNuevaDTO institucionSeleccionada);

    public List<InstitucionNuevaDTO> obtenerInstituciones();
}
