/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.InsertManyOptions;
import conexion.IConexion;
import entidades.Incidentes;
import entidades.Institucion;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidentesDAO implements IIncidentesDAO {

    private final IConexion conexion;
    private final MongoCollection<Incidentes> collection;

    public IncidentesDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Incidentes", Incidentes.class);
    }

    @Override
    public List<Incidentes> agregarIncidentes(List<Incidentes> incidentes) throws FindException {
        try {
            collection.insertMany(incidentes);
        } catch (MongoException e) {
            throw new FindException("Error al agregar los incidentes");
        }
        return incidentes;
    }

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
