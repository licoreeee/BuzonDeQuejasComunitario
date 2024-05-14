/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseno.subsistemaagregarinstitucion;

import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IFacadeAgregarInstitucion {
    
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO);
    
    public List<InstitucionRegistradaDTO> consultarInstituciones();
    
}
