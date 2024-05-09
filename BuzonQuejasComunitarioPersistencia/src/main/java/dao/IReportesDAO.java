/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Reporte;
import java.util.Calendar;
import Excepciones.PersistenciaException;

/**
 *
 * @author Dell
 */
public interface IReportesDAO {
    
    Reporte agregarReporte() throws PersistenciaException;
    
    Reporte obtenerReportePorTitulo(String titulo) throws PersistenciaException;
    
    Reporte obtenerReportePorInstitucion(String institucion) throws PersistenciaException;
    
    Reporte obtenerReportePorIncidente(String incidente) throws PersistenciaException;
    
    Reporte obtenerReportePorFecha(Calendar fechaInicio, Calendar fechaFinal) throws PersistenciaException;
    
    Reporte obtenerReportePorCoordendas(String coordendas) throws PersistenciaException;
    
}
