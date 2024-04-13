/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseño.buzonquejascomunitariopersistencia.entidades;

/**
 *
 * @author castr
 */
public class Reporte {

    private int folio;
    private String titulo;
    private Incidente incidente;

    public Reporte() {
    }

    public Reporte(int folio, String titulo, Incidente incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.incidente = incidente;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }

}
