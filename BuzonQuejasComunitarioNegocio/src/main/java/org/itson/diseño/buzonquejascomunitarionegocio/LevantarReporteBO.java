/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.DomicilioDTO;
import dto.IncidenteDTO;
import dto.InstitucionDTO;
import dto.ReporteDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import objetosMock.ObjetosInstitucion;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Institucion;

/**
 *
 * @author castr
 */
public class LevantarReporteBO implements ILevantarReporteBO {

    List<ReporteDTO> reportes;
    ObjetosInstitucion objetosInstitucion;
    IInstitucionBO institucionBO;

    public LevantarReporteBO() {
        institucionBO = new InstitucionBO();
        objetosInstitucion = new ObjetosInstitucion();
        cargarDatos();
    }

    @Override
    public ReporteDTO validarReporte(ReporteDTO reporteIngresado) {
        for (int i = 0; i < reportes.size(); i++) {
            if (reportes.get(i).getCiudadano().getCURP().equalsIgnoreCase(reporteIngresado.getCiudadano().getCURP())) {
                reportes.set(i, reporteIngresado);
                return reportes.get(i);
            }
        }
        return null;
    }

    @Override
    public List<ReporteDTO> mostrarReportes() {
        return reportes;
    }

    @Override
    public List<InstitucionDTO> cargarDatos() {
        objetosInstitucion.agregarInstituciones();
        List<Institucion> institucionesEntity = objetosInstitucion.getInstituciones();

        // Verificar y eliminar duplicados en la lista de institucionesEntity
        Set<Institucion> institucionesSet = new HashSet<>(institucionesEntity);
        if (institucionesSet.size() != institucionesEntity.size()) {
            throw new IllegalStateException("La lista de instituciones contiene duplicados.");
        }

        List<InstitucionDTO> institucionesDTO = new ArrayList<>();
        for (Institucion institucion : institucionesEntity) {
            InstitucionDTO institucionDTO = institucionBO.conversionDatos(institucion);
            institucionesDTO.add(institucionDTO);
        }

        return institucionesDTO;
    }

}
