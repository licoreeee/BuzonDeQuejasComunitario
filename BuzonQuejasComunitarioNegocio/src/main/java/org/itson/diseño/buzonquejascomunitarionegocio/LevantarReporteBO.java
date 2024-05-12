/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.IncidentesDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Ciudadano;
import entidades.Incidentes;
import entidades.Institucion;
import excepciones.NegociosException;

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

 
}
