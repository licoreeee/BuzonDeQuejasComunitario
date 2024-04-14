package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Reporte;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ReporteBO implements IReporteBO{

    /**
     * Transporta los datos de un objeto ReporteDTO a través de otro objeto
     * ReporteDTO. Crea un nuevo objeto ReporteDTO con el mismo título y
     * descripción que el reporteNuevo pasado como parámetro. Luego, llama al
     * método convertirDatos para realizar la conversión.
     *
     * @param reporteNuevo El objeto ReporteDTO del cual se transportarán los
     * datos.
     */
    @Override
    public void transporteDatos(ReporteDTO reporteNuevo) {
        ReporteDTO reporteDTO = new ReporteDTO(
                reporteNuevo.getTitulo(),
                reporteNuevo.getDescripcion());
        convertirDatos(reporteDTO);
    }

    /**
     * Convierte un objeto ReporteDTO en un objeto Reporte. Crea un nuevo objeto
     * Reporte con el título del reporteDTO pasado como parámetro.
     *
     * @param reporteDTO El objeto ReporteDTO que se convertirá en un objeto
     * Reporte.
     * @return El objeto Reporte resultante de la conversión.
     */
    @Override
    public Reporte convertirDatos(ReporteDTO reporteDTO) {
        Reporte reporte = new Reporte(
                reporteDTO.getTitulo(),
                reporteDTO.getTitulo());
        return reporte;
    }
}
