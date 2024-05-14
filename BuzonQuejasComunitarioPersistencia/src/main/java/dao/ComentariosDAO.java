/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Comentario;
import java.util.List;
import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import conexion.IConexion;
import java.util.ArrayList;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ComentariosDAO implements IComentariosDAO {

    private final IConexion conexion;
    private final MongoCollection<Comentario> collection;

    public ComentariosDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Comentario", Comentario.class);
    }

    @Override
    public Comentario agregarComentario(Comentario comentario) throws PersistenciaException {
        try {
            collection.insertOne(comentario);
        } catch (MongoException e) {
            throw new PersistenciaException("Error al registrar el comentario");
        }
        return comentario;
    }

    @Override
    public List<Comentario> consultarComentariosReporte(Integer folio) throws FindException {
    try {
            List<Comentario> comentarios = new ArrayList<>();
            Bson filter = Filters.eq("folio", folio);
            MongoCursor<Comentario> cursor = collection.find(filter).iterator();
            try {
                while (cursor.hasNext()) {
                    comentarios.add(cursor.next());
                }
            } finally {
                cursor.close();
            }
            return comentarios;
        } catch (MongoException e) {
            throw new FindException ("Error al obtener los comentarios");
        }   
    }
}
