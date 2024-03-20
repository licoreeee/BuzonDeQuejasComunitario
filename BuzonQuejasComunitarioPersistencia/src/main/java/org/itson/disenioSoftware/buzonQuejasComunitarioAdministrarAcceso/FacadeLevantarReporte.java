package org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso;

import java.util.ArrayList;
import java.util.List;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.CiudadanoDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.DomicilioDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.IncidenteDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.InstitucionDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.ReporteDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDominio.Incidente;
import org.itson.disenioSoftware.buzonQuejasComunitarioDominio.Institucion;

public class FacadeLevantarReporte implements IFacadeLevantarReporte {

    @Override
    public boolean levantarReporte() {
        List<DomicilioDTO> domicilios = listaDomicilios();
        List<InstitucionDTO> instituciones = listaInstituciones();

        List<CiudadanoDTO> ciudadanos = listaCiudadanos();

        DomicilioDTO domicilio = domicilios.get(0);
        InstitucionDTO institucion = instituciones.get(0);
        CiudadanoDTO ciudadano = ciudadanos.get(0);

        ReporteDTO nuevoReporte = new ReporteDTO();
        nuevoReporte.setFolio(1);
        nuevoReporte.setTitulo("Corte de Luz");
        nuevoReporte.setDomicilio(domicilio);
        nuevoReporte.setCiudadano(ciudadano);
        nuevoReporte.setInstitucion(institucion);

        return true;

    }

    @Override
    public List<InstitucionDTO> listaInstituciones() {
        List<InstitucionDTO> instituciones = new ArrayList<>();
        List<IncidenteDTO> incidentes = listaIncidentes();
        IncidenteDTO incidente = incidentes.get(0);

        InstitucionDTO institucion = new InstitucionDTO();
        institucion.setSiglas("IMSS");
        institucion.setFuncionInstitucion("Salud");
        institucion.setNombreInstitucion("Instituto Mexicano del Seguro Social");
        institucion.setIncidentes(incidentes);
        instituciones.add(institucion);

        return instituciones;
    }

    @Override
    public List<IncidenteDTO> listaIncidentes() {
        List<InstitucionDTO> instituciones = new ArrayList<>();
        List<IncidenteDTO> incidentes = new ArrayList();
        
        InstitucionDTO institucion=new InstitucionDTO("Jumapag","Agua","JMP",incidentes);
        IncidenteDTO incidente1=new IncidenteDTO("Fuga","Fuga agua negra");
        IncidenteDTO incidente2=new IncidenteDTO("Aguas negras","Muchas aguas negras en la calle");

        instituciones.add(institucion);
        incidentes.add(incidente1);
        incidentes.add(incidente2);

        IncidenteDTO incidente = new IncidenteDTO();
        incidente.setNombreIncidente("Fuga de aguas negras");
        incidente.setDescripcion("Fuga de aguas residuales, aguas servidas o aguas cloacales. ");

        return incidentes;
        
//        List<IncidenteDTO> incidentes = new ArrayList<>();
//        
//        IncidenteDTO incidente = new IncidenteDTO();
//        incidente.setNombreIncidente("Fuga de aguas negras");
//        incidente.setDescripcion("Fuga de aguas residuales, aguas servidas o aguas cloacales. ");
//
//    
//        return incidentes;
    }

    @Override
    public List<DomicilioDTO> listaDomicilios() {
        List<DomicilioDTO> domicilios = new ArrayList<>();

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

    @Override
    public List<CiudadanoDTO> listaCiudadanos() {
        List<CiudadanoDTO> ciudadanos = new ArrayList<>();

        CiudadanoDTO ciudadano = new CiudadanoDTO();
        ciudadano.setNombre("Gael");
        ciudadano.setApellidop("Castro");
        ciudadano.setApellidom("Molina");
        ciudadano.setCorreo("gael@gmail.com");
        ciudadano.setCurp("CMG129");
        ciudadano.setNumerotelefono("6871699800");
        ciudadanos.add(ciudadano);

        return ciudadanos;

    }

}
