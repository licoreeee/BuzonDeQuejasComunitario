/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseno.subsistemaagregarincidentes;

import Excepciones.FindException;
import dto.IncidentesDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.IIncidenteBO;
import negocio.IncidenteBO;

/**
 * Clase fachada para el subsistema de agregar incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FacadeAgregarIncidentes implements IFacadeAgregarIncidentes {

    private AgregarIncidentes incidentes;

    /**
     * Constructor de la clase FacadeAgregarIncidentes.
     */
    public FacadeAgregarIncidentes() {
        incidentes = new AgregarIncidentes();
    }

    /**
     * Método para agregar incidentes.
     *
     * @param incidentesDTO La lista de DTOs que representan los incidentes a
     * agregar.
     * @return Una lista de DTOs que representan los incidentes agregados.
     */
    public List<IncidentesDTO> agregarIncidentes(List<IncidentesDTO> incidentesDTO) {
        List<IncidentesDTO> incidentesObtenidos = new ArrayList<>();
        try {
            incidentesObtenidos = incidentes.agregarIncidentes(incidentesDTO);
            return incidentesObtenidos;
        } catch (FindException ex) {
            Logger.getLogger(FacadeAgregarIncidentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método para consultar los incidentes asociados a una institución.
     *
     * @param id El ID de la institución.
     * @return Una lista de DTOs que representan los incidentes asociados a la
     * institución.
     */
    @Override
    public List<IncidentesDTO> consultarIncidentes(String id) {
        List<IncidentesDTO> incidentesObtenidos = new ArrayList<>();
        try {
            incidentesObtenidos = incidentes.consultarIncidentes(id);
            return incidentesObtenidos;
        } catch (FindException ex) {
            Logger.getLogger(FacadeAgregarIncidentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
