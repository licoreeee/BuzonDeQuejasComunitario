/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import Excepciones.FindException;
import dto.InstitucionNuevaDTO;
import dto.ReporteDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author castr
 */
public class FacadeLevantarReporte implements IFacadeLevantarReporte {

    private LevantarReporte levantarReporte;

    public FacadeLevantarReporte() {
        levantarReporte = new LevantarReporte();
    }

    @Override
    public ReporteDTO levantarReporte(ReporteDTO reporteNuevo) {
        try {
            levantarReporte.levantarReporte(reporteNuevo);
            return reporteNuevo;
        } catch (Exception ex) {
            Logger.getLogger(FacadeLevantarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
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
