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

    List<Reporte> obtenerReportePorTitulo(String titulo, Date dia) throws FindException;

    List<Reporte> obtenerReportePorInstitucion(String institucion, Date dia) throws FindException;

    List<Reporte> obtenerReportePorIncidente(String incidente, Date dia) throws FindException;

    List<Reporte> obtenerReportePorDia(Date dia) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYInstitucion(String titulo, String institucion, Date dia) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYIncidente(String titulo, String incidente, Date dia) throws FindException;
    
    List<Reporte> obtenerReportePorInstitucionYIncidente(String institucion, String incidente, Date dia) throws FindException;
    
    List<Reporte> obtenerReportePorTituloYInstitucionYIncidente(String titulo, String institucion, String incidente, Date dia) throws FindException;
    
    void actualizarEstado(Reporte reporte) throws PersistenciaException;
    
    List<Reporte> obtenerReportePorInstitucion(String institucion) throws FindException;

}
