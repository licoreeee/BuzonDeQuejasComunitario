/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import conexion.Conexion;
import conexion.IConexion;
import dao.InstitucionesDAO;
import dto.IncidentesDTO;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de pruebas en la capa de negocio
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
//        institucionDTO.setNombre("Policia Municipal");
//        institucionDTO.setDescripcionAdicional("Encargados de la seguridad publica");
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
//        incidentesDTO.add(new IncidentesDTO("Conflictos sociales", new InstitucionRegistradaDTO("663fe6ba0808a654d709479a")));
//        incidentesDTO.add(new IncidentesDTO("Falta de seguridad en zona publica", new InstitucionRegistradaDTO("663fe6ba0808a654d709479a")));
//        incidentesDTO.add(new IncidentesDTO("Incapacitacion de sueño por fiestas en horas vespertinas", new InstitucionRegistradaDTO("663fe6ba0808a654d709479a")));
//
//        try {
//            incidentesDTO = incidenteBO.agregarIncidentes(incidentesDTO);
//             System.out.println(incidentesDTO.toString());
//             System.out.println("Los incidentes se crearon exitosamente!");
//        } catch (FindException ex) {
//            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            List<IncidentesDTO> incidentesObtenidos = incidenteBO.obtenerIncidentes("663fe6ba0808a654d709479a");
//            System.out.println(incidentesObtenidos);
//            System.out.println("Se logro consultar los incidentes de la institucion ingresada");
//        } catch (FindException ex) {
//            Logger.getLogger(PruebasNegocio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
