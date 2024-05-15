package negocio;

import Excepciones.FindException;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Institucion;
import excepciones.NegociosException;
import java.util.List;

/**
 * Interfaz que define las operaciones relacionadas con la lógica de negocio de
 * las instituciones.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IInstitucionBO {

    /**
     * Método para agregar una institución.
     *
     * @param institucionNuevaDTO El DTO que representa la nueva institución a
     * agregar.
     * @return El DTO de la institución agregada.
     * @throws FindException Si ocurre un error durante la agregación de la
     * institución.
     */
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO) throws FindException;

    /**
     * Método para consultar todas las instituciones registradas.
     *
     * @return Una lista de DTOs que representan las instituciones registradas.
     * @throws FindException Si ocurre un error durante la consulta de las
     * instituciones.
     */
    public List<InstitucionRegistradaDTO> consultarInstituciones() throws FindException;

    /**
     * Método para transportar los datos de una institución a partir de un
     * código de gestión y un NIP.
     *
     * @param codigoGestion El código de gestión de la institución.
     * @param nip El NIP de la institución.
     * @return El DTO de la institución correspondiente a los datos
     * transportados.
     * @throws FindException Si ocurre un error durante el transporte de los
     * datos de la institución.
     */
    public InstitucionRegistradaDTO transporteDatos(String codigoGestion, String nip) throws FindException;

    /**
     * Método para convertir una institución registrada DTO a entidad de
     * institución.
     *
     * @param institucionDTO El DTO de la institución registrada a convertir.
     * @return La entidad de la institución correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    public Institucion convertirInstitucionEntidad(InstitucionRegistradaDTO institucionDTO) throws NegociosException;

    /**
     * Método para convertir una entidad de institución a DTO.
     *
     * @param institucion La entidad de la institución a convertir.
     * @return El DTO de la institución correspondiente.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    public InstitucionRegistradaDTO convertirInstitucionDTO(Institucion institucion) throws NegociosException;


}
