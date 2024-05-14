package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import conexion.Conexion;
import conexion.IConexion;
import dao.IncidentesDAO;
import dto.IncidentesDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Incidentes;
import excepciones.NegociosException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 * Clase que implementa la lógica de negocio relacionada con los incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidenteBO implements IIncidenteBO {

    private final IConexion conexion;
    private IncidentesDAO incidentesDAO;

    /**
     * Constructor de la clase IncidenteBO.
     */
    public IncidenteBO() {
        conexion = new Conexion();
        this.incidentesDAO = new IncidentesDAO(conexion);
    }

    /**
     * Método para agregar una lista de incidentes.
     *
     * @param incidentesDTO La lista de DTOs que representan los incidentes a
     * agregar.
     * @return Una lista de DTOs que representan los incidentes agregados.
     * @throws FindException Si ocurre un error durante la agregación de los
     * incidentes.
     */
    @Override
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO) throws FindException {
        try {
            List<Incidentes> incidentes = new ArrayList<>();

            for (IncidentesDTO dto : incidentesDTO) {
                String idString = dto.getInstitucionRegistradaDTO().getId();
                Incidentes incidente = new Incidentes();
                incidente.setInformacion(dto.getInformacion());
                incidente.setInstitucionId(new ObjectId(idString));
                incidentes.add(incidente);
            }

            incidentes = incidentesDAO.agregarIncidentes(incidentes);

            List<IncidentesDTO> incidentesEnProceso = new ArrayList<>();
            for (Incidentes incidente : incidentes) {
                IncidentesDTO dto = new IncidentesDTO();
                dto.setInformacion(incidente.getInformacion());
                dto.setInstitucionRegistradaDTO(new InstitucionRegistradaDTO(incidente.getInstitucionId().toString()));
                incidentesEnProceso.add(dto);
            }
            return incidentesEnProceso;
        } catch (FindException ex) {
            Logger.getLogger(IncidenteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método para obtener los incidentes asociados a una institución.
     *
     * @param idString El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes obtenidos.
     * @throws FindException Si ocurre un error durante la obtención de los
     * incidentes.
     */
    @Override
    public List<IncidentesDTO> obtenerIncidentes(String idString) throws FindException {
        List<IncidentesDTO> incidentesEnProceso = new ArrayList<>();
        try {
            ObjectId institucionId = new ObjectId(idString);
            List<Incidentes> incidentes = new ArrayList<>();
            incidentes = incidentesDAO.obtenerIncidentes(institucionId);

            for (Incidentes incidente : incidentes) {
                IncidentesDTO incidenteDTO = new IncidentesDTO();
                incidenteDTO.setInformacion(incidente.getInformacion());
                String id = incidente.getInstitucionId().toString();
                InstitucionRegistradaDTO institucionRegistradaDTO = new InstitucionRegistradaDTO(id);
                incidenteDTO.setInstitucionRegistradaDTO(institucionRegistradaDTO);

                incidentesEnProceso.add(incidenteDTO);
            }

            return incidentesEnProceso;
        } catch (FindException ex) {
            Logger.getLogger(IncidenteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método para obtener los incidentes abiertos asociados a una institución.
     *
     * @param idInstitucion El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes abiertos
     * obtenidos.
     * @throws FindException Si ocurre un error durante la obtención de los
     * incidentes abiertos.
     */
    @Override
    public List<IncidentesDTO> obtenerIncidentesAbiertosPorInstitucion(String idInstitucion) throws FindException {
        List<IncidentesDTO> incidentes = new ArrayList<IncidentesDTO>();
        return incidentes;
    }

    /**
     * Método para convertir un DTO de incidente a la entidad correspondiente.
     *
     * @param incidenteDTO El DTO del incidente a convertir.
     * @return La entidad del incidente correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    @Override
    public Incidentes convertirIncidenteEntidad(IncidentesDTO incidenteDTO) throws NegociosException {
        Incidentes incidente = new Incidentes();
        incidente.setInformacion(incidenteDTO.getInformacion());
        return incidente;
    }

    /**
     * Método para convertir una entidad de incidente a DTO.
     *
     * @param incidente La entidad del incidente a convertir.
     * @return El DTO del incidente correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    @Override
    public IncidentesDTO convertirIncidenteDTO(Incidentes incidente) throws NegociosException {
        IncidentesDTO incidenteDTO = new IncidentesDTO(incidente.getInformacion());
        return incidenteDTO;
    }

//    /**
//     * Este método transporta los datos de un incidente DTO a través de un
//     * objeto IncidenteDTO. Crea un nuevo objeto IncidenteDTO con el nombre del
//     * incidente del incidenteSeleccionado pasado como parámetro. Luego, llama
//     * al método convertirDatos para realizar la conversión y devuelve el
//     * resultado.
//     *
//     * @param incidenteSeleccionado El objeto IncidenteDTO del cual se
//     * transportarán los datos.
//     * @return El objeto IncidenteDTO resultante después de la conversión.
//     */
//    @Override
//    public IncidenteDTO transporteDatos(IncidenteDTO incidenteSeleccionado) {
//        IncidenteDTO incidenteDTO = new IncidenteDTO(
//                incidenteSeleccionado.getNombreIncidente());
//        convertirDatos(incidenteDTO);
//        return incidenteDTO;
//    }
//
//    /**
//     * Este método convierte un objeto IncidenteDTO en un objeto Incidente. Crea
//     * un nuevo objeto Incidente con el nombre del incidente del incidenteDTO
//     * pasado como parámetro.
//     *
//     * @param incidenteDTO El objeto IncidenteDTO que se convertirá en un objeto
//     * Incidente.
//     * @return El objeto Incidente resultante de la conversión.
//     */
//    @Override
//    public Incidente convertirDatos(IncidenteDTO incidenteDTO) {
//        Incidente incidente = new Incidente(
//                incidenteDTO.getNombreIncidente());
//        return incidente;
//    }
//    
//    @Override
//    public IncidenteDTO conversionDatos(Incidente incidente){
//        IncidenteDTO incidenteConvertido = new IncidenteDTO(incidente.getNombreIncidente());
//        return incidenteConvertido;
//    }
}
