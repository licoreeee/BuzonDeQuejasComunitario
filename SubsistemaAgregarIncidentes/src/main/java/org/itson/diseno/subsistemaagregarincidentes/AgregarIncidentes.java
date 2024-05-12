/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseno.subsistemaagregarincidentes;

import Excepciones.FindException;
import dto.IncidentesDTO;
import java.util.List;
import org.itson.diseño.buzonquejascomunitarionegocio.IIncidenteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IncidenteBO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class AgregarIncidentes {
    
     private IIncidenteBO incidenteBO;
    
    public AgregarIncidentes(){
        incidenteBO = new IncidenteBO();
    }
    
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO) throws FindException {
        List<IncidentesDTO> incidentes = incidenteBO.agregarIncidentes(incidentesDTO);
        return incidentes;
    }
    
    public List<IncidentesDTO> consultarIncidentes(String id) throws FindException {
        List<IncidentesDTO> incidentesEncontrados = incidenteBO.obtenerIncidentes(id);
        return incidentesEncontrados;
    }
    
}
