package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.IncidentesDAO;
import dto.IncidentesDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Incidentes;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidenteBO implements IIncidenteBO {

    private final IConexion conexion;
    private IncidentesDAO incidentesDAO;

    public IncidenteBO() {
        conexion = new Conexion();
        this.incidentesDAO = new IncidentesDAO(conexion);
    }

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
