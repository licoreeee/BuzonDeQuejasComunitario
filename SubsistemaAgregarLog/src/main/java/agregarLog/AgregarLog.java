/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregarLog;

import Excepciones.PersistenciaException;
import dto.LogDeBusquedaDTO;
import org.itson.diseño.buzonquejascomunitarionegocio.ILogDeBusquedaBO;
import org.itson.diseño.buzonquejascomunitarionegocio.LogDeBusquedaBO;

/**
 *
 * @author Dell
 */
public class AgregarLog {
    
    private ILogDeBusquedaBO logDeBusquedaBO;

    public AgregarLog() {
        logDeBusquedaBO = new LogDeBusquedaBO();
    }
    
    LogDeBusquedaDTO agregarLogDeBusqueda(LogDeBusquedaDTO logDeBusquedaDTO) throws PersistenciaException{
        return logDeBusquedaBO.agregarLogDeBusqueda(logDeBusquedaDTO);
    }
    
}
