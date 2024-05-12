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
import org.itson.diseño.buzonquejascomunitarionegocio.IIncidenteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IncidenteBO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FacadeAgregarIncidentes implements IFacadeAgregarIncidentes {

    private AgregarIncidentes incidentes;

    public FacadeAgregarIncidentes() {
        incidentes = new AgregarIncidentes();
    }

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
