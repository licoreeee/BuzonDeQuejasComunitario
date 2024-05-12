package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import entidades.Ciudadano;
import excepciones.NegociosException;
import org.bson.types.ObjectId;


/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class CiudadanoBO implements ICiudadanoBO {

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

    @Override
    public Ciudadano convertirCiudadanoEntidad(CiudadanoDTO ciudadanoDTO) throws NegociosException {
            Ciudadano ciudadano = new Ciudadano(
                    ciudadanoDTO.getNombre(),
                    ciudadanoDTO.getApellidoP(),
                    ciudadanoDTO.getApellidoM());
            return ciudadano;
    }

    @Override
    public CiudadanoDTO convertirCiudadanoDTO(Ciudadano ciudadano) throws NegociosException {
        CiudadanoDTO ciudadanoDTO = new CiudadanoDTO(
        ciudadano.getNombre(),
        ciudadano.getApellidoP(),
        ciudadano.getApellidoM());
        return ciudadanoDTO;
    }
    
    @Override
    public boolean validarFormatoDTO(CiudadanoDTO ciudadano) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
