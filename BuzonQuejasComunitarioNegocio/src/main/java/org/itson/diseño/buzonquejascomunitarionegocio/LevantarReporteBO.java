/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.InstitucionesDAO;
import dao.ReportesDAO;
import dto.IncidentesDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import entidades.Incidentes;
import entidades.Institucion;
import entidades.Reporte;
import excepciones.NegociosException;
import java.lang.module.FindException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author  Hisamy Cota, Gael Castro, Victoria Vega
 */
public class LevantarReporteBO implements ILevantarReporteBO {

    private IConexion conexion;
    IInstitucionBO institucionBO;
    IIncidenteBO incidenteBO;
    private ReportesDAO reportesDAO;
    private InstitucionesDAO institucionesDAO;

    public LevantarReporteBO() {
        conexion = new Conexion();
        reportesDAO = new ReportesDAO(conexion);
        institucionesDAO = new InstitucionesDAO(conexion);
    }

    /**
     * Levanta un nuevo reporte utilizando los datos proporcionados en el objeto ReporteDTO.
     *
     * @param reporteDTO El objeto ReporteDTO que contiene los datos del reporte a levantar.
     * @return El objeto ReporteDTO que representa el reporte levantado.
     * @throws NegociosException Si ocurre un error durante el proceso de levantar el reporte.
     */
    @Override
    public ReporteDTO levantarReporte(ReporteDTO reporteDTO) throws NegociosException {
        try {
            Reporte reporte = new Reporte();

            Institucion institucion = convertirDTOAInstitucion(reporteDTO.getInstitucion());
            Incidentes incidente = convertirDTOAIncidentes(reporteDTO.getIncidente());

            int folio = generarFolioAleatorio();
            reporte.setFolio(folio);
            reporte.setTitulo(reporteDTO.getTitulo());
            reporte.setDescripcion(reporteDTO.getDescripcion());
            Date fechaCreacion = new Date(); 
            reporte.setFechaCreacion(fechaCreacion);
            reporte.setEstado(true);
            reporte.setCalle(reporteDTO.getCalle());
            reporte.setColonia(reporteDTO.getColonia());
            reporte.setDescripcionExtra(reporteDTO.getDescripcionExtra());
            reporte.setInstitucion(institucion);
            reporte.setIncidente(incidente);

            reporte = reportesDAO.agregarReporte(reporte);

            reporteDTO.setFolio(reporte.getFolio());
            reporteDTO.setTitulo(reporte.getTitulo());
            reporteDTO.setDescripcion(reporte.getDescripcion());
            reporteDTO.setCalle(reporte.getCalle());
            reporteDTO.setColonia(reporte.getColonia());
            reporteDTO.setDescripcionExtra(reporte.getDescripcionExtra());
            reporteDTO.setInstitucion(convertirAInstitucionRegistradaDTO(institucion));
            reporteDTO.setIncidente(convertirAIncidentesDTO(reporte.getIncidente()));
            return reporteDTO;

        } catch (PersistenciaException ex) {
            throw new NegociosException("Error durante el levantamiento de reporte");
        }

    }

     /**
     * Convierte un objeto DTO de InstitucionRegistradaDTO a una entidad de Institucion.
     *
     * @param institucionDTO El objeto DTO de InstitucionRegistradaDTO a convertir.
     * @return La entidad de Institucion resultante de la conversión.
     */
    private Institucion convertirDTOAInstitucion(InstitucionRegistradaDTO institucionDTO) {
        Institucion institucion = new Institucion();
        String idString = institucionDTO.getId();
        institucion.setId(new ObjectId(idString));
        institucion.setNombre(institucionDTO.getNombre());
        institucion.setSiglas(institucionDTO.getSiglas());
        institucion.setDescripcionAdicional(institucionDTO.getDescripcionAdicional());

        return institucion;
    }

     /**
     * Convierte una entidad de Institucion a un objeto DTO de InstitucionRegistradaDTO.
     *
     * @param institucion La entidad de Institucion a convertir.
     * @return El objeto DTO de InstitucionRegistradaDTO resultante de la conversión.
     */
    private InstitucionRegistradaDTO convertirAInstitucionRegistradaDTO(Institucion institucion) {
        InstitucionRegistradaDTO institucionRegistradaDTO = new InstitucionRegistradaDTO();
        ObjectId id = institucion.getId();
        String idString = id.toString();
        institucionRegistradaDTO.setId(idString);
        institucionRegistradaDTO.setNombre(institucion.getNombre());
        institucionRegistradaDTO.setSiglas(institucion.getSiglas());
        institucionRegistradaDTO.setDescripcionAdicional(institucion.getDescripcionAdicional());
        return institucionRegistradaDTO;
    }

    /**
     * Convierte un objeto DTO de IncidentesDTO a una entidad de Incidentes.
     *
     * @param incidentesDTO El objeto DTO de IncidentesDTO a convertir.
     * @return La entidad de Incidentes resultante de la conversión.
     */
    private Incidentes convertirDTOAIncidentes(IncidentesDTO incidentesDTO) {
        try {
            Incidentes incidentes = new Incidentes();
            incidentes.setInformacion(incidentesDTO.getInformacion());
            // Verificar si el objeto InstitucionRegistradaDTO es null
            if (incidentesDTO.getInstitucionRegistradaDTO() != null) {
                String idInstitucion = incidentesDTO.getInstitucionRegistradaDTO().getId();
                incidentes.setInstitucionId(new ObjectId(idInstitucion));
            } else {
                throw new NegociosException();
            }
            return incidentes;
        } catch (NegociosException ex) {
            Logger.getLogger(LevantarReporteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Convierte una entidad de Incidentes a un objeto DTO de IncidentesDTO.
     *
     * @param incidentes La entidad de Incidentes a convertir.
     * @return El objeto DTO de IncidentesDTO resultante de la conversión.
     */
    private IncidentesDTO convertirAIncidentesDTO(Incidentes incidentes) {
        try {
            IncidentesDTO incidentesDTO = new IncidentesDTO();
            incidentesDTO.setInformacion(incidentes.getInformacion());
            ObjectId institucionId = incidentes.getInstitucionId();
            Institucion institucion = null;
            for (Institucion institucionActual : institucionesDAO.obtenerInstituciones()) {
                if (institucionActual.getId().equals(institucionId)) {
                    institucion = institucionActual;
                    break;
                }
            }
            if (institucion != null) {
                InstitucionRegistradaDTO institucionDTO = convertirAInstitucionRegistradaDTO(institucion);
                incidentesDTO.setInstitucionRegistradaDTO(institucionDTO);
            } else {
                Logger.getLogger(LevantarReporteBO.class.getName()).log(Level.SEVERE, "Error", this);
            }
            return incidentesDTO;
        } catch (Excepciones.FindException ex) {
            Logger.getLogger(LevantarReporteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * Genera un número de folio aleatorio de 6 dígitos.
     * 
     * @return El número de folio generado.
     */
    private int generarFolioAleatorio() {
        Random random = new Random();
        return random.nextInt(900000) + 100000; // Asegura un número de 6 dígitos
    }

}
