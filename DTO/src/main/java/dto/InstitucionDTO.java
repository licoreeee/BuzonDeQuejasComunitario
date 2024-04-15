package dto;

import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionDTO {

    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;
    private List<IncidenteDTO> incidentes;

    public InstitucionDTO() {
    }

    public InstitucionDTO(String nombreInstitucion, String funcionInstitucion, String siglas) {
        this.nombreInstitucion = nombreInstitucion;
        this.funcionInstitucion = funcionInstitucion;
        this.siglas = siglas;
    }

    public InstitucionDTO(String nombreInstitucion, String funcionInstitucion, String siglas, List<IncidenteDTO> incidentes) {
        this.nombreInstitucion = nombreInstitucion;
        this.funcionInstitucion = funcionInstitucion;
        this.siglas = siglas;
        this.incidentes = incidentes;
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

    public void setIncidentes(List<IncidenteDTO> incidentes) {
        this.incidentes = incidentes;
    }

}
