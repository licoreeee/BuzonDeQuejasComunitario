/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Ciudadano;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class CiudadanoBO implements ICiudadanoBO {

    /**
     * Transporta los datos de un objeto CiudadanoDTO a través de otro objeto
     * CiudadanoDTO. Crea un nuevo objeto CiudadanoDTO con los mismos atributos
     * que el ciudadanoDTO pasado como parámetro. Luego, llama al método
     * convertirDatos para realizar la conversión y devuelve el resultado.
     *
     * @param ciudadanoDTO El objeto CiudadanoDTO del cual se transportarán los
     * datos.
     * @return El objeto CiudadanoDTO resultante después de la conversión.
     */
    @Override
    public CiudadanoDTO transporteDatos(CiudadanoDTO ciudadanoDTO) {
        CiudadanoDTO ciudadano = new CiudadanoDTO(
                ciudadanoDTO.getNombre(),
                ciudadanoDTO.getApellidoP(),
                ciudadanoDTO.getApellidoM(),
                ciudadanoDTO.getCURP(),
                ciudadanoDTO.getTelefono(),
                ciudadanoDTO.getCorreo());
        convertirDatos(ciudadano);
        return ciudadano;
    }

    /**
     * Convierte un objeto CiudadanoDTO en un objeto Ciudadano. Crea un nuevo
     * objeto Ciudadano con los mismos atributos que el ciudadanoDTO pasado como
     * parámetro.
     *
     * @param ciudadanoDTO El objeto CiudadanoDTO que se convertirá en un objeto
     * Ciudadano.
     * @return El objeto Ciudadano resultante de la conversión.
     */
    @Override
    public Ciudadano convertirDatos(CiudadanoDTO ciudadanoDTO) {
        Ciudadano ciudadano = new Ciudadano(
                ciudadanoDTO.getNombre(),
                ciudadanoDTO.getApellidoP(),
                ciudadanoDTO.getApellidoM(),
                ciudadanoDTO.getCURP(),
                ciudadanoDTO.getTelefono(),
                ciudadanoDTO.getCorreo());
        return ciudadano;
    }

}
