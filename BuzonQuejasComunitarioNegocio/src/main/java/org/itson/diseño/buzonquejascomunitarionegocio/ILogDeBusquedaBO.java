/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.PersistenciaException;
import dto.LogDeBusquedaDTO;
import entidades.LogDeBusqueda;
import excepciones.NegociosException;

/**
 *
 * @author Dell
 */
public interface ILogDeBusquedaBO {

    public LogDeBusquedaDTO agregarLogDeBusqueda(LogDeBusquedaDTO logDeBusquedaDTO) throws PersistenciaException;

    /**
     * Convierte un objeto LogDeBusquedaDTO en un objeto de entidad
     * LogDeBusqueda.
     *
     * @param logDeBusquedaDTO El objeto LogDeBusquedaDTO a convertir.
     * @return El objeto de entidad LogDeBusqueda resultante de la conversión.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    public LogDeBusqueda convertirDTO(LogDeBusquedaDTO logDeBusquedaDTO) throws PersistenciaException;

}
