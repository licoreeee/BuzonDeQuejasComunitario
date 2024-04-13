package dto;

/**
 *
 * @author Dell
 */
public class DomicilioDTO {
    
    private String calle;
    private String colonia;

    public DomicilioDTO() {
    }
    
    public DomicilioDTO(String calle, String colonia) {
        this.calle = calle;
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
}
