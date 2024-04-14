/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.CiudadanoDTO;
import dto.DomicilioDTO;
import dto.IncidenteDTO;
import dto.InstitucionDTO;
import dto.ReporteDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseño.buzonquejascomunitarionegocio.CiudadanoBO;
import org.itson.diseño.buzonquejascomunitarionegocio.DomicilioBO;
import org.itson.diseño.buzonquejascomunitarionegocio.ICiudadanoBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IDomicilioBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IIncidenteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IInstitucionBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IReporteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IncidenteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.InstitucionBO;
import org.itson.diseño.buzonquejascomunitarionegocio.ReporteBO;

/**
 *
 * @author castr
 */
class LevantarReporte {

    protected LevantarReporte() {

    }

    protected void seleccionarInsitucion(InstitucionDTO institucion) {
        IInstitucionBO insitucionBO = new InstitucionBO();
        InstitucionDTO institucionDTO = new InstitucionDTO(
                institucion.getNombreInstitucion(),
                institucion.getFuncionInstitucion(),
                institucion.getSiglas()
        );
        insitucionBO.transporteDatos(institucionDTO);
    }

    protected void seleccionarIncidente(IncidenteDTO incidente) {
        IIncidenteBO incidenteBO = new IncidenteBO();
        IncidenteDTO incidenteDTO = new IncidenteDTO(incidente.getNombreIncidente());
        incidenteBO.transporteDatos(incidenteDTO);
    }

    protected void ingresarDomicilio(DomicilioDTO domicilio) {
        if (domicilio != null) {
            IDomicilioBO domicilioBO = new DomicilioBO();
            DomicilioDTO domicilioDTO = new DomicilioDTO(
                    domicilio.getCalle(),
                    domicilio.getColonia(),
                    domicilio.getCodigoPostal(),
                    domicilio.getEspecificaciones()
            );
            domicilioBO.transporteDatos(domicilioDTO);
        } else {
            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "El objeto domicilio es nulo");
        }
    }

    protected void ingresarCiudadano(CiudadanoDTO ciudadano) {
        if (ciudadano != null) {
            ICiudadanoBO ciudadanoBO = new CiudadanoBO();
            CiudadanoDTO ciudadanoDTO = new CiudadanoDTO(
                    ciudadano.getNombre(),
                    ciudadano.getApellidoP(),
                    ciudadano.getApellidoM(),
                    ciudadano.getCURP(),
                    ciudadano.getTelefono(),
                    ciudadano.getCorreo()
            );
            ciudadanoBO.transporteDatos(ciudadanoDTO);
        } else {
            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "El objeto ciudadano es nulo");
        }
    }

    protected void generarReporte(ReporteDTO reporte) {
        if (reporte != null) {
            IReporteBO reporteBO = new ReporteBO();
            ReporteDTO reporteDTO = new ReporteDTO(
                    reporte.getTitulo(),
                    reporte.getDescripcion()
            );
            reporteBO.transporteDatos(reporteDTO);
        } else {
            Logger.getLogger(LevantarReporte.class.getName()).log(Level.SEVERE, "El objeto reporte es nulo");
        }
    }

}
