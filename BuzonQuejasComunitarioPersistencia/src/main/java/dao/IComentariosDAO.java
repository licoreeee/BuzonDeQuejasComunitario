/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Comentario;
import java.util.List;
import Excepciones.PersistenciaException;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IComentariosDAO {

    /**
     * Agrega un nuevo comentario a la base de datos.
     *
     * @param comentario El objeto Comentario a agregar.
     * @return El objeto Comentario agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    public Comentario agregarComentario(Comentario comentario) throws PersistenciaException;

    /**
     * Consulta los comentarios asociados a un reporte por su número de folio.
     *
     * @param folio El número de folio del reporte.
     * @return Una lista de comentarios asociados al reporte.
     * @throws FindException Si ocurre un error durante la operación de
     * búsqueda.
     */
    public List<Comentario> consultarComentariosReporte(Integer folio) throws FindException;
}
