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
        String tituloRegex = ".*" + titulo + ".*";
        List <Reporte> reportes = collection.find(Filters.regex("titulo", tituloRegex)).into(new ArrayList<>());
        List<Reporte> reportesCoincididos = new ArrayList() ;
        
        reportes.forEach(reporte -> {
            reporte.setFechaCreacion(dateACalendarSinHora(reporte.getFechaCreacion()).getTime());
            if(reporte.getFechaCreacion().equals(dia)) {
                reportesCoincididos.add(reporte) ;
            }
        });
        return reportesCoincididos;
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorInstitucion(String institucion, Date dia) throws FindException {
        try {
        
        List <Reporte> reportes = collection.find(Filters.eq("institucion.siglas", institucion)).into(new ArrayList<>());
        
        List<Reporte> reportesCoincididos = new ArrayList() ;
        
        reportes.forEach(reporte -> {
            reporte.setFechaCreacion(dateACalendarSinHora(reporte.getFechaCreacion()).getTime());
            if(reporte.getFechaCreacion().equals(dia)) {
                reportesCoincididos.add(reporte) ;
            }
        });
        return reportesCoincididos;
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
        List <Reporte> reportes = collection.find(Filters.and(Filters.regex("titulo", tituloRegex),Filters.eq("institucion.siglas", institucion))).into(new ArrayList<>());
        
        List<Reporte> reportesCoincididos = new ArrayList() ;
        
        reportes.forEach(reporte -> {
            reporte.setFechaCreacion(dateACalendarSinHora(reporte.getFechaCreacion()).getTime());
            if(reporte.getFechaCreacion().equals(dia)) {
                reportesCoincididos.add(reporte) ;
            }
        });
        return reportesCoincididos;
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Date dia) throws FindException {
        try {
        
        List <Reporte> reportes = collection.find(Filters.and(Filters.eq("institucion.siglas", institucion),Filters.eq("incidentes.informacion", incidente))).into(new ArrayList<>());
        
        List<Reporte> reportesCoincididos = new ArrayList() ;
        
        reportes.forEach(reporte -> {
            reporte.setFechaCreacion(dateACalendarSinHora(reporte.getFechaCreacion()).getTime());
            if(reporte.getFechaCreacion().equals(dia)) {
                reportesCoincididos.add(reporte) ;
            }
        });
        return reportesCoincididos;
    } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }

    @Override
    public List<Reporte> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Date dia) throws FindException {
        try {
        String tituloRegex = ".*" + titulo + ".*";
        List <Reporte> reportes = collection.find(Filters.and(Filters.regex("titulo", tituloRegex),Filters.eq("institucion.siglas", institucion),Filters.eq("incidente.informacion", incidente))).into(new ArrayList<>());
        
        List<Reporte> reportesCoincididos = new ArrayList() ;
        
        reportes.forEach(reporte -> {
            reporte.setFechaCreacion(dateACalendarSinHora(reporte.getFechaCreacion()).getTime());
            if(reporte.getFechaCreacion().equals(dia)) {
                reportesCoincididos.add(reporte) ;
            }
        });
        return reportesCoincididos;
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
    
    @Override
    public List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException {
        try {
        String institucionRegex = ".*" + institucion + ".*";
        return collection.find(Filters.regex("institucion.siglas", institucionRegex)).into(new ArrayList<>());
        } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }
    
    private Calendar dateACalendarSinHora(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // Resetear los campos de fecha y hora
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar;
    }
}
