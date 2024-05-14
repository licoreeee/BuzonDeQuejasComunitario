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
    void transporteDatos(ComentarioDTO comentarioDTO)throws PersistenciaException;
    List<ComentarioDTO> consultarLista(ReporteDTO reporteDTO) throws FindException;
}
