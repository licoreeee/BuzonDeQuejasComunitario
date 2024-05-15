/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import dto.ReporteDTO;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IComentarioBO {

    /**
     * Transporta los datos del objeto ComentarioDTO a la capa de persistencia.
     *
     * @param comentarioDTO El objeto ComentarioDTO que contiene los datos del
     * comentario a transportar.
     * @throws PersistenciaException Si ocurre un error durante la persistencia.
     */
    public void transporteDatos(ComentarioDTO comentarioDTO) throws PersistenciaException;

    /**
     * Consulta una lista de comentarios asociados a un reporte y los devuelve
     * como una lista de objetos ComentarioDTO.
     *
     * @param reporteDTO El objeto ReporteDTO que contiene los datos del reporte
     * para el cual se consultan los comentarios.
     * @return Una lista de objetos ComentarioDTO que representan los
     * comentarios consultados.
     * @throws FindException Si ocurre un error durante la consulta.
     */
    public List<ComentarioDTO> consultarLista(ReporteDTO reporteDTO) throws FindException;
}
