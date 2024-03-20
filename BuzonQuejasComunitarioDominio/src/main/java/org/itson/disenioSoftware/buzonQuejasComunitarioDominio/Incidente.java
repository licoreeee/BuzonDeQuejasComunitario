/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenioSoftware.buzonQuejasComunitarioDominio;


public class Incidente {
    private int idIncidente;
    private String nombreIncidente;
    private Institucion institucion;

    public Incidente() {
    }

    public Incidente(String nombreIncidente, Institucion institucion) {
        this.nombreIncidente = nombreIncidente;
        this.institucion = institucion;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
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

    @Override
    public String toString() {
        return "Incidente{" + "idIncidente=" + idIncidente + ", nombreIncidente=" + nombreIncidente + ", institucion=" + institucion + '}';
    }

    

    
    
}
