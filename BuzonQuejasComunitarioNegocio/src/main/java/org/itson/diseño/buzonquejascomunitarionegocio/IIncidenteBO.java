package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import dto.IncidentesDTO;
import entidades.Incidentes;
import excepciones.NegociosException;
import java.util.List;

/**
 * Interfaz que define las operaciones relacionadas con la lógica de negocio de
 * los incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IIncidenteBO {

    /**
     * Método para agregar incidentes.
     *
     * @param incidentesDTO La lista de DTOs que representan los incidentes a
     * agregar.
     * @return Una lista de DTOs que representan los incidentes agregados.
     * @throws FindException Si ocurre un error durante la agregación de los
     * incidentes.
     */
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO) throws FindException;

    /**
     * Método para obtener los incidentes asociados a una institución.
     *
     * @param idString El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes asociados a la
     * institución.
     * @throws FindException Si ocurre un error durante la obtención de los
     * incidentes.
     */
    public List<IncidentesDTO> obtenerIncidentes(String idString) throws FindException;

    /**
     * Método para obtener los incidentes abiertos asociados a una institución.
     *
     * @param idInstitucion El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes abiertos
     * asociados a la institución.
     * @throws FindException Si ocurre un error durante la obtención de los
     * incidentes.
     */
    public List<IncidentesDTO> obtenerIncidentesAbiertosPorInstitucion(String idInstitucion) throws FindException;

    /**
     * Método para convertir un DTO de incidente a entidad de incidente.
     *
     * @param incidenteDTO El DTO de incidente a convertir.
     * @return La entidad de incidente correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    public Incidentes convertirIncidenteEntidad(IncidentesDTO incidenteDTO) throws NegociosException;

    /**
     * Método para convertir una entidad de incidente a DTO.
     *
     * @param incidente La entidad de incidente a convertir.
     * @return El DTO de incidente correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
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
