package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.InstitucionesDAO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Institucion;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bson.types.ObjectId;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionBO implements IInstitucionBO {

    private final IConexion conexion;
    private InstitucionesDAO institucionDAO;
    private Institucion institucion;

    public InstitucionBO() {
        conexion = new Conexion();
        institucion = new Institucion();
        this.institucionDAO = new InstitucionesDAO(conexion);

    }

    @Override
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO) throws FindException {
        Institucion institucion = new Institucion();
        institucion.setNombre(institucionNuevaDTO.getNombre());
        institucion.setSiglas(institucionNuevaDTO.getSiglas());
        institucion.setDescripcionAdicional(institucionNuevaDTO.getDescripcionAdicional());

        //Implementacion para el codigo con el cual la institucion podra acceder a comentar
        String codigoGestion = generarNumerosAleatorios(6);
        institucion.setCodigoGestion("00000" + codigoGestion);
        institucionNuevaDTO.setCodigoGestion(institucion.getCodigoGestion());
        String nip = generarNumerosAleatorios(4);
        institucion.setNip(nip);
        institucionNuevaDTO.setNip(institucion.getNip());

        try {
            institucion = institucionDAO.agregarInstitucion(institucion);
        } catch (FindException ex) {
            throw new FindException("Error al intentar agregar la institucion" + ex.getMessage());
        }
        return institucionNuevaDTO;
    }

    @Override
    public List<InstitucionRegistradaDTO> consultarInstituciones() throws FindException {
        List<InstitucionRegistradaDTO> institucionesConsultadas = new ArrayList<>();
        try {
            List<Institucion> institucionesObtenidas = institucionDAO.obtenerInstituciones();
            for (Institucion institucionesObtenida : institucionesObtenidas) {
                String idString = institucionesObtenida.getId().toString();
                InstitucionRegistradaDTO registroInstituciones = new InstitucionRegistradaDTO(
                        idString,
                        institucionesObtenida.getNombre(),
                        institucionesObtenida.getSiglas(),
                        institucionesObtenida.getDescripcionAdicional(),
                        institucionesObtenida.getCodigoGestion(),
                        institucionesObtenida.getNip()
                );
                institucionesConsultadas.add(registroInstituciones);
            }
        } catch (FindException ex) {
            throw new FindException("Error durante la consulta de instituciones" + ex.getMessage());
        }
        return institucionesConsultadas;
    }

    private String generarNumerosAleatorios(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public InstitucionRegistradaDTO transporteDatos(String codigoGestion, String nip) throws FindException {
        try {
            institucion = institucionDAO.obtenerInstitucionPorCodigo(codigoGestion);
            if (institucion == null || !institucion.getNip().equals(nip)) {
                throw new FindException("El ID o el NIP proporcionado es incorrecto.");
            } else {
                return new InstitucionRegistradaDTO(
                        institucion.getNombre(),
                        institucion.getSiglas(),
                        institucion.getDescripcionAdicional(),
                        institucion.getCodigoGestion(),
                        institucion.getNip());
            }

        } catch (FindException e) {
            throw e;
             
        }

    }

//    /**
//     * Este método transporta los datos de una institución DTO a través de un
//     * objeto InstitucionDTO. Se crea un nuevo objeto InstitucionDTO con los
//     * mismos atributos que el institucionSeleccionada pasado como parámetro.
//     * Luego, llama al método conversorDatos para realizar la conversión.
//     *
//     * @param institucionSeleccionada El objeto InstitucionNuevaDTO del cual se
// transportarán los datos.
//     */
//    @Override
//    public InstitucionNuevaDTO transporteDatos(InstitucionNuevaDTO institucionSeleccionada) {
//        InstitucionNuevaDTO institucionDTO = new InstitucionNuevaDTO(
//                institucionSeleccionada.getNombreInstitucion(),
//                institucionSeleccionada.getFuncionInstitucion(),
//                institucionSeleccionada.getSiglas());
//        conversorDatos(institucionDTO);
//        return institucionDTO;
//
//    }
//
//    /**
//     * Este método convierte un objeto InstitucionDTO en un objeto Institucion.
//     * Crea un nuevo objeto Institucion con los mismos atributos que el
//     * institucionSeleccionada pasado como parámetro.
//     *
//     * @param institucionSeleccionada El objeto InstitucionNuevaDTO que se convertirá
// en un objeto Institucion.
//     * @return El objeto Institucion resultante de la conversión.
//     */
//    @Override
//    public Institucion conversorDatos(InstitucionNuevaDTO institucionSeleccionada) {
//        Institucion institucion = new Institucion(
//                institucionSeleccionada.getNombreInstitucion(),
//                institucionSeleccionada.getFuncionInstitucion(),
//                institucionSeleccionada.getSiglas());       
//        return institucion;
//
//    }
//
//    @Override
//    public InstitucionNuevaDTO conversionDatos(Institucion institucion) {
//        InstitucionNuevaDTO institucionConvertida = new InstitucionNuevaDTO(
//                institucion.getNombreInstitucion(),
//                institucion.getFuncionInstitucion(),
//                institucion.getSiglas());
//
//        List<IncidenteDTO> incidentesDTO = new ArrayList<>();
//        for (Incidente incidente : institucion.getIncidentes()) {
//            IncidenteDTO incidenteDTO = new IncidenteDTO(incidente.getNombreIncidente());
//            incidentesDTO.add(incidenteDTO);
//        }
//        institucionConvertida.setIncidentes(incidentesDTO);
//
//        return institucionConvertida;
//    }
//   
}
