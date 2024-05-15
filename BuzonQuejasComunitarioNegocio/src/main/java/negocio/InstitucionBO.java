package negocio;

import Excepciones.FindException;
import conexion.Conexion;
import conexion.IConexion;
import dao.IInstitucionesDAO;
import dao.InstitucionesDAO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Institucion;
import excepciones.NegociosException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que representa la lógica de negocio relacionada con las instituciones.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega
 */
public class InstitucionBO implements IInstitucionBO {

    private final IConexion conexion;
    private IInstitucionesDAO institucionDAO;
    private Institucion institucion;

    /**
     * Constructor de la clase InstitucionBO.
     */
    public InstitucionBO() {
        conexion = new Conexion();
        institucion = new Institucion();
        this.institucionDAO = new InstitucionesDAO(conexion);

    }

    /**
     * Método para agregar una nueva institución.
     *
     * @param institucionNuevaDTO Los datos de la nueva institución a agregar.
     * @return Los datos de la nueva institución con códigos de gestión y NIP
     * generados.
     * @throws FindException Si ocurre un error al intentar agregar la
     * institución.
     */
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

    /**
     * Método para consultar todas las instituciones registradas.
     *
     * @return Una lista de DTOs que representan las instituciones registradas.
     * @throws FindException Si ocurre un error durante la consulta de las
     * instituciones.
     */
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

    /**
     * Método para generar una cadena de números aleatorios de longitud
     * específica.
     *
     * @param length La longitud de la cadena de números aleatorios a generar.
     * @return Una cadena de números aleatorios.
     */
    private String generarNumerosAleatorios(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    /**
     * Método para transportar datos utilizando un código de gestión y NIP.
     *
     * @param codigoGestion El código de gestión de la institución.
     * @param nip El NIP de la institución.
     * @return Un DTO que representa la institución correspondiente.
     * @throws FindException Si el ID o el NIP proporcionado es incorrecto o si
     * ocurre un error durante la obtención de la institución.
     */
    @Override
    public InstitucionRegistradaDTO transporteDatos(String codigoGestion, String nip) throws FindException {
        try {
            institucion = institucionDAO.obtenerInstitucionPorCodigo(codigoGestion);
            if (institucion == null || !institucion.getNip().equals(nip)) {
                throw new FindException("El ID o el NIP proporcionado es incorrecto.");
            } else {
                return new InstitucionRegistradaDTO(
                        institucion.getId().toHexString(),
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

    /**
     * Método para convertir una entidad InstitucionRegistradaDTO a la entidad
     * Institucion.
     *
     * @param institucionDTO El DTO de la institución a convertir.
     * @return La entidad Institucion correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    @Override
    public Institucion convertirInstitucionEntidad(InstitucionRegistradaDTO institucionDTO) throws NegociosException {
        Institucion institucion = new Institucion();
        institucion.setSiglas(institucionDTO.getSiglas());
        institucion.setNombre(institucionDTO.getNombre());
        return institucion;
    }

    /**
     * Método para convertir una entidad Institucion a InstitucionRegistradaDTO.
     *
     * @param institucion La entidad Institucion a convertir.
     * @return El DTO de la institución correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    @Override
    public InstitucionRegistradaDTO convertirInstitucionDTO(Institucion institucion) throws NegociosException {
        InstitucionRegistradaDTO institucionDTO = new InstitucionRegistradaDTO(
                institucion.getNombre(),
                institucion.getSiglas());
        return institucionDTO;
    }

}