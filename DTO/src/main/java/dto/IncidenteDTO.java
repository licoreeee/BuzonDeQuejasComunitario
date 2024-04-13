package dto;

/**
 *
 * @author Dell
 */
public class IncidenteDTO {
    
    private String nombreIncidente;
    private InstitucionDTO institucion;

    public IncidenteDTO() {
    }
    
    public IncidenteDTO(String nombreIncidente, InstitucionDTO institucion) {
        this.nombreIncidente = nombreIncidente;
        this.institucion = institucion;
    }

    public String getNombreIncidente() {
        return nombreIncidente;
    }

    public void setNombreIncidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

    public InstitucionDTO getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionDTO institucion) {
        this.institucion = institucion;
    }

}
