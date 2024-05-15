package dto;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
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
