package org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso;

import java.util.ArrayList;
import java.util.List;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.DomicilioDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.IncidenteDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.InstitucionDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.ReporteDTO;

public class FacadeLevantarReporte implements IFacadeLevantarReporte {

    @Override
    public boolean levantarReporte() {
        return true;

    }

    @Override
    public List<InstitucionDTO> listaInstituciones() {
        List<InstitucionDTO> institucion = new ArrayList<>();

        InstitucionDTO institucion1 = new InstitucionDTO();
        institucion1.setSiglas("");

    }

    @Override
    public List<IncidenteDTO> listaIncidentes() {
        List<IncidenteDTO> incidentes = new ArrayList<>();

        IncidenteDTO incidente1 = new IncidenteDTO();
        incidente1.setInstitucion();
    }

    @Override
    public List<ReporteDTO> listaReportes() {
        List<ReporteDTO> reportes = new ArrayList<>();

        // Reporte 1
        ReporteDTO reporte1 = new ReporteDTO();
        reporte1.setFolio(293482);
        reporte1.setTitulo("Fuga de aguas residuales");
        reporte1.setIncidente(incidente);

    }

    @Override
    public List<DomicilioDTO> listaDomicilios() {
        List<DomicilioDTO> domicilios = new ArrayList<>();

        // Domicilio 1
        DomicilioDTO domicilio1 = new DomicilioDTO();
        domicilio1.setCalle("Calle A");
        domicilio1.setCodigoPostal("85000");
        domicilio1.setColonia("Colonia X");
        domicilio1.setNumeroCasa("123");
        domicilio1.setEspecificacionesExtra("Cerca de un parque");
        domicilios.add(domicilio1);

        // Domicilio 2
        DomicilioDTO domicilio2 = new DomicilioDTO();
        domicilio2.setCalle("Calle B");
        domicilio2.setCodigoPostal("85001");
        domicilio2.setColonia("Colonia Y");
        domicilio2.setNumeroCasa("133");
        domicilio2.setEspecificacionesExtra("Cerca de un hospital");
        domicilios.add(domicilio2);

        // Domicilio 3
        DomicilioDTO domicilio3 = new DomicilioDTO();
        domicilio3.setCalle("Calle C");
        domicilio3.setCodigoPostal("85101");
        domicilio3.setColonia("Colonia Z");
        domicilio3.setNumeroCasa("321");
        domicilio3.setEspecificacionesExtra("Al lado del zoo");
        domicilios.add(domicilio3);

        // Agregar más domicilios si es necesario...
        return domicilios;

    }

    @Override
    public boolean validaReporte() {
        return true;
    }

    @Override
    public List<InstitucionDTO> listaInstituciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
