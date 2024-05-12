package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.IncidentesDTO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import entidades.Ciudadano;
import entidades.Incidentes;
import entidades.Institucion;
import excepciones.NegociosException;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ILevantarReporteBO {

    public Ciudadano convertirCiudadanoEntidad(CiudadanoDTO ciudadanoDTO) throws NegociosException;
    
    public CiudadanoDTO convertirCiudadanoDTO(Ciudadano ciudadano) throws NegociosException;
    
    public Incidentes convertirIncidenteEntidad(IncidentesDTO incidenteDTO) throws NegociosException;
    
    public IncidentesDTO convertirIncidenteDTO(Incidentes incidente) throws NegociosException;
    
    public Institucion convertirInstitucionEntidad(InstitucionRegistradaDTO institucionDTO) throws NegociosException;
    
    public InstitucionRegistradaDTO convertirInstitucionDTO(Institucion institucion) throws NegociosException;
    
}
