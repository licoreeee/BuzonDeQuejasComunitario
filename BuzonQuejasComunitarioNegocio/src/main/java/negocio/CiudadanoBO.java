package negocio;

import dto.CiudadanoDTO;
import entidades.Ciudadano;
import excepciones.NegociosException;
import org.bson.types.ObjectId;


/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega
 */
public class CiudadanoBO implements ICiudadanoBO {

     /**
     * Convierte un objeto de entidad Ciudadano en un objeto CiudadanoDTO.
     * 
     * @param ciudadano El objeto de entidad Ciudadano a convertir.
     * @return El objeto CiudadanoDTO correspondiente.
     * @throws NegociosException Si el objeto Ciudadano de entrada es nulo.
     */
    @Override
    public CiudadanoDTO convertirDatosEntity(Ciudadano ciudadano) throws NegociosException {
        if (ciudadano == null) {
            throw new NegociosException("El ciudadano es nulo.");
        }

        CiudadanoDTO ciudadanoDTO = new CiudadanoDTO(
                ciudadano.getNombre(),
                ciudadano.getApellidoP(),
                ciudadano.getApellidoM(),
                ciudadano.getCurp(),
                ciudadano.getContrasenia()
        );

        if (ciudadano.getId() != null) {
            ciudadanoDTO.setId(ciudadano.getId().toString());
        }

        return ciudadanoDTO;
    }

     /**
     * Convierte un objeto CiudadanoDTO en un objeto de entidad Ciudadano.
     * 
     * @param ciudadanoDTO El objeto CiudadanoDTO a convertir.
     * @return El objeto de entidad Ciudadano correspondiente.
     * @throws NegociosException Si el objeto CiudadanoDTO de entrada es nulo.
     */
    @Override
    public Ciudadano convertirDatosDTO(CiudadanoDTO ciudadanoDTO) throws NegociosException {
        if (ciudadanoDTO == null) {
            throw new NegociosException("El cuidadanoDTO es nulo.");
        }

        Ciudadano ciudadano = new Ciudadano(
                ciudadanoDTO.getNombre(),
                ciudadanoDTO.getApellidoP(),
                ciudadanoDTO.getApellidoM(),
                ciudadanoDTO.getCurp(),
                ciudadanoDTO.getContrasenia()
        );

        return ciudadano;
    }

    /**
     * Convierte un objeto CiudadanoDTO en un objeto de entidad Ciudadano sin incluir la contraseña.
     * 
     * @param ciudadanoDTO El objeto CiudadanoDTO a convertir.
     * @return El objeto de entidad Ciudadano correspondiente sin la contraseña.
     * @throws NegociosException Si el objeto CiudadanoDTO de entrada es nulo.
     */
    @Override
    public Ciudadano convertirCiudadanoEntidad(CiudadanoDTO ciudadanoDTO) throws NegociosException {
            Ciudadano ciudadano = new Ciudadano(
                    ciudadanoDTO.getNombre(),
                    ciudadanoDTO.getApellidoP(),
                    ciudadanoDTO.getApellidoM());
            return ciudadano;
    }

    /**
     * Convierte un objeto de entidad Ciudadano en un objeto CiudadanoDTO sin incluir la contraseña.
     * 
     * @param ciudadano El objeto de entidad Ciudadano a convertir.
     * @return El objeto CiudadanoDTO correspondiente sin la contraseña.
     * @throws NegociosException Si el objeto Ciudadano de entrada es nulo.
     */
    @Override
    public CiudadanoDTO convertirCiudadanoDTO(Ciudadano ciudadano) throws NegociosException {
        CiudadanoDTO ciudadanoDTO = new CiudadanoDTO(
        ciudadano.getNombre(),
        ciudadano.getApellidoP(),
        ciudadano.getApellidoM());
        return ciudadanoDTO;
    }
    
     /**
     * Valida el formato de un objeto CiudadanoDTO.
     * 
     * @param ciudadano El objeto CiudadanoDTO a validar.
     * @return Verdadero si el formato de CiudadanoDTO es válido, de lo contrario, falso.
     * @throws NegociosException Si el objeto CiudadanoDTO de entrada es nulo.
     */
    @Override
    public boolean validarFormatoDTO(CiudadanoDTO ciudadano) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
