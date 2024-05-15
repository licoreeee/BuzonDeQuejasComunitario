package dto;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class DomicilioDTO {
    
    private String calle;
    private String colonia;
    private String codigoPostal;
    private String especificaciones;

    public DomicilioDTO() {
    }

    public DomicilioDTO(String calle, String colonia, String codigoPostal, String especificaciones) {
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.especificaciones = especificaciones;
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
