/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Excepciones.FindException;
import java.util.Calendar;
import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import conexion.IConexion;
import entidades.Reporte;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class ReportesDAO implements IReportesDAO {

    private final IConexion conexion;
    private final MongoCollection<Reporte> collection;

    public ReportesDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Reporte", Reporte.class);
    }

    @Override
    public Reporte agregarReporte(Reporte reporte) throws PersistenciaException {
        try {
            collection.insertOne(reporte);
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al agregar el reporte.");
        }
        return reporte;
    }

    @Override
    public List<Reporte> obtenerReportePorTitulo(String titulo) throws FindException {
        try {
            return collection.find(Filters.eq("titulo", titulo)).into(new ArrayList());
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    @Override
    public List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException {
        try {
            return collection.find(Filters.eq("institucion.siglas", institucion)).into(new ArrayList());
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    @Override
    public List<Reporte> obtenerReportePorIncidente(String incidente) throws FindException {
        try {
            return collection.find(Filters.eq("incidente.nombre", incidente)).into(new ArrayList());
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    @Override
    public List<Reporte> obtenerReportePorFecha(Calendar fechaInicio, Calendar fechaFinal) throws FindException {
        try {
            return collection.find(Filters.and(
                Filters.gte("fechaCreacion", fechaInicio),
                Filters.lte("fechaCreacion", fechaFinal))).into(new ArrayList());
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }
    
    @Override
    public List<Reporte> obtenerReportesPorInstitucion(ObjectId idInstitucion) throws FindException {
        try {
            List<Reporte> reportes = new ArrayList<>();
            Bson filter = Filters.eq("reporteId", idInstitucion);
            MongoCursor<Reporte> cursor = collection.find(filter).iterator();
            try {
                while (cursor.hasNext()) {
                    reportes.add(cursor.next());
                }
            } finally {
                cursor.close();
            }
            return reportes;
        } catch (MongoException e) {
            throw new FindException("Error al obtener los reportes");
        }
    }

}
