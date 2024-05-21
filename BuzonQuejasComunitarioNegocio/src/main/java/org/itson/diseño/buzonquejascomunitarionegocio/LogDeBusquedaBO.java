/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.ILogDeBusquedaDAO;
import dao.LogDeBusquedaDAO;
import dto.LogDeBusquedaDTO;
import entidades.LogDeBusqueda;
import excepciones.NegociosException;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaBO implements ILogDeBusquedaBO{

    private ILogDeBusquedaDAO logDAO;
    private IConexion conexion;
    
    public LogDeBusquedaBO() {
        conexion = new Conexion();
        this.logDAO = new LogDeBusquedaDAO(conexion);
    }

    /**
     * Convierte un objeto LogDeBusquedaDTO en un objeto de entidad LogDeBusqueda.
     *
     * @param logDeBusquedaDTO El objeto LogDeBusquedaDTO a convertir.
     * @return El objeto de entidad LogDeBusqueda resultante de la conversión.
     */
    @Override
    public LogDeBusqueda convertirDTO(LogDeBusquedaDTO logDeBusquedaDTO) throws PersistenciaException {
            return new LogDeBusqueda(logDeBusquedaDTO.getTitulo(),logDeBusquedaDTO.getInstitucion(),logDeBusquedaDTO.getIncidente());

    }

    @Override
    public LogDeBusquedaDTO agregarLogDeBusqueda(LogDeBusquedaDTO logDeBusquedaDTO) throws PersistenciaException {
        try {
           LogDeBusqueda log = convertirDTO(logDeBusquedaDTO);
           logDAO.agregarLogDeBusqueda(log);
           return logDeBusquedaDTO;
        } catch (PersistenciaException ex) {
            throw new PersistenciaException("Error al intentar agregar el log de búsqueda" + ex.getMessage());
        }

    }

}
