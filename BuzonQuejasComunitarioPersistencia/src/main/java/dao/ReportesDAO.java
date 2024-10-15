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
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Gael Castro, Hisamy Cinco, Victoria Vega
 */
public class ReportesDAO implements IReportesDAO {

    private final IConexion conexion;
    private final MongoCollection<Reporte> collection;

    public ReportesDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Reportes", Reporte.class);
    }

    /**
     * Agrega un reporte a la base de datos.
     *
     * @param reporte El reporte a agregar.
     * @return El reporte agregado.
     * @throws PersistenciaException Si ocurre un error durante la inserción del reporte.
     */
    @Override
    public Reporte agregarReporte(Reporte reporte) throws PersistenciaException {
        try {
            collection.insertOne(reporte);
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al agregar el reporte.");
        }
        return reporte;
    }

    /**
     * Obtiene una lista de reportes por título y fecha.
     *
     * @param titulo El título del reporte a buscar.
     * @param dia La fecha del reporte a buscar.
     * @return Lista de reportes que coinciden con el título y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorTitulo(String titulo, Date dia) throws FindException {
        try {
        titulo = Normalizer.normalize(titulo, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

        String tituloRegex = ".*" + Pattern.quote(titulo) + ".*";
        
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

    /**
     * Obtiene una lista de reportes por institución y fecha.
     *
     * @param institucion La institución asociada a los reportes a buscar.
     * @param dia La fecha de los reportes a buscar.
     * @return Lista de reportes que coinciden con la institución y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
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

    /**
     * Actualiza el estado de un reporte en la base de datos.
     *
     * @param reporte El reporte cuyo estado se va a actualizar.
     * @throws PersistenciaException Si ocurre un error durante la actualización del estado del reporte.
     */
    @Override
    public void actualizarEstado(Reporte reporte) throws PersistenciaException {
        Document updateDoc = new Document("$set", new Document("estado", false));
        collection.updateOne(Filters.eq("folio", reporte.getFolio()), updateDoc);
    }

    /**
     * Obtiene una lista de reportes por título, institución y fecha.
     *
     * @param titulo El título del reporte a buscar.
     * @param institucion La institución asociada al reporte a buscar.
     * @param dia La fecha del reporte a buscar.
     * @return Lista de reportes que coinciden con el título, la institución y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Date dia) throws FindException {
        try {
        titulo = Normalizer.normalize(titulo, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

        String tituloRegex = ".*" + Pattern.quote(titulo) + ".*";
        
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

    /**
     * Obtiene una lista de reportes por institución, incidente y fecha.
     *
     * @param institucion La institución asociada a los reportes a buscar.
     * @param incidente El tipo de incidente asociado a los reportes a buscar.
     * @param dia La fecha de los reportes a buscar.
     * @return Lista de reportes que coinciden con la institución, el incidente y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Date dia) throws FindException {
        try {
        
        List <Reporte> reportes = collection.find(Filters.and(Filters.eq("institucion.siglas", institucion),Filters.eq("incidente.informacion", incidente))).into(new ArrayList<>());
        
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

    /**
     * Obtiene una lista de reportes por título, institución, incidente y fecha.
     *
     * @param titulo El título del reporte a buscar.
     * @param institucion La institución asociada al reporte a buscar.
     * @param incidente El tipo de incidente asociado al reporte a buscar.
     * @param dia La fecha del reporte a buscar.
     * @return Lista de reportes que coinciden con el título, la institución, el incidente y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Date dia) throws FindException {
        try {
        titulo = Normalizer.normalize(titulo, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

        String tituloRegex = ".*" + Pattern.quote(titulo) + ".*";
        
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

    /**
     * Obtiene una lista de todos los reportes.
     *
     * @return Lista de todos los reportes disponibles.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerTodosLosReportes() throws FindException {
        try {
            List<Reporte> reportes = collection.find().into(new ArrayList<>());

            List<Reporte> reportesCoincididos = new ArrayList();

            reportes.forEach(reporte -> {
                reporte.setFechaCreacion(dateACalendarSinHora(reporte.getFechaCreacion()).getTime());
                    reportesCoincididos.add(reporte);
            });
            return reportesCoincididos;
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }
    
    /**
     * Obtiene una lista de reportes por institución.
     *
     * @param institucion La institución asociada a los reportes a buscar.
     * @return Lista de reportes que coinciden con la institución especificada.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException {
        try {
        String institucionRegex = ".*" + institucion + ".*";
        return collection.find(Filters.regex("institucion.siglas", institucionRegex)).into(new ArrayList<>());
        } catch (MongoException ex) {
        throw new FindException("Error al obtener los reportes.");
    }
    }
    
    /**
     * Obtiene una lista de reportes por período de tiempo.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @return Lista de reportes que coinciden con el período y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorPeriodo(Date fechaInicio, Date fechaFin, Date dia) throws FindException {
        try {
            Calendar calFechaInicio = dateACalendarSinHora(fechaInicio);
            Calendar calFechaFin = dateACalendarSinHora(fechaFin);

            calFechaFin.add(Calendar.DAY_OF_MONTH, 1);

            Date fechaInicioSinHora = calFechaInicio.getTime();
            Date fechaFinSinHora = calFechaFin.getTime();

            List<Reporte> reportes = collection.find(Filters.and(Filters.gte("fechaCreacion", fechaInicioSinHora),Filters.lt("fechaCreacion", fechaFinSinHora))).into(new ArrayList<>());

            List<Reporte> reportesCoincididos = new ArrayList<>();
            reportes.forEach(reporte -> {
                Calendar calFechaReporte = dateACalendarSinHora(reporte.getFechaCreacion());
                if (calFechaReporte.getTime().equals(dia)) {
                    reportesCoincididos.add(reporte);
                }
            });

            return reportesCoincididos;
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }
    
    /**
     * Convierte un objeto Date a un objeto Calendar sin la parte de la hora.
     *
     * @param date La fecha a convertir.
     * @return Objeto Calendar sin la parte de la hora.
     */
    private Calendar dateACalendarSinHora(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }
   /**
     * Obtiene una lista de reportes por período de tiempo.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @return Lista de reportes que coinciden con el período y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorPeriodoYTitulo(Date fechaInicio, Date fechaFin, Date dia, String titulo) throws FindException {
        try {
            titulo = Normalizer.normalize(titulo, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

            String tituloRegex = ".*" + Pattern.quote(titulo) + ".*";
            
            Calendar calFechaInicio = dateACalendarSinHora(fechaInicio);
            Calendar calFechaFin = dateACalendarSinHora(fechaFin);

            calFechaFin.add(Calendar.DAY_OF_MONTH, 1);

            Date fechaInicioSinHora = calFechaInicio.getTime();
            Date fechaFinSinHora = calFechaFin.getTime();

            List<Reporte> reportes = collection.find(Filters.and(Filters.gte("fechaCreacion", fechaInicioSinHora),Filters.lt("fechaCreacion", fechaFinSinHora),Filters.regex("titulo", tituloRegex))).into(new ArrayList<>());

            List<Reporte> reportesCoincididos = new ArrayList<>();
            reportes.forEach(reporte -> {
                Calendar calFechaReporte = dateACalendarSinHora(reporte.getFechaCreacion());
                if (calFechaReporte.getTime().equals(dia)) {
                    reportesCoincididos.add(reporte);
                }
            });

            return reportesCoincididos;
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    /**
     * Obtiene una lista de reportes por período de tiempo y título.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @param titulo El título del reporte a buscar.
     * @return Lista de reportes que coinciden con el período, la fecha y el título especificados.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorPeriodoYTituloYInstitucion(Date fechaInicio, Date fechaFin, Date dia, String titulo, String institucion) throws FindException {
        try {
            titulo = Normalizer.normalize(titulo, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

            String tituloRegex = ".*" + Pattern.quote(titulo) + ".*";
            
            Calendar calFechaInicio = dateACalendarSinHora(fechaInicio);
            Calendar calFechaFin = dateACalendarSinHora(fechaFin);

            calFechaFin.add(Calendar.DAY_OF_MONTH, 1);

            Date fechaInicioSinHora = calFechaInicio.getTime();
            Date fechaFinSinHora = calFechaFin.getTime();

            List<Reporte> reportes = collection.find(Filters.and(Filters.gte("fechaCreacion", fechaInicioSinHora),Filters.lt("fechaCreacion", fechaFinSinHora),Filters.regex("titulo", tituloRegex),Filters.eq("institucion.siglas", institucion))).into(new ArrayList<>());

            List<Reporte> reportesCoincididos = new ArrayList<>();
            reportes.forEach(reporte -> {
                Calendar calFechaReporte = dateACalendarSinHora(reporte.getFechaCreacion());
                if (calFechaReporte.getTime().equals(dia)) {
                    reportesCoincididos.add(reporte);
                }
            });

            return reportesCoincididos;
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    /**
     * Obtiene una lista de reportes por período de tiempo, título e institución.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @param titulo El título del reporte a buscar.
     * @param institucion La institución asociada al reporte a buscar.
     * @return Lista de reportes que coinciden con el período, la fecha, el título y la institución especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorPeriodoYTituloYInstiticionYIncidente(Date fechaInicio, Date fechaFin, Date dia, String titulo, String institucion, String incidente) throws FindException {
        try {
            titulo = Normalizer.normalize(titulo, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .toLowerCase();

            String tituloRegex = ".*" + Pattern.quote(titulo) + ".*";
            
            Calendar calFechaInicio = dateACalendarSinHora(fechaInicio);
            Calendar calFechaFin = dateACalendarSinHora(fechaFin);

            calFechaFin.add(Calendar.DAY_OF_MONTH, 1);

            Date fechaInicioSinHora = calFechaInicio.getTime();
            Date fechaFinSinHora = calFechaFin.getTime();

            List<Reporte> reportes = collection.find(Filters.and(Filters.gte("fechaCreacion", fechaInicioSinHora),Filters.lt("fechaCreacion", fechaFinSinHora),Filters.regex("titulo", tituloRegex),Filters.eq("institucion.siglas", institucion),Filters.eq("incidente.informacion", incidente))).into(new ArrayList<>());

            List<Reporte> reportesCoincididos = new ArrayList<>();
            reportes.forEach(reporte -> {
                Calendar calFechaReporte = dateACalendarSinHora(reporte.getFechaCreacion());
                if (calFechaReporte.getTime().equals(dia)) {
                    reportesCoincididos.add(reporte);
                }
            });

            return reportesCoincididos;
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

    /**
     * Obtiene una lista de reportes por período de tiempo e institución.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @param institucion La institución asociada a los reportes a buscar.
     * @return Lista de reportes que coinciden con el período, la fecha y la institución especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    @Override
    public List<Reporte> obtenerReportePorPeriodoYInstitucion(Date fechaInicio, Date fechaFin, Date dia, String institucion) throws FindException {
        try {
            Calendar calFechaInicio = dateACalendarSinHora(fechaInicio);
            Calendar calFechaFin = dateACalendarSinHora(fechaFin);

            calFechaFin.add(Calendar.DAY_OF_MONTH, 1);

            Date fechaInicioSinHora = calFechaInicio.getTime();
            Date fechaFinSinHora = calFechaFin.getTime();

            List<Reporte> reportes = collection.find(Filters.and(Filters.gte("fechaCreacion", fechaInicioSinHora),Filters.lt("fechaCreacion", fechaFinSinHora),Filters.eq("institucion.siglas", institucion))).into(new ArrayList<>());

            List<Reporte> reportesCoincididos = new ArrayList<>();
            reportes.forEach(reporte -> {
                Calendar calFechaReporte = dateACalendarSinHora(reporte.getFechaCreacion());
                if (calFechaReporte.getTime().equals(dia)) {
                    reportesCoincididos.add(reporte);
                }
            });

            return reportesCoincididos;
        } catch (MongoException ex) {
            throw new FindException("Error al obtener los reportes.");
        }
    }

}
