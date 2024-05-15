/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.LogDeBusquedaDTO;
import entidades.Ciudadano;
import entidades.LogDeBusqueda;
import excepciones.NegociosException;
import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaBO implements ILogDeBusquedaBO{

    ICiudadanoBO ciudadanoBO;

    /**
     * Constructor que permite inyectar una instancia de ICiudadanoBO.
     * 
     * @param ciudadanoBO La instancia de ICiudadanoBO a utilizar.
     */
    public LogDeBusquedaBO(ICiudadanoBO ciudadanoBO) {
        this.ciudadanoBO = ciudadanoBO;
    }
        
     /**
     * Valida el formato de un objeto LogDeBusquedaDTO.
     * 
     * @param logDeBusquedaDTO El objeto LogDeBusquedaDTO a validar.
     * @return true si el formato del LogDeBusquedaDTO es válido, de lo contrario, false.
     * @throws NegociosException Si ocurre un error durante la validación.
     */
    @Override
    public boolean validarFormato(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Convierte un objeto LogDeBusquedaDTO en un objeto de entidad LogDeBusqueda.
     *
     * @param logDeBusquedaDTO El objeto LogDeBusquedaDTO a convertir.
     * @return El objeto de entidad LogDeBusqueda resultante de la conversión.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    @Override
    public LogDeBusqueda convertirDTO(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException {
        try {
            Ciudadano ciudadano = ciudadanoBO.convertirCiudadanoEntidad(logDeBusquedaDTO.getCiudadanoDTO());
            return new LogDeBusqueda(ciudadano, logDeBusquedaDTO.getFiltros());
        } catch (NegociosException ex) {
            throw new NegociosException("Error al convertir LogDeBusquedaDTO a entidad.");
        }
    }

}
