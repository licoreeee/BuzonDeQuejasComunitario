/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package agregarLog;

import Excepciones.PersistenciaException;
import dto.LogDeBusquedaDTO;

/**
 *
 * @author Dell
 */
public interface IFacadeAgregarLog {
    
    public LogDeBusquedaDTO agregarLogDeBusqueda(LogDeBusquedaDTO logDeBusquedaDTO);
    
}
