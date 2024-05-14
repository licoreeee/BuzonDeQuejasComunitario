/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseno.subsistemaagregarinstitucion;

import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.List;

/**
 * Interfaz para la fachada del subsistema de agregar instituciones.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IFacadeAgregarInstitucion {

    /**
     * Agrega una nueva institución al sistema.
     *
     * @param institucionNuevaDTO La información de la nueva institución.
     * @return La información de la institución agregada.
     */
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO);

    /**
     * Consulta todas las instituciones registradas en el sistema.
     *
     * @return Una lista de las instituciones registradas.
     */
    public List<InstitucionRegistradaDTO> consultarInstituciones();

}
