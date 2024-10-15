/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Reporte;
import java.util.Calendar;
import Excepciones.PersistenciaException;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Gael Castro, Hisamy Cinco, Victoria Vega
 */
public interface IReportesDAO {

    /**
     * Agrega un nuevo reporte a la base de datos.
     *
     * @param reporte El objeto Reporte a agregar.
     * @return El objeto Reporte agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    public Reporte agregarReporte(Reporte reporte) throws PersistenciaException;

    /**
     * Obtiene una lista de reportes por su título y fecha de creación.
     *
     * @param titulo El título del reporte.
     * @param dia La fecha de creación del reporte.
     * @return Una lista de reportes que coinciden con el título y la fecha especificados.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerReportePorTitulo(String titulo, Date dia) throws FindException;

    /**
     * Obtiene una lista de reportes por la institución responsable y fecha de creación.
     *
     * @param institucion El nombre de la institución responsable.
     * @param dia La fecha de creación del reporte.
     * @return Una lista de reportes que pertenecen a la institución especificada y se crearon en la fecha indicada.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerReportePorInstitucion(String institucion, Date dia) throws FindException;
    
    /**
     * Obtiene una lista de reportes por título, institución responsable y fecha de creación.
     *
     * @param titulo El título del reporte.
     * @param institucion El nombre de la institución responsable.
     * @param dia La fecha de creación del reporte.
     * @return Una lista de reportes que coinciden con el título, la institución y la fecha especificados.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Date dia) throws FindException;
    
     /**
     * Obtiene una lista de reportes por institución responsable, incidente reportado y fecha de creación.
     *
     * @param institucion El nombre de la institución responsable.
     * @param incidente El nombre del incidente reportado.
     * @param dia La fecha de creación del reporte.
     * @return Una lista de reportes que coinciden con la institución, el incidente y la fecha especificados.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Date dia) throws FindException;
    
     /**
     * Obtiene una lista de reportes por título, institución responsable, incidente reportado y fecha de creación.
     *
     * @param titulo El título del reporte.
     * @param institucion El nombre de la institución responsable.
     * @param incidente El nombre del incidente reportado.
     * @param dia La fecha de creación del reporte.
     * @return Una lista de reportes que coinciden con el título, la institución, el incidente y la fecha especificados.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Date dia) throws FindException;
    
    /**
     * Actualiza el estado de un reporte en la base de datos.
     *
     * @param reporte El objeto Reporte cuyo estado se actualizará.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    public void actualizarEstado(Reporte reporte) throws PersistenciaException;   
    
    /**
     * Obtiene todos los reportes almacenados en la base de datos.
     *
     * @return Una lista de todos los reportes almacenados.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerTodosLosReportes() throws FindException;
    
    /**
     * Obtiene una lista de reportes asociados a una institución.
     *
     * @param institucion El nombre de la institución.
     * @return Una lista de reportes asociados a la institución especificada.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException;
    
    /**
     * Obtiene una lista de reportes por período de tiempo.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @return Lista de reportes que coinciden con el período y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    public List<Reporte> obtenerReportePorPeriodo(Date fechaInicio, Date fechaFin, Date dia) throws FindException;
    
    /**
     * Obtiene una lista de reportes por período de tiempo.
     *
     * @param fechaInicio La fecha de inicio del período.
     * @param fechaFin La fecha de fin del período.
     * @param dia La fecha de los reportes a buscar dentro del período.
     * @return Lista de reportes que coinciden con el período y la fecha especificadas.
     * @throws FindException Si no se encuentran reportes o hay un error en la búsqueda.
     */
    public List<Reporte> obtenerReportePorPeriodoYTitulo(Date fechaInicio, Date fechaFin, Date dia, String titulo) throws FindException;
    
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
    public List<Reporte> obtenerReportePorPeriodoYTituloYInstitucion(Date fechaInicio, Date fechaFin, Date dia, String titulo, String institucion) throws FindException;
    
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
    public List<Reporte> obtenerReportePorPeriodoYTituloYInstiticionYIncidente(Date fechaInicio, Date fechaFin, Date dia, String titulo, String institucion, String incidente) throws FindException;
    
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
    public List<Reporte> obtenerReportePorPeriodoYInstitucion(Date fechaInicio, Date fechaFin, Date dia, String institucion) throws FindException;

}
