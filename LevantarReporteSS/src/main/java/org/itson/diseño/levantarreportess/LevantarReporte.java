/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.ReporteDTO;
import excepciones.NegociosException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseño.buzonquejascomunitarionegocio.ILevantarReporteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.LevantarReporteBO;

/**
 *
 * @author castr
 */
class LevantarReporte {

    private ILevantarReporteBO levantarReporteBO;

    protected LevantarReporte() {
        this.levantarReporteBO = new LevantarReporteBO();
    }

    protected ReporteDTO levantarReporte(ReporteDTO reporteDTO) {
        try {
            reporteDTO = levantarReporteBO.levantarReporte(reporteDTO);
            return reporteDTO;
        } catch (NegociosException ex) {
            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//    protected List<InstitucionNuevaDTO> obtenerInstituciones() {
//        List<InstitucionNuevaDTO> instituciones = levantarReporteBO.cargarDatos();
//        return instituciones;
//    }
//
//    protected InstitucionNuevaDTO seleccionarInsitucion(InstitucionNuevaDTO institucion) {
//        IInstitucionBO insitucionBO = new InstitucionBO();
//        InstitucionNuevaDTO institucionDTO = new InstitucionNuevaDTO(
//                institucion.getNombreInstitucion(),
//                institucion.getFuncionInstitucion(),
//                institucion.getSiglas()
//        );
//        insitucionBO.transporteDatos(institucionDTO);
//        return institucionDTO;
//    }
//
//    protected IncidentesDTO seleccionarIncidente(IncidentesDTO incidente) {
//        IIncidenteBO incidenteBO = new IncidenteBO();
//        IncidentesDTO incidenteDTO = new IncidentesDTO(incidente.getInformacion());
//        incidenteBO.transporteDatos(incidenteDTO);
//        return incidenteDTO;
//    }
//
//    protected DomicilioDTO ingresarDomicilio(DomicilioDTO domicilio) {
//        if (domicilio != null) {
//            IDomicilioBO domicilioBO = new DomicilioBO();
//            DomicilioDTO domicilioDTO = new DomicilioDTO(
//                    domicilio.getCalle(),
//                    domicilio.getColonia(),
//                    domicilio.getCodigoPostal(),
//                    domicilio.getEspecificaciones()
//            );
//            domicilioBO.transporteDatos(domicilioDTO);
//            return domicilioDTO;
//        } else {
//            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "El objeto domicilio es nulo");
//        }
//        return null;
//    }
//
//    protected CiudadanoDTO ingresarCiudadano(CiudadanoDTO ciudadano) {
//        if (ciudadano != null) {
//            ICiudadanoBO ciudadanoBO = new CiudadanoBO();
//            CiudadanoDTO ciudadanoDTO = new CiudadanoDTO(
//                    ciudadano.getNombre(),
//                    ciudadano.getApellidoP(),
//                    ciudadano.getApellidoM(),
//                    ciudadano.getCurp(),
//                    ciudadano.getContrasenia()
//            );
//            ciudadanoBO.transporteDatos(ciudadanoDTO);
//            return ciudadanoDTO;
//        } else {
//            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "El objeto ciudadano es nulo");
//        }
//        return null;
//    }
//
//    protected ReporteDTO generarReporte(ReporteDTO reporte) {
//        if (reporte != null) {
//            IReporteBO reporteBO = new ReporteBO();
//            ReporteDTO reporteDTO = new ReporteDTO(
//                    0,
//                    reporte.getTitulo(),
//                    reporte.getDescripcion(),
//                    reporte.getFechaCreacion(),
//                    reporte.getCalle(),
//                    reporte.getColonia(),
//                    reporte.getDescripcionExtra(),
//                    reporte.getCiudadano(),
//                    reporte.getInstitucion(),
//                    reporte.getIncidente()
//            );
//            reporteBO.transporteDatos(reporteDTO);
//            return reporteDTO;
//        } else {
//            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "El objeto reporte es nulo");
//        }
//        return null;
//    }
//
//    protected void levantarReporte(ReporteDTO reporte) {
//        ReporteDTO reporteDTO = new ReporteDTO(
//                reporte.getFolio(),
//                reporte.getTitulo(),
//                reporte.getDescripcion(),
//                seleccionarIncidente(reporte.getIncidente()),
//                seleccionarInsitucion(reporte.getInstitucion()),
//                ingresarDomicilio(reporte.getDomicilio()),
//                ingresarCiudadano(reporte.getCiudadano()));
//    }
}
