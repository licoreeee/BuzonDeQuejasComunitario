/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.IncidentesDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import entidades.Ciudadano;
import entidades.Incidentes;
import entidades.Institucion;
import entidades.Reporte;
import excepciones.NegociosException;
import org.bson.types.Binary;

/**
 *
 * @author castr
 */
public class LevantarReporteBO implements ILevantarReporteBO {

    @Override
    public Ciudadano convertirCiudadanoEntidad(CiudadanoDTO ciudadanoDTO) throws NegociosException {
            Ciudadano ciudadano = new Ciudadano(
                    ciudadanoDTO.getNombre(),
                    ciudadanoDTO.getApellidoP(),
                    ciudadanoDTO.getApellidoM());
            return ciudadano;
    }

    @Override
    public CiudadanoDTO convertirCiudadanoDTO(Ciudadano ciudadano) throws NegociosException {
        CiudadanoDTO ciudadanoDTO = new CiudadanoDTO(
        ciudadano.getNombre(),
        ciudadano.getApellidoP(),
        ciudadano.getApellidoM());
        return ciudadanoDTO;
    }

    @Override
    public Incidentes convertirIncidenteEntidad(IncidentesDTO incidenteDTO) throws NegociosException {
        Incidentes incidente = new Incidentes();
        incidente.setInformacion(incidenteDTO.getInformacion());
        return incidente;
    }

    @Override
    public IncidentesDTO convertirIncidenteDTO(Incidentes incidente) throws NegociosException {
        IncidentesDTO incidenteDTO = new IncidentesDTO(incidente.getInformacion());
        return incidenteDTO;
    }

    @Override
    public Institucion convertirInstitucionEntidad(InstitucionRegistradaDTO institucionDTO) throws NegociosException {
        Institucion institucion = new Institucion();
        institucion.setSiglas(institucionDTO.getSiglas());
        institucion.setNombre(institucionDTO.getNombre());
        return institucion;
    }

    @Override
    public InstitucionRegistradaDTO convertirInstitucionDTO(Institucion institucion) throws NegociosException {
        InstitucionRegistradaDTO institucionDTO = new InstitucionRegistradaDTO(
        institucion.getNombre(),
        institucion.getSiglas());
        return institucionDTO;
    }

    @Override
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException {
        try {
        if(reporteDTO.getPhoto() == null){
            Reporte reporte = new Reporte(reporteDTO.getFolio(),
                                      reporteDTO.getTitulo(),
                                      reporteDTO.getDescripcion(),
                                      reporteDTO.getFechaCreacion(),
                                      reporteDTO.getCalle(),
                                      reporteDTO.getColonia(),
                                      reporteDTO.getDescripcionExtra(),
                                      convertirCiudadanoEntidad(reporteDTO.getCiudadano()),
                                      convertirInstitucionEntidad(reporteDTO.getInstitucion()),
                                      convertirIncidenteEntidad(reporteDTO.getIncidente()));
            return reporte;
        }else{
            byte[] photo = reporteDTO.getPhoto();
            Binary binaryPhoto = new Binary(photo);
            Reporte reporte = new Reporte(reporteDTO.getFolio(),
                                      reporteDTO.getTitulo(),
                                      reporteDTO.getDescripcion(),
                                      reporteDTO.getFechaCreacion(),
                                      binaryPhoto,
                                      reporteDTO.getCalle(),
                                      reporteDTO.getColonia(),
                                      reporteDTO.getDescripcionExtra(),
                                      convertirCiudadanoEntidad(reporteDTO.getCiudadano()),
                                      convertirInstitucionEntidad(reporteDTO.getInstitucion()),
                                      convertirIncidenteEntidad(reporteDTO.getIncidente()));
            return reporte;
        }
        } catch (NegociosException ex) {
            throw new NegociosException(ex.getMessage());
        }
    }

    @Override
    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException {
                try {
        if(reporte.getPhoto() == null){
            ReporteDTO reporteDTO = new ReporteDTO(reporte.getFolio(),
                                      reporte.getTitulo(),
                                      reporte.getDescripcion(),
                                      reporte.getFechaCreacion(),
                                      reporte.getCalle(),
                                      reporte.getColonia(),
                                      reporte.getDescripcionExtra(),
                                      convertirCiudadanoDTO(reporte.getCiudadano()),
                                      convertirInstitucionDTO(reporte.getInstitucion()),
                                      convertirIncidenteDTO(reporte.getIncidente()));
            return reporteDTO;
        }else{
            ReporteDTO reporteDTO = new ReporteDTO(reporte.getFolio(),
                                      reporte.getTitulo(),
                                      reporte.getDescripcion(),
                                      reporte.getFechaCreacion(),
                                      reporte.getPhoto().getData(),
                                      reporte.getCalle(),
                                      reporte.getColonia(),
                                      reporte.getDescripcionExtra(),
                                      convertirCiudadanoDTO(reporte.getCiudadano()),
                                      convertirInstitucionDTO(reporte.getInstitucion()),
                                      convertirIncidenteDTO(reporte.getIncidente()));
            return reporteDTO;
        }
        } catch (NegociosException ex) {
            throw new NegociosException(ex.getMessage());
        }
    }

 
}
