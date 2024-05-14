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
 * @author castr
 */
public class LevantarReporteBO implements ILevantarReporteBO {

    private IConexion conexion;
    ICiudadanoBO ciudadanoBO;
    IInstitucionBO institucionBO;
    IIncidenteBO incidenteBO;
    private ReportesDAO reportesDAO;
    private InstitucionesDAO institucionesDAO;

    public LevantarReporteBO() {
        conexion = new Conexion();
        reportesDAO = new ReportesDAO(conexion);
        institucionesDAO = new InstitucionesDAO(conexion);
    }

    public LevantarReporteBO(ICiudadanoBO ciudadanoBO, IInstitucionBO institucionBO, IIncidenteBO incidenteBO) {
        this.ciudadanoBO = ciudadanoBO;
        this.institucionBO = institucionBO;
        this.incidenteBO = incidenteBO;
    }

    @Override
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException {
        try {
            if (reporteDTO.getPhoto() == null) {
                Date date = reporteDTO.getFechaCreacion().getTime();
                Reporte reporte = new Reporte(reporteDTO.getFolio(),
                        reporteDTO.getTitulo(),
                        reporteDTO.getDescripcion(),
                        date,
                        reporteDTO.getCalle(),
                        reporteDTO.getColonia(),
                        reporteDTO.getDescripcionExtra(),
                        ciudadanoBO.convertirCiudadanoEntidad(reporteDTO.getCiudadano()),
                        institucionBO.convertirInstitucionEntidad(reporteDTO.getInstitucion()),
                        incidenteBO.convertirIncidenteEntidad(reporteDTO.getIncidente()));
                return reporte;
            } else {
                Date date = reporteDTO.getFechaCreacion().getTime();
                byte[] photo = reporteDTO.getPhoto();
                Binary binaryPhoto = new Binary(photo);
                Reporte reporte = new Reporte(reporteDTO.getFolio(),
                        reporteDTO.getTitulo(),
                        reporteDTO.getDescripcion(),
                        date,
                        binaryPhoto,
                        reporteDTO.getCalle(),
                        reporteDTO.getColonia(),
                        reporteDTO.getDescripcionExtra(),
                        ciudadanoBO.convertirCiudadanoEntidad(reporteDTO.getCiudadano()),
                        institucionBO.convertirInstitucionEntidad(reporteDTO.getInstitucion()),
                        incidenteBO.convertirIncidenteEntidad(reporteDTO.getIncidente()));
                return reporte;
            }
        } catch (NegociosException ex) {
            throw new NegociosException(ex.getMessage());
        }
    }

    @Override
    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException {
        try {
            if (reporte.getPhoto() == null) {
                Calendar calendar = null;
                calendar.setTime(reporte.getFechaCreacion());
                ReporteDTO reporteDTO = new ReporteDTO(reporte.getFolio(),
                        reporte.getTitulo(),
                        reporte.getDescripcion(),
                        calendar,
                        reporte.getCalle(),
                        reporte.getColonia(),
                        reporte.getDescripcionExtra(),
                        ciudadanoBO.convertirCiudadanoDTO(reporte.getCiudadano()),
                        institucionBO.convertirInstitucionDTO(reporte.getInstitucion()),
                        incidenteBO.convertirIncidenteDTO(reporte.getIncidente()));
                return reporteDTO;
            } else {
                Calendar calendar = null;
                calendar.setTime(reporte.getFechaCreacion());
                ReporteDTO reporteDTO = new ReporteDTO(reporte.getFolio(),
                        reporte.getTitulo(),
                        reporte.getDescripcion(),
                        calendar,
                        reporte.getPhoto().getData(),
                        reporte.getCalle(),
                        reporte.getColonia(),
                        reporte.getDescripcionExtra(),
                        ciudadanoBO.convertirCiudadanoDTO(reporte.getCiudadano()),
                        institucionBO.convertirInstitucionDTO(reporte.getInstitucion()),
                        incidenteBO.convertirIncidenteDTO(reporte.getIncidente()));
                return reporteDTO;
            }
        } catch (NegociosException ex) {
            throw new NegociosException(ex.getMessage());
        }
    }

    @Override
    public List<ReporteDTO> obtenerIncidentesAbiertosPorInstitucion(String idInstitucion) throws FindException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    private Institucion convertirDTOAInstitucion(InstitucionRegistradaDTO institucionDTO) {
        Institucion institucion = new Institucion();
        String idString = institucionDTO.getId();
        institucion.setId(new ObjectId(idString));
        institucion.setNombre(institucionDTO.getNombre());
        institucion.setSiglas(institucionDTO.getSiglas());
        institucion.setDescripcionAdicional(institucionDTO.getDescripcionAdicional());

        return institucion;
    }

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

    private int generarFolioAleatorio() {
        Random random = new Random();
        return random.nextInt(900000) + 100000; // Asegura un número de 6 dígitos
    }

}
