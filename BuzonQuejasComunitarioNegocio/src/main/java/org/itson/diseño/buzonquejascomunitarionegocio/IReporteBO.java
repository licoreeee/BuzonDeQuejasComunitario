package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import dto.ReporteDTO;
import entidades.Reporte;
import excepciones.NegociosException;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IReporteBO {

    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException;

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException;

    public boolean validarFormatoDTO(ReporteDTO reporteDTO) throws NegociosException;

    public List<ReporteDTO> obtenerIncidentesAbiertosPorInstitucion(String idInstitucion) throws FindException;

}
