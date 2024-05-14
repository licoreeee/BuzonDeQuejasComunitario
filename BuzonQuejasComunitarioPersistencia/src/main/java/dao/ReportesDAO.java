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
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import conexion.IConexion;
import entidades.Reporte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.Document;
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
        this.collection = database.getCollection("Reportes", Reporte.class);
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
    public List<Reporte> obtenerReportePorTitulo(String titulo, Date dia) throws FindException {
        try {
            String regexPattern = ".*" + titulo + ".*";
            return collection.find(Filters.and(
                    Filters.regex("titulo", regexPattern),
                    Filters.eq("fechaCreacion", dia))).into(new ArrayList<>());
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    @Override
    public List<Reporte> obtenerReportePorInstitucion(String institucion, Date dia) throws FindException {
        try {
        String regexPattern = ".*" + institucion + ".*";
        return collection.find(Filters.and(
                Filters.eq("fechaCreacion", dia),
                Filters.regex("institucion.siglas", regexPattern))).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorIncidente(String incidente, Date dia) throws FindException {
        try {
        String regexPattern = ".*" + incidente + ".*";
        return collection.find(Filters.and(
                Filters.eq("fechaCreacion", dia),
                Filters.regex("incidente.nombre", regexPattern))).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorDia(Date dia) throws FindException {
        try {
            return collection.find(Filters.eq("fechaCreacion", dia)).into(new ArrayList());
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    @Override
    public void actualizarEstado(Reporte reporte) throws PersistenciaException {
        Document updateDoc = new Document("$set", new Document("estado", false));
        collection.updateOne(Filters.eq("folio", reporte.getFolio()), updateDoc);
    }

    @Override
    public List<Reporte> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Date dia) throws FindException {
        try {
        String tituloRegex = ".*" + titulo + ".*";
        String institucionRegex = ".*" + institucion + ".*";
        return collection.find(Filters.and(
                Filters.eq("fechaCreacion", dia),
                Filters.regex("titulo", tituloRegex),
                Filters.regex("institucion.siglas", institucionRegex))).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorTituloYIncidente(String titulo, String incidente, Date dia) throws FindException {
        try {
        String tituloRegex = ".*" + titulo + ".*";
        String incidenteRegex = ".*" + incidente + ".*";
        return collection.find(Filters.and(
                Filters.eq("fechaCreacion", dia),
                Filters.regex("titulo", tituloRegex),
                Filters.regex("incidente.nombre", incidenteRegex))).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Date dia) throws FindException {
        try {
        String institucionRegex = ".*" + institucion + ".*";
        String incidenteRegex = ".*" + incidente + ".*";
        return collection.find(Filters.and(
                Filters.eq("fechaCreacion", dia),
                Filters.regex("institucion.siglas", institucionRegex),
                Filters.regex("incidente.nombre", incidenteRegex))).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Date dia) throws FindException {
        try {
        String tituloRegex = ".*" + titulo + ".*";
        String institucionRegex = ".*" + institucion + ".*";
        String incidenteRegex = ".*" + incidente + ".*";
        return collection.find(Filters.and(
                Filters.eq("fechaCreacion", dia),
                Filters.regex("titulo", tituloRegex),
                Filters.regex("institucion.siglas", institucionRegex),
                Filters.regex("incidente.nombre", incidenteRegex))).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }
    
    @Override
    public List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException {
        try {
        String institucionRegex = ".*" + institucion + ".*";
        return collection.find(Filters.regex("institucion.siglas", institucionRegex)).into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerTodosLosReportes() throws FindException {
        try {
        return collection.find().into(new ArrayList<>());
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

}
