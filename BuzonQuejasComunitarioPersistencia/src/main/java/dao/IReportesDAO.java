/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Reporte;
import java.util.Calendar;
import Excepciones.PersistenciaException;
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

}
