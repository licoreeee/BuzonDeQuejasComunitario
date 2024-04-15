/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.InstitucionDTO;
import dto.ReporteDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author castr
 */
public class FacadeLevantarReporte implements IFacadeLevantarReporte {
LevantarReporte levantarReporte = new LevantarReporte();
    @Override
    public ReporteDTO levantarReporte(ReporteDTO reporteNuevo) {
        if (reporteNuevo != null) {

            

            levantarReporte.seleccionarInsitucion(reporteNuevo.getInstitucion());
            levantarReporte.seleccionarIncidente(reporteNuevo.getIncidente());
            levantarReporte.ingresarDomicilio(reporteNuevo.getDomicilio());
            levantarReporte.ingresarCiudadano(reporteNuevo.getCiudadano());
            levantarReporte.generarReporte(reporteNuevo);

            return reporteNuevo;

        }

        Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "No es posible realizar el levantamiento de reporte");
        return null;
    }

    @Override
    public InstitucionDTO obtenerInstitucion(InstitucionDTO institucionSeleccionada) {
        levantarReporte.seleccionarInsitucion(institucionSeleccionada);
        return institucionSeleccionada;

    }

}
