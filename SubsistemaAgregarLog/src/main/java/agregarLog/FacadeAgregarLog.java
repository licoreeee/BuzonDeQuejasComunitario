/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregarLog;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.LogDeBusquedaDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class FacadeAgregarLog implements IFacadeAgregarLog{
    
    private AgregarLog agregarLog;

    public FacadeAgregarLog() {
        agregarLog = new AgregarLog();
    }
    
    @Override
    public LogDeBusquedaDTO agregarLogDeBusqueda(LogDeBusquedaDTO logDeBusquedaDTO){
        try {
            agregarLog.agregarLogDeBusqueda(logDeBusquedaDTO);
            return logDeBusquedaDTO;
        } catch (PersistenciaException ex) {
            Logger.getLogger(FacadeAgregarLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
