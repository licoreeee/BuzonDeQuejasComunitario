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

    /**
     * Convierte un objeto de entidad Reporte en un objeto ReporteDTO.
     *
     * @param reporte El objeto de entidad Reporte a convertir.
     * @return El objeto ReporteDTO correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException;


    /**
     * Convierte un objeto ReporteDTO en un objeto de entidad Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO a convertir.
     * @return El objeto de entidad Reporte resultante de la conversión.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException;

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
