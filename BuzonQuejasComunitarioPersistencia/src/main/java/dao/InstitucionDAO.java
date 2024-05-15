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
 * @author Hisamy Cota, Gael Castro, Victoria Vega
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

    /**
     * Agrega una nueva institución a la base de datos.
     *
     * @param institucion La institución a agregar.
     * @return La institución agregada.
     * @throws FindException Si ocurre un error durante la operación de
     * inserción.
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

    /**
     * Obtiene todas las instituciones almacenadas en la base de datos.
     *
     * @return Una lista de todas las instituciones almacenadas.
     * @throws FindException Si ocurre un error durante la operación de
     * búsqueda.
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

    /**
     * Obtiene una institución por su código de gestión.
     *
     * @param codigoGestion El código de gestión de la institución.
     * @return La institución correspondiente al código de gestión especificado.
     * @throws FindException Si ocurre un error durante la operación de
     * búsqueda.
     */
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
