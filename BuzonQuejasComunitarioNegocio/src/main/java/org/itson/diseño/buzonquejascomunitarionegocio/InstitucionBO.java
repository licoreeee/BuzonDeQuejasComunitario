package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.InstitucionDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Institucion;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionBO implements IInstitucionBO {

    /**
     * Este método transporta los datos de una institución DTO a través de un
     * objeto InstitucionDTO. Se crea un nuevo objeto InstitucionDTO con los
     * mismos atributos que el institucionSeleccionada pasado como parámetro.
     * Luego, llama al método conversorDatos para realizar la conversión.
     *
     * @param institucionSeleccionada El objeto InstitucionDTO del cual se
     * transportarán los datos.
     */
    @Override
    public InstitucionDTO transporteDatos(InstitucionDTO institucionSeleccionada) {
        InstitucionDTO institucionDTO = new InstitucionDTO(
                institucionSeleccionada.getNombreInstitucion(),
                institucionSeleccionada.getFuncionInstitucion(),
                institucionSeleccionada.getSiglas());
        conversorDatos(institucionDTO);
        return institucionDTO;

    }

    /**
     * Este método convierte un objeto InstitucionDTO en un objeto Institucion.
     * Crea un nuevo objeto Institucion con los mismos atributos que el
     * institucionSeleccionada pasado como parámetro.
     *
     * @param institucionSeleccionada El objeto InstitucionDTO que se convertirá
     * en un objeto Institucion.
     * @return El objeto Institucion resultante de la conversión.
     */
    @Override
    public Institucion conversorDatos(InstitucionDTO institucionSeleccionada) {
        Institucion institucion = new Institucion(
                institucionSeleccionada.getNombreInstitucion(),
                institucionSeleccionada.getFuncionInstitucion(),
                institucionSeleccionada.getSiglas());       
        return institucion;

    }
   

}
