/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author hisam
 */
public class Institucion {
    
    private ObjectId id;
    private String nombre;
    private String siglas;
    private String descripcionAdicional;

    public Institucion(ObjectId id, String nombre, String siglas, String descripcionAdicional) {
        this.id = id;
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
    }

    public Institucion() {
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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
        return "Institucion{" + "id=" + id + ", nombre=" + nombre + ", siglas=" + siglas + ", descripcionAdicional=" + descripcionAdicional + '}';
    }
    
}
