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
 * @author Dell
 */
public interface IReportesDAO {

    Reporte agregarReporte(Reporte reporte) throws PersistenciaException;

    List<Reporte> obtenerReportePorTitulo(String titulo) throws FindException;

    List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException;

    List<Reporte> obtenerReportePorIncidente(String incidente) throws FindException;


    List<Reporte> obtenerReportePorFecha(Calendar fechaInicio, Calendar fechaFinal) throws FindException;

    
    List<Reporte> obtenerReportePorFecha(Date fechaInicio, Date fechaFinal) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYInstitucion(String titulo, String institucion) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYFecha(String titulo, Date fechaInicio, Date fechaFinal) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYIncidente(String titulo, String incidente) throws FindException;
    
    List<Reporte> obtenerReportePorInstitucionYIncidente(String institucion, String incidente) throws FindException;
    
    List<Reporte> obtenerReportePorInstitucionYFecha(String institucion, Date fechaInicio, Date fechaFinal) throws FindException;
    
    List<Reporte> obtenerReportePorIncidenteYFecha(String incidente, Date fechaInicio, Date fechaFinal) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYInstitucionYFecha(String titulo, String institucion, Date fechaInicio, Date fechaFinal) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYIncidenteYFecha(String titulo, String incidente, Date fechaInicio, Date fechaFinal) throws FindException;
    
    List<Reporte> obtenerReportePorInstitucionYFechaYIncidente(String institucion, Date fechaInicio, Date fechaFinal, String incidente) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYInstitucionYIncidenteYFecha(String titulo, String institucion, String incidente, Date fechaInicio, Date fechaFinal) throws FindException;

    void actualizarEstado(Reporte reporte) throws PersistenciaException;

}
