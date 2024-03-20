
package org.itson.disenioSoftware.buzonQuejasComunitarioDominio;


public class Domicilio {
    private int idDomicilio;
    private String calle;
    private String colonia;
    private String numeroCasa;
    private String codigoPostal;
    private String especificacionesExtra;

    public Domicilio(
            String calle, 
            String colonia, 
            String numeroCasa, 
            String codigoPostal, 
            String especificacionesExtra
    ) {
        this.calle = calle;
        this.colonia = colonia;
        this.numeroCasa = numeroCasa;
        this.codigoPostal = codigoPostal;
        this.especificacionesExtra = especificacionesExtra;
    }

    public Domicilio() {
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
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

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEspecificacionesExtra() {
        return especificacionesExtra;
    }

    public void setEspecificacionesExtra(String especificacionesExtra) {
        this.especificacionesExtra = especificacionesExtra;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "idDomicilio=" + idDomicilio + ", calle=" + calle + ", colonia=" + colonia + ", numeroCasa=" + numeroCasa + ", codigoPostal=" + codigoPostal + ", especificacionesExtra=" + especificacionesExtra + '}';
    }
    
    
}
