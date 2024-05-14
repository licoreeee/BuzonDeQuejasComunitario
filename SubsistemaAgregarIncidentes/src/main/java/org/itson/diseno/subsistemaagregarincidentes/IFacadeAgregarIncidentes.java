/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseno.subsistemaagregarincidentes;

import dto.IncidentesDTO;
import java.util.List;

/**
 * Interfaz para la fachada de agregar incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IFacadeAgregarIncidentes {

    /**
     * Método para agregar incidentes.
     *
     * @param incidentesDTO La lista de DTOs que representan los incidentes a
     * agregar.
     * @return Una lista de DTOs que representan los incidentes agregados.
     */
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO);

    /**
     * Método para consultar los incidentes asociados a una institución.
     *
     * @param id El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes asociados a la
     * institución.
     */
    public List<IncidentesDTO> consultarIncidentes(String id);
}
