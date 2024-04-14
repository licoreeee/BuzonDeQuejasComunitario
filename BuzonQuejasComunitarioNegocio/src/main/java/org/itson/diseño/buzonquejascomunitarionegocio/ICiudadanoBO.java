
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Ciudadano;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ICiudadanoBO {

    /**
     * Transporta los datos de un objeto CiudadanoDTO a través de otro objeto
     * CiudadanoDTO.
     *
     * @param ciudadanoDTO El objeto CiudadanoDTO del cual se transportarán los
     * datos.
     * @return El objeto CiudadanoDTO resultante después de la conversión.
     */
    public CiudadanoDTO transporteDatos(CiudadanoDTO ciudadanoDTO);

    /**
     * Convierte un objeto CiudadanoDTO en un objeto Ciudadano.
     *
     * @param ciudadanoDTO El objeto CiudadanoDTO que se convertirá en un objeto
     * Ciudadano.
     * @return El objeto Ciudadano resultante de la conversión.
     */
    public Ciudadano convertirDatos(CiudadanoDTO ciudadanoDTO);

}
