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
        IConexion conexion = new Conexion();
        InstitucionBO institucionBO = new InstitucionBO();
        IncidenteBO incidenteBO = new IncidenteBO();
        
//        InstitucionNuevaDTO institucionDTO = new InstitucionNuevaDTO();
//        institucionDTO.setNombre("Comision Federal y de Electricidad");
//        institucionDTO.setSiglas("CFE");
//        institucionDTO.setDescripcionAdicional("Responsable de la generación, transmisión, distribución y comercialización de energía eléctrica");
//
//        try{
//           institucionBO.agregarInstitucion(institucionDTO);
//            System.out.println(institucionDTO.toString());
//        } catch (FindException ex){
//            System.out.println("Error al agregar una institucion");
//        }

//        try{
//            List<InstitucionRegistradaDTO> institucionesObtenidas = institucionBO.consultarInstituciones();
//            System.out.println(institucionesObtenidas.toString());
//        } catch (FindException ex){
//            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
//        }

        List<IncidentesDTO> incidentesDTO = new ArrayList<>();
        incidentesDTO.add(new IncidentesDTO("Acumulacion de basura", new InstitucionRegistradaDTO("663dd0de71f72647e3375ea7")));
        incidentesDTO.add(new IncidentesDTO("Falta de limpieza en areas publicas", new InstitucionRegistradaDTO("663dd0de71f72647e3375ea7")));
        incidentesDTO.add(new IncidentesDTO("Poco servicio de recoleccion de basura", new InstitucionRegistradaDTO("663dd0de71f72647e3375ea7")));

        try {
            List<IncidentesDTO> incidentesEnProceso = incidenteBO.agregarIncidentes(incidentesDTO);
             System.out.println(incidentesEnProceso.toString());
        } catch (FindException ex) {
            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
