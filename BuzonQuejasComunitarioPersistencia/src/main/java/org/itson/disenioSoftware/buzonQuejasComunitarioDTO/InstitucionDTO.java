
package org.itson.disenioSoftware.buzonQuejasComunitarioDTO;

import java.util.List;
import org.itson.disenioSoftware.buzonQuejasComunitarioDominio.Incidente;


public class InstitucionDTO {

    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;
    private List<IncidenteDTO>incidentes;

    public InstitucionDTO() {
    }

    public InstitucionDTO(String nombreInstitucion, String funcionInstitucion, String siglas, List<IncidenteDTO> Incidentes) {
        this.nombreInstitucion = nombreInstitucion;
        this.funcionInstitucion = funcionInstitucion;
        this.siglas = siglas;
        this.incidentes = Incidentes;
    }

    
    

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getFuncionInstitucion() {
        return funcionInstitucion;
    }

    public void setFuncionInstitucion(String funcionInstitucion) {
        this.funcionInstitucion = funcionInstitucion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public List<IncidenteDTO> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<IncidenteDTO> Incidentes) {
        this.incidentes = Incidentes;
    }
    
    
}
