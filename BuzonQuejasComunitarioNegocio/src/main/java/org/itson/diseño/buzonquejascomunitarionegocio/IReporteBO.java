package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import excepciones.NegociosException;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Reporte;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IReporteBO {

    ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException;

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
   Reporte convertirDatosDTO(ReporteDTO reporteDTO) throws NegociosException;
}
