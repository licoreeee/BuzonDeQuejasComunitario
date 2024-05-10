/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionRegistradaDTO {
    
    private String id;
    private String nombre;
    private String siglas;
    private String descripcionAdicional;

    public InstitucionRegistradaDTO() {
    }

    public InstitucionRegistradaDTO(String id) {
        this.id = id;
    }
    
    public InstitucionRegistradaDTO(String id, String nombre, String siglas, String descripcionAdicional) {
        this.id = id;
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
    }

    public InstitucionRegistradaDTO(String nombre, String siglas, String descripcionAdicional) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    @Override
    public String toString() {
        return "InstitucionRegistradaDTO{" + "id=" + id + ", nombre=" + nombre + ", siglas=" + siglas + ", descripcionAdicional=" + descripcionAdicional + '}';
    }
    
}
