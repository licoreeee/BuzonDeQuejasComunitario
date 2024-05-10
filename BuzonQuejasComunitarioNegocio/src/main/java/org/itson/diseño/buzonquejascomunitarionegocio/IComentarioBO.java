/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import entidades.Comentario;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IComentarioBO {
    void transporteDatos(ComentarioDTO comentarioDTO)throws PersistenciaException;
    void transporteLista(List<Comentario> comentarios);
    List<ComentarioDTO> convertirListaEntidad(List<Comentario> comentarios);
}
