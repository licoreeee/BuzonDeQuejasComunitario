/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Reporte;
import java.util.Calendar;
import Excepciones.PersistenciaException;

/**
 *
 * @author Dell
 */
public interface IReportesDAO {
    
    Reporte agregarReporte() throws PersistenciaException;
    
    Reporte obtenerReportePorTitulo(String titulo) throws FindException;
    
    Reporte obtenerReportePorInstitucion(String institucion) throws FindException;
    
    Reporte obtenerReportePorIncidente(String incidente) throws FindException;
    
    Reporte obtenerReportePorFecha(Calendar fechaInicio, Calendar fechaFinal) throws FindException;
    
    Reporte obtenerReportePorCoordendas(String coordendas) throws FindException;
    
}
