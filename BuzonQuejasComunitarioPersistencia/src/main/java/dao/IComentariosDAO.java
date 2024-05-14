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
    public Comentario agregarComentario(Comentario comentario) throws PersistenciaException;
     public List<Comentario> consultarComentariosReporte(Integer folio) throws FindException;
}
