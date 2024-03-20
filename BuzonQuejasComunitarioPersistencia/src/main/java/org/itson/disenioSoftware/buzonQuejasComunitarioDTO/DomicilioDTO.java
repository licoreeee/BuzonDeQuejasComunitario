/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenioSoftware.buzonQuejasComunitarioDTO;

/**
 *
 * @author castr
 */
public class DomicilioDTO {
    
    private int idDomicilio;
    private String calle;
    private String colonia;
    private String numeroCasa;
    private String codigoPostal;
    private String especificacionesExtra;

    public DomicilioDTO() {
    }

    public DomicilioDTO(String calle, String colonia, String numeroCasa, String codigoPostal, String especificacionesExtra) {
        this.calle = calle;
        this.colonia = colonia;
        this.numeroCasa = numeroCasa;
        this.codigoPostal = codigoPostal;
        this.especificacionesExtra = especificacionesExtra;
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
    
    
    
}
