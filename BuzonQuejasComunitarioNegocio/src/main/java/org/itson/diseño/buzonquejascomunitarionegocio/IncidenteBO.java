package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.IncidenteDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Incidente;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidenteBO implements IIncidenteBO {

    /**
     * Este método transporta los datos de un incidente DTO a través de un
     * objeto IncidenteDTO. Crea un nuevo objeto IncidenteDTO con el nombre del
     * incidente del incidenteSeleccionado pasado como parámetro. Luego, llama
     * al método convertirDatos para realizar la conversión y devuelve el
     * resultado.
     *
     * @param incidenteSeleccionado El objeto IncidenteDTO del cual se
     * transportarán los datos.
     * @return El objeto IncidenteDTO resultante después de la conversión.
     */
    @Override
    public IncidenteDTO transporteDatos(IncidenteDTO incidenteSeleccionado) {
        IncidenteDTO incidenteDTO = new IncidenteDTO(
                incidenteSeleccionado.getNombreIncidente());
        convertirDatos(incidenteDTO);
        return incidenteDTO;
    }

    /**
     * Este método convierte un objeto IncidenteDTO en un objeto Incidente. Crea
     * un nuevo objeto Incidente con el nombre del incidente del incidenteDTO
     * pasado como parámetro.
     *
     * @param incidenteDTO El objeto IncidenteDTO que se convertirá en un objeto
     * Incidente.
     * @return El objeto Incidente resultante de la conversión.
     */
    @Override
    public Incidente convertirDatos(IncidenteDTO incidenteDTO) {
        Incidente incidente = new Incidente(
                incidenteDTO.getNombreIncidente());
        return incidente;
    }
}
