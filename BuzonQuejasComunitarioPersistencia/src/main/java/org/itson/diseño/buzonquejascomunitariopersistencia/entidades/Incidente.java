/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitariopersistencia.entidades;

/**
 *
 * @author castr
 */
public class Incidente {

    private String nombreIncidente;
    private Institucion institucion;

    public Incidente() {
    }

    public Incidente(String nombreIncidente, Institucion institucion) {
        this.nombreIncidente = nombreIncidente;
        this.institucion = institucion;
    }

    public String getNombreIncidente() {
        return nombreIncidente;
    }

    public void setNombreIncidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

}
