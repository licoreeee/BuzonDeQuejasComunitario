/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseno.subsistemaagregarincidentes;

import Excepciones.FindException;
import dto.IncidentesDTO;
import java.util.List;
import negocio.IIncidenteBO;
import negocio.IncidenteBO;

/**
 * Clase que representa el subsistema encargado de agregar incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class AgregarIncidentes {

    private IIncidenteBO incidenteBO;
 
    /**
     * Constructor de la clase AgregarIncidentes.
     */
    public AgregarIncidentes() {
        incidenteBO = new IncidenteBO();
    }

    /**
     * Método para agregar incidentes.
     *
     * @param incidentesDTO La lista de DTOs que representan los incidentes a
     * agregar.
     * @return Una lista de DTOs que representan los incidentes agregados.
     * @throws FindException Si ocurre un error durante la agregación de los
     * incidentes.
     */
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO) throws FindException {
        List<IncidentesDTO> incidentes = incidenteBO.agregarIncidentes(incidentesDTO);
        return incidentes;
    }

    /**
     * Método para consultar los incidentes asociados a una institución.
     *
     * @param id El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes asociados a la
     * institución.
     * @throws FindException Si ocurre un error durante la consulta de los
     * incidentes.
     */
    public List<IncidentesDTO> consultarIncidentes(String id) throws FindException {
        List<IncidentesDTO> incidentesEncontrados = incidenteBO.obtenerIncidentes(id);
        return incidentesEncontrados;
    }

}
