package dto;

/**
 *
 * @author Dell
 */
public class DomicilioDTO {
    
    private String calle;
    private String colonia;
    private String codigoPostal;
    private String especificaciones;

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

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

}
