
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import entidades.Ciudadano;
import excepciones.NegociosException;


/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ICiudadanoBO {

    /**
     * Convierte un objeto de entidad Ciudadano en un objeto CiudadanoDTO.
     * 
     * @param ciudadano El objeto de entidad Ciudadano a convertir.
     * @return El objeto CiudadanoDTO correspondiente.
     * @throws excepciones.NegociosException Si ocurre un error durante la conversión.
     */
    public CiudadanoDTO convertirDatosEntity(Ciudadano ciudadano) throws NegociosException;

    /**
     * Convierte un objeto CiudadanoDTO en un objeto Ciudadano.
     *
     * @param ciudadanoDTO El objeto CiudadanoDTO que se convertirá en un objeto
     * Ciudadano.
     * @return El objeto Ciudadano resultante de la conversión.
     * @throws excepciones.NegociosException
     */
    public Ciudadano convertirDatosDTO(CiudadanoDTO ciudadanoDTO) throws NegociosException;
    
     /**
     * Convierte un objeto CiudadanoDTO en un objeto de entidad Ciudadano.
     *
     * @param ciudadanoDTO El objeto CiudadanoDTO a convertir.
     * @return El objeto de entidad Ciudadano resultante de la conversión.
     * @throws excepciones.NegociosException Si ocurre un error durante la conversión.
     */
    public Ciudadano convertirCiudadanoEntidad(CiudadanoDTO ciudadanoDTO) throws NegociosException;
    
    /**
     * Convierte un objeto de entidad Ciudadano en un objeto CiudadanoDTO.
     *
     * @param ciudadano El objeto de entidad Ciudadano a convertir.
     * @return El objeto CiudadanoDTO correspondiente.
     * @throws excepciones.NegociosException Si ocurre un error durante la conversión.
     */
    public CiudadanoDTO convertirCiudadanoDTO(Ciudadano ciudadano) throws NegociosException;
    
    /**
     * Valida el formato de un objeto CiudadanoDTO.
     *
     * @param ciudadano El objeto CiudadanoDTO a validar.
     * @return true si el formato del CiudadanoDTO es válido, de lo contrario, false.
     * @throws excepciones.NegociosException Si ocurre un error durante la validación.
     */
    public boolean validarFormatoDTO(CiudadanoDTO ciudadano) throws NegociosException;

}
