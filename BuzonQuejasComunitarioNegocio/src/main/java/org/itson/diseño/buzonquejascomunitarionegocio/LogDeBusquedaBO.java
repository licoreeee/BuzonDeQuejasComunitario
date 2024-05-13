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
            Ciudadano ciudadano = ciudadanoBO.convertirCiudadanoEntidad(logDeBusquedaDTO.getCiudadanoDTO());
            return new LogDeBusqueda(ciudadano, logDeBusquedaDTO.getFiltros());
        } catch (NegociosException ex) {
            throw new NegociosException("Error al convertir LogDeBusquedaDTO a entidad.");
        }
    }

}
