package org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso;

import java.util.List;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.CiudadanoDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.DomicilioDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.IncidenteDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.InstitucionDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.ReporteDTO;
import org.itson.disenioSoftware.buzonQuejasComunitarioDominio.Incidente;

public interface IFacadeLevantarReporte {

    public boolean levantarReporte();
    public List<InstitucionDTO> listaInstituciones(); 
    public List<IncidenteDTO> listaIncidentes();    
    public List<DomicilioDTO> listaDomicilios();
    public List<CiudadanoDTO> listaCiudadanos();
    public boolean validaReporte();
    
}
