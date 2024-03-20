/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso;

import java.util.List;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.IncidenteDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDominio.Incidente;

/**
 *
 * @author victo
 */
public class CtrlLevantarReporte {
    
    private IFacadeLevantarReporte iFacadeLevantarReporte;
    
    public CtrlLevantarReporte() {
        this.iFacadeLevantarReporte=new FacadeLevantarReporte();
    }
    
    public void mostrarIncidentes(){
        List<IncidenteDTO> incidente=iFacadeLevantarReporte.listaIncidentes();
    }
    
}
