/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseno.subsistemaagregarinstitucion;

import Excepciones.FindException;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Facade para el subsistema de agregar instituciones.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class FacadeAgregarInstitucion implements IFacadeAgregarInstitucion {

    private AgregarInstitucion institucion;

    /**
     * Constructor de la clase FacadeAgregarInstitucion.
     */
    public FacadeAgregarInstitucion() {
        institucion = new AgregarInstitucion();
    }

    /**
     * Agrega una nueva institución al sistema.
     *
     * @param institucionNuevaDTO La información de la nueva institución.
     * @return La información de la institución agregada.
     */
    @Override
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO) {
        try {
            institucion.agregarInstitucion(institucionNuevaDTO);
            return institucionNuevaDTO;
        } catch (FindException ex) {
            Logger.getLogger(FacadeAgregarInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Consulta todas las instituciones registradas en el sistema.
     *
     * @return Una lista de las instituciones registradas.
     */
    @Override
    public List<InstitucionRegistradaDTO> consultarInstituciones() {
        try {
            List<InstitucionRegistradaDTO> institucionesObtenidas = institucion.consultarInstituciones();
            return institucionesObtenidas;
        } catch (FindException ex) {
            Logger.getLogger(FacadeAgregarInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
