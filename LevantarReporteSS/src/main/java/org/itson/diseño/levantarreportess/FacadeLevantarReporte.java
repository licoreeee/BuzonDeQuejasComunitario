/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.InstitucionNuevaDTO;
import dto.ReporteDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author castr
 */
public class FacadeLevantarReporte implements IFacadeLevantarReporte {

//    LevantarReporte levantarReporte = new LevantarReporte();

    @Override
    public ReporteDTO levantarReporte(ReporteDTO reporteNuevo) {
        if (reporteNuevo != null) {

//            levantarReporte.seleccionarInsitucion(reporteNuevo.getInstitucion());
//            levantarReporte.seleccionarIncidente(reporteNuevo.getIncidente());
//            levantarReporte.ingresarDomicilio(reporteNuevo.getDomicilio());
//            levantarReporte.ingresarCiudadano(reporteNuevo.getCiudadano());
//            levantarReporte.generarReporte(reporteNuevo);

            return reporteNuevo;

        }

//        Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "No es posible realizar el levantamiento de reporte");
       return null;
    }

    @Override
    public InstitucionNuevaDTO obtenerInstitucion(InstitucionNuevaDTO institucionSeleccionada) {
//        levantarReporte.seleccionarInsitucion(institucionSeleccionada);
        return institucionSeleccionada;

    }

    @Override
    public List<InstitucionNuevaDTO> obtenerInstituciones() {
//        List<InstitucionNuevaDTO> instituciones = levantarReporte.obtenerInstituciones();
//        Set<InstitucionNuevaDTO> institucionesUnicas = new HashSet<>(instituciones);
//        List<InstitucionNuevaDTO> listaInstitucionesUnicas = new ArrayList<>(institucionesUnicas);

        return new ArrayList<InstitucionNuevaDTO>();
    }

}
