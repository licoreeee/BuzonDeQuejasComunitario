
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import entidades.Ciudadano;
import excepciones.NegociosException;


/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ICiudadanoBO {

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
    
    public Ciudadano convertirCiudadanoEntidad(CiudadanoDTO ciudadanoDTO) throws NegociosException;
    
    public CiudadanoDTO convertirCiudadanoDTO(Ciudadano ciudadano) throws NegociosException;
    
    public boolean validarFormatoDTO(CiudadanoDTO ciudadano) throws NegociosException;

}
