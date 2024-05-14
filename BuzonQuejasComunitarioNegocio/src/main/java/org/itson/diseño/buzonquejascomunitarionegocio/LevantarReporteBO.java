/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import entidades.Reporte;
import excepciones.NegociosException;
import java.lang.module.FindException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.bson.types.Binary;

/**
 *
 * @author castr
 */
public class LevantarReporteBO implements ILevantarReporteBO {

    ICiudadanoBO ciudadanoBO;
    IInstitucionBO institucionBO;
    IIncidenteBO incidenteBO;

    public LevantarReporteBO() {
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

}
