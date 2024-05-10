package org.itson.diseño.buzonquejascomunitarionegocio;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionBO implements IInstitucionBO {
 
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
