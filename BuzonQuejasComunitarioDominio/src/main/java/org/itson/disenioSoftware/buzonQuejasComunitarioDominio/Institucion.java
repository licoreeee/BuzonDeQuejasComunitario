/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenioSoftware.buzonQuejasComunitarioDominio;



public class Institucion {
    private int idInstitucion;
    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;

    public Institucion() {
    }

    public Institucion(String nombreInstitucion, String funcionInstitucion, String siglas) {
        this.nombreInstitucion = nombreInstitucion;
        this.funcionInstitucion = funcionInstitucion;
        this.siglas = siglas;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getFuncionInstitucion() {
        return funcionInstitucion;
    }

    public void setFuncionInstitucion(String funcionInstitucion) {
        this.funcionInstitucion = funcionInstitucion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return "Institucion{" + "idInstitucion=" + idInstitucion + ", nombreInstitucion=" + nombreInstitucion + ", funcionInstitucion=" + funcionInstitucion + ", siglas=" + siglas + '}';
    }
    
    
}
