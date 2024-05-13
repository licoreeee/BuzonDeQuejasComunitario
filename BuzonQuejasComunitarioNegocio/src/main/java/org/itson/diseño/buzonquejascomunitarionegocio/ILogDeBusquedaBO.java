/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.LogDeBusquedaDTO;
import entidades.LogDeBusqueda;
import excepciones.NegociosException;

/**
 *
 * @author Dell
 */
public interface ILogDeBusquedaBO {
    
    public boolean validarFormato(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException;
    
    public LogDeBusqueda convertirDTO(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException;
    
}
