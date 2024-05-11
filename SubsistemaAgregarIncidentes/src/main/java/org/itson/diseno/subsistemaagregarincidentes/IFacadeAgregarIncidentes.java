/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseno.subsistemaagregarincidentes;

import dto.IncidentesDTO;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IFacadeAgregarIncidentes {
    
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO);
    
}
