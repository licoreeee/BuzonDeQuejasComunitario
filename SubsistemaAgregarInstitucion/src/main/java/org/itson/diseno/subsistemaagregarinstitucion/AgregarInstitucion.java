/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseno.subsistemaagregarinstitucion;

import Excepciones.FindException;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.List;
import org.itson.diseño.buzonquejascomunitarionegocio.IInstitucionBO;
import org.itson.diseño.buzonquejascomunitarionegocio.InstitucionBO;

/**
 * Clase que representa el subsistema encargado de agregar instituciones.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class AgregarInstitucion {

    private IInstitucionBO institucionBO;

    /**
     * Constructor de la clase AgregarInstitucion.
     */
    public AgregarInstitucion() {
        institucionBO = new InstitucionBO();
    }

    /**
     * Método para agregar una nueva institución.
     *
     * @param institucionNuevaDTO DTO que representa la nueva institución a
     * agregar.
     * @return El DTO de la institución recién agregada.
     * @throws FindException Si ocurre un error al buscar la institución.
     */
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO) throws FindException {
        return institucionBO.agregarInstitucion(institucionNuevaDTO);
    }

    /**
     * Método para consultar todas las instituciones registradas.
     *
     * @return Una lista de DTOs que representan las instituciones registradas.
     * @throws FindException Si ocurre un error al buscar las instituciones.
     */
    public List<InstitucionRegistradaDTO> consultarInstituciones() throws FindException {
        List<InstitucionRegistradaDTO> institucionesConsultadas = institucionBO.consultarInstituciones();
        return institucionesConsultadas;
    }

}
