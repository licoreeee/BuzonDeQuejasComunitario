package dto;

/**
 *
 * @author Dell
 */
public class IncidenteDTO {
    
    private String nombreIncidente;

    public IncidenteDTO() {
    }
    
    public IncidenteDTO(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

    public String getNombreIncidente() {
        return nombreIncidente;
    }

    public void setNombreIncidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

}
