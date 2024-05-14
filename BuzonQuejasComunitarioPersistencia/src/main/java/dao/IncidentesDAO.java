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
import entidades.Incidentes;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Clase que implementa la interfaz IIncidentesDAO para manipular los incidentes
 * en la base de datos.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidentesDAO implements IIncidentesDAO {

    private final IConexion conexion;
    private final MongoCollection<Incidentes> collection;

    /* *
     * Constructor de la clase.
     * @param conexion Maneja la conexión a la base de datos de Mongo.
     */
    public IncidentesDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Incidentes", Incidentes.class);
    }

    /* *
     * Método para agregar una lista de incidentes a la base de datos.
     * @param incidentes Lista de incidentes a agregar.
     * @return La lista de incidentes agregados.
     * @throws FindException Si ocurre un error al agregar los incidentes.
     */
    @Override
    public List<Incidentes> agregarIncidentes(List<Incidentes> incidentes) throws FindException {
        try {
            collection.insertMany(incidentes);
        } catch (MongoException e) {
            throw new FindException("Error al agregar los incidentes");
        }
        return incidentes;
    }

    /* *
     * Método para obtener una lista de incidentes asociados a una institución.
     * @param institucionId El ObjectId de la institución.
     * @return La lista de incidentes asociados a la institución.
     * @throws FindException Si ocurre un error al obtener los incidentes.
     */
    @Override
    public List<Incidentes> obtenerIncidentes(ObjectId institucionId) throws FindException {
        try {
            List<Incidentes> incidentesBusqueda = new ArrayList<>();
            Bson filter = Filters.eq("institucionId", institucionId);
            MongoCursor<Incidentes> cursor = collection.find(filter).iterator();
            try {
                while (cursor.hasNext()) {
                    incidentesBusqueda.add(cursor.next());
                }
            } finally {
                cursor.close();
            }
            return incidentesBusqueda;
        } catch (MongoException e) {
            throw new FindException("Error al obtener las instituciones");
        }
    }
}
