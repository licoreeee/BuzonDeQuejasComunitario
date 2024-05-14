package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.IncidentesDTO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import entidades.Ciudadano;
import entidades.Incidentes;
import entidades.Institucion;
import entidades.Reporte;
import excepciones.NegociosException;

import java.lang.module.FindException;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ILevantarReporteBO {

    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException;

    public List<ReporteDTO> obtenerIncidentesAbiertosPorInstitucion(String idInstitucion) throws FindException;

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException;

    public ReporteDTO levantarReporte(ReporteDTO reporteDTO) throws NegociosException;

}
