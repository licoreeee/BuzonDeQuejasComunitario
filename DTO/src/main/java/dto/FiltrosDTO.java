/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Calendar;

/**
 *
 * @author Dell
 */
public class FiltrosDTO {
    
    private String titulo;
    private InstitucionRegistradaDTO institucion;
    private Calendar fechaInicio;
    private Calendar fechaFinal;
    private String coordenadaLat;
    private String coordenadaLong;
    private int indexIncidente;

    public FiltrosDTO() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public InstitucionRegistradaDTO getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionRegistradaDTO institucion) {
        this.institucion = institucion;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getCoordenadaLat() {
        return coordenadaLat;
    }

    public void setCoordenadaLat(String coordenadaLat) {
        this.coordenadaLat = coordenadaLat;
    }

    public String getCoordenadaLong() {
        return coordenadaLong;
    }

    public void setCoordenadaLong(String coordenadaLong) {
        this.coordenadaLong = coordenadaLong;
    }

    public int getIndexIncidente() {
        return indexIncidente;
    }

    public void setIndexIncidente(int indexIncidente) {
        this.indexIncidente = indexIncidente;
    }
    
}
