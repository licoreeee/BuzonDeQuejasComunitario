/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.ComentariosDAO;
import dto.ComentarioDTO;
import entidades.Comentario;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.Binary;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ComentarioBO implements IComentarioBO {

    private final ComentariosDAO comentariosDAO;
    final IConexion conexion;

    public ComentarioBO() {
        conexion = new Conexion();
        comentariosDAO = new ComentariosDAO(conexion);
    }

    @Override
    public void transporteDatos(ComentarioDTO comentarioDTO) throws PersistenciaException {
        byte[] photo = comentarioDTO.getPhoto();
        Binary binaryPhoto = new Binary(photo);

        Comentario comentario = new Comentario(
                comentarioDTO.getTitulo(),
                comentarioDTO.getComentario(),
                binaryPhoto
        );
        comentariosDAO.agregarComentario(comentario);

    }

    @Override
    public void transporteLista(List<Comentario> comentarios) {
        convertirListaEntidad(comentarios);

    }

    @Override
    public List<ComentarioDTO> convertirListaEntidad(List<Comentario> comentarios) {
        List<ComentarioDTO> comentariosDTO = new ArrayList<>();

        for (Comentario comentario : comentarios) {
            byte[] photoBytes = comentario.getPhoto().getData();

            ComentarioDTO comentarioDTO = new ComentarioDTO(
                    comentario.getTitulo(),
                    comentario.getComentario(),
                    photoBytes);
            
            comentariosDTO.add(comentarioDTO);
        }

        return comentariosDTO;

    }
}
