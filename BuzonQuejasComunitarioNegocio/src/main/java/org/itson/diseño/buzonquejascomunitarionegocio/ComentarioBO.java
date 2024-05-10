/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ComentarioDTO;
import entidades.Comentario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ComentarioBO implements IComentarioBO {

    @Override
    public void transporteDatos(ComentarioDTO comentarioDTO) {
        convertirDatosDTO(comentarioDTO);
    }

    @Override
    public Comentario convertirDatosDTO(ComentarioDTO comentarioDTO) {
        Comentario comentario = new Comentario(
                comentarioDTO.getTitulo(),
                comentarioDTO.getComentario(),
                comentarioDTO.getPhoto());
        return comentario;
    }

    @Override
    public void transporteLista(List<Comentario> comentarios) {
        convertirListaEntidad(comentarios);

    }

    @Override
    public List<ComentarioDTO> convertirListaEntidad(List<Comentario> comentarios) {
        List<ComentarioDTO> comentariosDTO = new ArrayList<>();

        for (Comentario comentario : comentarios) {
            ComentarioDTO comentarioDTO = new ComentarioDTO(
                    comentario.getTitulo(),
                    comentario.getComentario(),
                    comentario.getPhoto());
            comentariosDTO.add(comentarioDTO);
        }

        return comentariosDTO;

    }
}
