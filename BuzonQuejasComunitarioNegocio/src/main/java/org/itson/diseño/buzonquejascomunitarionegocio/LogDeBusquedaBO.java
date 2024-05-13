/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.LogDeBusquedaDTO;
import entidades.LogDeBusqueda;
import excepciones.NegociosException;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaBO implements ILogDeBusquedaBO{

    ICiudadanoBO ciudadanoBO;

    public LogDeBusquedaBO(ICiudadanoBO ciudadanoBO) {
        this.ciudadanoBO = ciudadanoBO;
    }
        
    @Override
    public boolean validarFormato(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LogDeBusqueda convertirDTO(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException {
        try {
            return new LogDeBusqueda(ciudadanoBO.convertirCiudadanoEntidad(logDeBusquedaDTO.getCiudadanoDTO()), logDeBusquedaDTO.getFiltros());
        } catch (NegociosException ex) {
            throw new NegociosException("Error al convertir LogDeBusquedaDTO a LogDeBusqueda.");
        }
    }
    
}
