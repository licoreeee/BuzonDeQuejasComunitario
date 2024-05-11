/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.InstitucionDAO;
import dto.IncidentesDTO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author castr
 */
public class PruebasNegocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        InstitucionBO institucionBO = new InstitucionBO();
        IncidenteBO incidenteBO = new IncidenteBO();

//        InstitucionNuevaDTO institucionDTO = new InstitucionNuevaDTO();
//        institucionDTO.setNombre("Organismos Operadores de Agua Potable, Alcantarillado y Saneamiento");
//        institucionDTO.setSiglas("OOMAPAS");
//        institucionDTO.setDescripcionAdicional("garantizar el suministro de agua potable a los usuarios dentro de su jurisdicción");
//
//        try{
//           institucionBO.agregarInstitucion(institucionDTO);
//            System.out.println(institucionDTO.toString());
//            System.out.println("Se creó la institucion correctamente");
//        } catch (FindException ex){
//            System.out.println("Error al agregar una institucion");
//        }
//        try{
//            List<InstitucionRegistradaDTO> institucionesObtenidas = institucionBO.consultarInstituciones();
//            System.out.println(institucionesObtenidas.toString());
//        } catch (FindException ex){
//            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        List<IncidentesDTO> incidentesDTO = new ArrayList<>();
//        incidentesDTO.add(new IncidentesDTO("Fuga de agua a presion", new InstitucionRegistradaDTO("663f155f8e48ac44dc69d070")));
//        incidentesDTO.add(new IncidentesDTO("Aguas negras", new InstitucionRegistradaDTO("663f155f8e48ac44dc69d070")));
//        incidentesDTO.add(new IncidentesDTO("Falta de servicio de agua", new InstitucionRegistradaDTO("663f155f8e48ac44dc69d070")));
//
//        try {
//            incidentesDTO = incidenteBO.agregarIncidentes(incidentesDTO);
//             System.out.println(incidentesDTO.toString());
//             System.out.println("Los incidentes se crearon exitosamente!");
//        } catch (FindException ex) {
//            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            List<IncidentesDTO> incidentesObtenidos = incidenteBO.obtenerIncidentes("663f155f8e48ac44dc69d070");
            System.out.println(incidentesObtenidos);
            System.out.println("Se logro consultar los incidentes de la institucion ingresada");
        } catch (FindException ex) {
            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
