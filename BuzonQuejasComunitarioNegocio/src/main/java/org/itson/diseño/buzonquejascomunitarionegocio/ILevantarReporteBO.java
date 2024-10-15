package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.IncidentesDTO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
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

    /**
     * Levanta un nuevo reporte utilizando los datos proporcionados en el objeto
     * ReporteDTO.
     *
     * @param reporteDTO El objeto ReporteDTO que contiene los datos del reporte
     * a levantar.
     * @return El objeto ReporteDTO que representa el reporte levantado.
     * @throws NegociosException Si ocurre un error durante el proceso de
     * levantar el reporte.
     */
    public ReporteDTO levantarReporte(ReporteDTO reporteDTO) throws NegociosException;

}
