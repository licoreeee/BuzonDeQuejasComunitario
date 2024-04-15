/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.CiudadanoDTO;
import dto.DomicilioDTO;
import dto.IncidenteDTO;
import dto.InstitucionDTO;
import dto.ReporteDTO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import objetosMock.ObjetosInstitucion;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Institucion;

/**
 *
 * @author castr
 */
public class LevantarReporteBO implements ILevantarReporteBO {

    List<ReporteDTO> reportes;
    ObjetosInstitucion objetosInstitucion;
    IInstitucionBO institucionBO;

    public LevantarReporteBO() {
        cargarDatos();
    }

    @Override
    public ReporteDTO validarReporte(ReporteDTO reporteIngresado) {
        for (int i = 0; i < reportes.size(); i++) {
            if (reportes.get(i).getCiudadano().getCURP().equalsIgnoreCase(reporteIngresado.getCiudadano().getCURP())) {
                reportes.set(i, reporteIngresado);
                return reportes.get(i);
            }
        }
        return null;
    }

    @Override
    public List<ReporteDTO> mostrarReportes() {
        return reportes;
    }

    @Override
    public List<InstitucionDTO> cargarDatos() {
        
        objetosInstitucion.agregarIncidentesCFE();
        objetosInstitucion.agregarIncidentesOOMAPAS();
        objetosInstitucion.agregarInstituciones();
        
        List<Institucion> institucionesEntity = objetosInstitucion.getInstituciones();
        
        List<InstitucionDTO> institucionesDTO = new ArrayList<>();
        for (Institucion institucion : institucionesEntity) {
            InstitucionDTO institucionDTO = institucionBO.conversionDatos(institucion);
            institucionesDTO.add(institucionDTO);
        }
        
        return institucionesDTO;
        
//        reportes = new LinkedList<>();
//        CiudadanoDTO ciudadano1 = new CiudadanoDTO("Gael Rafael", "Castro", "Molina", "CAMG040802HSRSLLA5", 6442267330L, "gc@gmail.com");
//        CiudadanoDTO ciudadano2 = new CiudadanoDTO("Hisamy", "Cinco", "Cota", "CICH041019HSRSNAA2", 6871909800L, "hisamy5@gmail.com");
//        CiudadanoDTO ciudadano3 = new CiudadanoDTO("Victoria", "Vega", "Bernal", "VEBV040902HSMRNAA2", 6872091483L, "vickypapu@gmail.com");
//        CiudadanoDTO ciudadano4 = new CiudadanoDTO("Michelle", "Medina", "Sepulveda", "MOCH041221HSRRLSA1", 6441043921L, "mochilada@gmail.com");
//        CiudadanoDTO ciudadano5 = new CiudadanoDTO("Juan", "Perez", "Perez", "PEPJ041020HLSRLAA3", 6441943298L, "juanper@gmail.com");
//
//        DomicilioDTO domicilio1 = new DomicilioDTO("Calle Puebla", "Colonia SI", "85190");
//        DomicilioDTO domicilio2 = new DomicilioDTO("Calle Antono", "Colonia Itson", "85100");
//        DomicilioDTO domicilio3 = new DomicilioDTO("Calle Camaron", "Colonia Itson", "85100");
//        DomicilioDTO domicilio4 = new DomicilioDTO("Calle Pionero", "Colonia Zona Norte", "85110");
//        DomicilioDTO domicilio5 = new DomicilioDTO("Calle Logitec", "Colonia Verde", "85120");
//
//        InstitucionDTO institucion1 = new InstitucionDTO("Comision Federal de Electricidad", "Función Ejemplo", "CFE");
//        InstitucionDTO institucion2 = new InstitucionDTO("Organismo Operador Municipal de Agua Potable Alcantarilado y Saneamiento", "Función Ejemplo", "OOMAPAS");
//        InstitucionDTO institucion3 = new InstitucionDTO("Policía Municipal de Cajeme", "Función Ejemplo", "PMC");
//        InstitucionDTO institucion4 = new InstitucionDTO("Residuos Solidos Urbanos", "Función Ejemplo", "RSU");
//        InstitucionDTO institucion5 = new InstitucionDTO("Instituto Mexicano del Cemento y del Concreto", "Función Ejemplo", "IMCyC");
//
//        IncidenteDTO incidente1 = new IncidenteDTO("Incidente Ejemplo1", institucion1);
//        IncidenteDTO incidente2 = new IncidenteDTO("Incidente Ejemplo2", institucion2);
//        IncidenteDTO incidente3 = new IncidenteDTO("Incidente Ejemplo3", institucion3);
//        IncidenteDTO incidente4 = new IncidenteDTO("Incidente Ejemplo4", institucion4);
//        IncidenteDTO incidente5 = new IncidenteDTO("Incidente Ejemplo5", institucion5);
//
//        ReporteDTO reporte1 = new ReporteDTO(12342, "Título del Reporte1", incidente1, ciudadano1, domicilio1);
//        ReporteDTO reporte2 = new ReporteDTO(49028, "Título del Reporte2", incidente2, ciudadano2, domicilio2);
//        ReporteDTO reporte3 = new ReporteDTO(92349, "Título del Reporte3", incidente3, ciudadano3, domicilio3);
//        ReporteDTO reporte4 = new ReporteDTO(23497, "Título del Reporte4", incidente4, ciudadano4, domicilio4);
//        ReporteDTO reporte5 = new ReporteDTO(12893, "Título del Reporte5", incidente5, ciudadano5, domicilio5);
//
//        reportes.add(reporte1);
//        reportes.add(reporte2);
//        reportes.add(reporte3);
//        reportes.add(reporte4);
//        reportes.add(reporte5);

    }

}
