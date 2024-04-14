package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.InstitucionDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Institucion;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IInstitucionBO {

    /**
     * Transporta los datos de una InstitucionDTO a través de otro objeto
     * InstitucionDTO. Crea un nuevo objeto InstitucionDTO con los mismos
     * atributos que el institucionSeleccionada pasado como parámetro. Luego,
     * llama al método conversorDatos para realizar la conversión y devuelve el
     * resultado.
     *
     * @param institucionSeleccionada El objeto InstitucionDTO del cual se
     * transportarán los datos.
     * @return El objeto InstitucionDTO resultante después de la conversión.
     */
    public InstitucionDTO transporteDatos(InstitucionDTO institucionSeleccionada);

    /**
     * Convierte un objeto InstitucionDTO en un objeto Institucion. Crea un
     * nuevo objeto Institucion con los mismos atributos que el
     * institucionSeleccionada pasado como parámetro.
     *
     * @param institucionSeleccionada El objeto InstitucionDTO que se convertirá
     * en un objeto Institucion.
     * @return El objeto Institucion resultante de la conversión.
     */
    public Institucion conversorDatos(InstitucionDTO institucionSeleccionada);

}
