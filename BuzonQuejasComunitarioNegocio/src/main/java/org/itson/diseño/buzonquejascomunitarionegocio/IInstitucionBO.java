package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import entidades.Institucion;
import excepciones.NegociosException;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IInstitucionBO {
    
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO) throws FindException;

    public List<InstitucionRegistradaDTO> consultarInstituciones() throws FindException;
    public InstitucionRegistradaDTO transporteDatos(String codigoGestion, String nip) throws FindException ;
    
    public Institucion convertirInstitucionEntidad(InstitucionRegistradaDTO institucionDTO) throws NegociosException;
    
    public InstitucionRegistradaDTO convertirInstitucionDTO(Institucion institucion) throws NegociosException;
//    /**
//     * Transporta los datos de una InstitucionDTO a través de otro objeto
//     * InstitucionDTO. Crea un nuevo objeto InstitucionDTO con los mismos
//     * atributos que el institucionSeleccionada pasado como parámetro. Luego,
//     * llama al método conversorDatos para realizar la conversión y devuelve el
//     * resultado.
//     *
//     * @param institucionSeleccionada El objeto InstitucionNuevaDTO del cual se
// transportarán los datos.
//     * @return El objeto InstitucionNuevaDTO resultante después de la conversión.
//     */
//    public InstitucionNuevaDTO transporteDatos(InstitucionNuevaDTO institucionSeleccionada);
//
//    /**
//     * Convierte un objeto InstitucionDTO en un objeto Institucion. Crea un
//     * nuevo objeto Institucion con los mismos atributos que el
//     * institucionSeleccionada pasado como parámetro.
//     *
//     * @param institucionSeleccionada El objeto InstitucionNuevaDTO que se convertirá
// en un objeto Institucion.
//     * @return El objeto Institucion resultante de la conversión.
//     */
//    public Institucion conversorDatos(InstitucionNuevaDTO institucionSeleccionada);
//
//    public InstitucionNuevaDTO conversionDatos(Institucion institucion);
}
