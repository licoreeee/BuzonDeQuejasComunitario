/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import conexion.IConexion;
import entidades.Institucion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionDAO implements IInstitucionDAO {

    private final IConexion conexion;
    private final MongoCollection<Institucion> collection;

    public InstitucionDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Instituciones", Institucion.class);
    }

    /*
    *
     */
    @Override
    public Institucion agregarInstitucion(Institucion institucion) throws PersistenciaException {
        try {
            collection.insertOne(institucion);
        } catch (MongoException e) {
            throw new PersistenciaException("Error al crear la institucion");
        }
        return institucion;
    }

    @Override
    public List<Institucion> obtenerInstituciones() throws PersistenciaException {
        try {
            List<Institucion> instituciones = new ArrayList<>();
            MongoCursor<Institucion> cursor = collection.find().iterator();
            try {
                while (cursor.hasNext()) {
                    instituciones.add(cursor.next());
                }
            } finally {
                cursor.close();
            }
            return instituciones;
        } catch (MongoException e) {
            throw new PersistenciaException("Error al obtemer las instituciones");
        }
    }

}
