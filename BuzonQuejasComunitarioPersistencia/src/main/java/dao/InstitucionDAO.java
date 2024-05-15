/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepciones.FindException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import conexion.IConexion;
import entidades.Institucion;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionDAO implements IInstitucionDAO {

    private final IConexion conexion;
    private final MongoCollection<Institucion> collection;
    private Institucion institucion;

    public InstitucionDAO(IConexion conexion) {
        this.conexion = conexion;
        institucion = new Institucion();
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Instituciones", Institucion.class);
    }

    /*
    *
     */
    @Override
    public Institucion agregarInstitucion(Institucion institucion) throws FindException {
        try {
            collection.insertOne(institucion);
        } catch (MongoException e) {
            throw new FindException("Error al crear la institucion");
        }
        return institucion;
    }

    @Override
    public List<Institucion> obtenerInstituciones() throws FindException {
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
            throw new FindException("Error al obtener las instituciones");
        }
    }

    @Override
    public List<Institucion> obtenerInstitucionesPorId(ObjectId id) throws FindException {
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
            throw new FindException("Error al obtener las instituciones");
        }
    }

    @Override
    public Institucion obtenerInstitucionPorCodigo(String codigoGestion) throws FindException {
        institucion = null;
        try {
            Bson filter = Filters.eq("codigoGestion", codigoGestion);
            MongoCursor<Institucion> cursor = collection.find(filter).iterator();
            try {
                if (cursor.hasNext()) {
                    institucion = cursor.next();
                }

            } finally {
                cursor.close();
            }

        } catch (MongoException e) {
            throw new FindException("Error al obtener la institución");
        }
        return institucion;
    }

}
