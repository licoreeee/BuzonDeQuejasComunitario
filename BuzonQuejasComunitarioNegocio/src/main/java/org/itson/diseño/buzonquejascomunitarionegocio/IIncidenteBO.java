package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import dto.IncidentesDTO;
import entidades.Incidentes;
import excepciones.NegociosException;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IIncidenteBO {

    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO) throws FindException;
    
    public List<IncidentesDTO> obtenerIncidentes(String idString) throws FindException;
    
    public List<IncidentesDTO> obtenerIncidentesAbiertosPorInstitucion (String idInstitucion) throws FindException;
    
    public Incidentes convertirIncidenteEntidad(IncidentesDTO incidenteDTO) throws NegociosException;
    
    public IncidentesDTO convertirIncidenteDTO(Incidentes incidente) throws NegociosException;
    
//    /**
//     * Este método transporta los datos de un objeto IncidenteDTO a través de
//     * otro objeto IncidenteDTO. Crea un nuevo objeto IncidenteDTO con el mismo
//     * nombre de incidente que el incidenteSeleccionado pasado como parámetro.
//     * Luego, llama al método convertirDatos para realizar la conversión y
//     * devuelve el resultado.
//     *
//     * @param incidenteSeleccionado El objeto IncidenteDTO del cual se
//     * transportarán los datos.
//     * @return El objeto IncidenteDTO resultante después de la conversión.
//     */
//    public IncidenteDTO transporteDatos(IncidenteDTO incidenteSeleccionado);
//
//    /**
//     * Este método convierte un objeto IncidenteDTO en un objeto Incidente. Crea
//     * un nuevo objeto Incidente con el mismo nombre de incidente que el
//     * incidenteDTO pasado como parámetro.
//     *
//     * @param incidenteDTO El objeto IncidenteDTO que se convertirá en un objeto
//     * Incidente.
//     * @return El objeto Incidente resultante de la conversión.
//     */
//    public Incidente convertirDatos(IncidenteDTO incidenteDTO);
//
//    public IncidenteDTO conversionDatos(Incidente incidente);
}
