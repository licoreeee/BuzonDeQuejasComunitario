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
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class AgregarInstitucion {
    
    private IInstitucionBO institucionBO;

    public AgregarInstitucion() {
        institucionBO = new InstitucionBO();
    }
    
    public InstitucionNuevaDTO agregarInstitucion(InstitucionNuevaDTO institucionNuevaDTO) throws FindException {
        return institucionBO.agregarInstitucion(institucionNuevaDTO);
    }
    
    public List<InstitucionRegistradaDTO> consultarInstituciones() throws FindException {
        List<InstitucionRegistradaDTO> institucionesConsultadas = institucionBO.consultarInstituciones();
        return institucionesConsultadas;
    }
    

}
