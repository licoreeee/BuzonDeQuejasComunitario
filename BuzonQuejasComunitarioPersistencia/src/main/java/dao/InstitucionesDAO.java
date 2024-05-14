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
 * Clase que implementa la interfaz IInstitucionDAO para manipular las
 * instituciones en la base de datos.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionesDAO implements IInstitucionDAO {

    private final IConexion conexion;
    private final MongoCollection<Institucion> collection;

    /* *
     * Constructor de la clase.
     * @param conexion Maneja la conexión a la base de datos de Mongo.
     */
    public InstitucionesDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Instituciones", Institucion.class);
    }

    /*
    * Método para agregar una institución a la base de datos.
    * @param institucion La institución a agregar.
    * @return La institución agregada.
    * @throws FindException Si ocurre un error al agregar la institución.
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

    /* *
     * Método para obtener todas las instituciones de la base de datos.
     * @return Una lista de todas las instituciones.
     * @throws FindException Si ocurre un error al obtener las instituciones.
     */
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

    /* *
     * Método para obtener todas las instituciones por su ID.
     * @param id El ObjectId de la institución.
     * @return Una lista de instituciones correspondientes al ID especificado.
     * @throws FindException Si ocurre un error al obtener las instituciones por su ID.
     */
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

    /* *
     * Método para obtener una institución por su código de gestión.
     * @param codigoGestion El código de gestión de la institución.
     * @return La institución correspondiente al código de gestión especificado.
     * @throws FindException Si ocurre un error al obtener la institución por su código de gestión.
     */
    @Override
    public Institucion obtenerInstitucionPorCodigo(String codigoGestion) throws FindException {
        try {
            Bson filter = Filters.eq("codigoGestion", codigoGestion);
            try (MongoCursor<Institucion> cursor = collection.find(filter).iterator()) {
                if (cursor.hasNext()) {
                    return cursor.next();
                } else {
                    return null;
                }
            }
        } catch (MongoException e) {
            throw new FindException("Error al obtener la institución");
        }

    }

}
