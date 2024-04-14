package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Reporte;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IReporteBO {

    /**
     * Transporta los datos de un objeto ReporteDTO a través de otro objeto
     * ReporteDTO.
     *
     * @param reporteNuevo El objeto ReporteDTO del cual se transportarán los
     * datos.
     */
    public void transporteDatos(ReporteDTO reporteNuevo);

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
    public Reporte convertirDatos(ReporteDTO reporteDTO);
}
