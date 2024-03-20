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
        // Aquí iría la lógica para levantar el reporte
        return true;
    }

    @Override
    public List<InstitucionDTO> listaInstituciones() {
        List<InstitucionDTO> instituciones = new ArrayList<>();

        // Creación de instituciones
        InstitucionDTO institucion1 = new InstitucionDTO();
        institucion1.setSiglas("CFE");
        institucion1.setFuncionInstitucion("Electricidad");
        institucion1.setNombreInstitucion("Comision Federal de Electricidad");
        instituciones.add(institucion1);

        InstitucionDTO institucion2 = new InstitucionDTO();
        institucion2.setSiglas("IMSS");
        institucion2.setFuncionInstitucion("Salud");
        institucion2.setNombreInstitucion("Instituto Mexicano del Seguro Social");
        instituciones.add(institucion2);

        return instituciones;
    }

    @Override
    public List<IncidenteDTO> listaIncidentes() {
        List<IncidenteDTO> incidentes = new ArrayList<>();

        // Aquí iría la lógica para obtener la lista de incidentes
        // Se asume que ya existe una lista de incidentes disponible

        return incidentes;
    }

    @Override
    public List<ReporteDTO> listaReportes() {
        List<ReporteDTO> reportes = new ArrayList<>();

        // Aquí iría la lógica para obtener la lista de reportes
        // Se asume que ya existe una lista de reportes disponible

        return reportes;
    }

    @Override
    public List<DomicilioDTO> listaDomicilios() {
        List<DomicilioDTO> domicilios = new ArrayList<>();

        // Creación de domicilios
        DomicilioDTO domicilio1 = new DomicilioDTO();
        domicilio1.setCalle("Calle A");
        domicilio1.setCodigoPostal("85000");
        domicilio1.setColonia("Colonia X");
        domicilio1.setNumeroCasa("123");
        domicilio1.setEspecificacionesExtra("Cerca de un parque");
        domicilios.add(domicilio1);

        DomicilioDTO domicilio2 = new DomicilioDTO();
        domicilio2.setCalle("Calle B");
        domicilio2.setCodigoPostal("85001");
        domicilio2.setColonia("Colonia Y");
        domicilio2.setNumeroCasa("133");
        domicilio2.setEspecificacionesExtra("Cerca de un hospital");
        domicilios.add(domicilio2);

        DomicilioDTO domicilio3 = new DomicilioDTO();
        domicilio3.setCalle("Calle C");
        domicilio3.setCodigoPostal("85101");
        domicilio3.setColonia("Colonia Z");
        domicilio3.setNumeroCasa("321");
        domicilio3.setEspecificacionesExtra("Al lado del zoo");
        domicilios.add(domicilio3);

        return domicilios;
    }

    @Override
    public boolean validaReporte() {
        // Aquí iría la lógica para validar el reporte
        return true;
    }

}
