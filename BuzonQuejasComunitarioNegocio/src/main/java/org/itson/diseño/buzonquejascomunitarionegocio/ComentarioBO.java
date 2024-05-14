/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.ComentariosDAO;
import dto.ComentarioDTO;
import dto.ReporteDTO;
import entidades.Comentario;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.Binary;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ComentarioBO implements IComentarioBO {

    private final ComentariosDAO comentariosDAO;
    private Comentario comentario;
    final IConexion conexion;

    public ComentarioBO() {
        conexion = new Conexion();
        comentariosDAO = new ComentariosDAO(conexion);
        comentario = new Comentario();
    }

    @Override
    public void transporteDatos(ComentarioDTO comentarioDTO) throws PersistenciaException {
        if (comentarioDTO.getPhoto() == null) {
            comentario = new Comentario(
                    comentarioDTO.getTitulo(),
                    comentarioDTO.getComentario(),
                    comentarioDTO.getFolio(),
                    comentarioDTO.getFechaCreacion());
        } else {
            byte[] photo = comentarioDTO.getPhoto();
            Binary binaryPhoto = new Binary(photo);

            comentario = new Comentario(
                    comentarioDTO.getTitulo(),
                    comentarioDTO.getComentario(),
                    binaryPhoto,
                    comentarioDTO.getFolio(),
                    comentarioDTO.getFechaCreacion()
            );

        }
        comentariosDAO.agregarComentario(comentario);

    }

    @Override
    public List<ComentarioDTO> consultarLista(ReporteDTO reporteDTO) throws FindException {
        List<ComentarioDTO> comentariosDTO = new ArrayList<>();
        List<Comentario> comentarios = comentariosDAO.consultarComentariosReporte(reporteDTO.getFolio());
        for (Comentario comment : comentarios) {
            if(comment.getPhoto()!=null){
                 byte[] photoBytes = comment.getPhoto().getData();
                ComentarioDTO comentarioDTO = new ComentarioDTO(
                    comment.getTitulo(),
                    comment.getComentario(),
                    photoBytes,
                    comment.getFolio(),
                    comment.getFechaCreacion());

            comentariosDTO.add(comentarioDTO);
            }
            else{
                ComentarioDTO comentarioDTO = new ComentarioDTO(
                    comment.getTitulo(),
                    comment.getComentario(),
                    comment.getFolio(),
                    comment.getFechaCreacion());

            comentariosDTO.add(comentarioDTO);
            }
           
        }

        return comentariosDTO;

    }
}
