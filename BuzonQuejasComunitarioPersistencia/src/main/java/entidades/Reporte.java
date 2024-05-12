/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class Reporte {

    private ObjectId id;
    private int folio;
    private String titulo;
    private String descripcion;
    private Calendar fechaCreacion;
    private Binary photo;
    private Ciudadano ciudadano;
    private Institucion institucion;
    private Incidentes incidente;

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, Binary photo, Ciudadano ciudadano, Institucion institucion, Incidentes incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.ciudadano = ciudadano;
        this.institucion = institucion;
        this.incidente = incidente;
    }

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, Ciudadano ciudadano, Institucion institucion, Incidentes incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.ciudadano = ciudadano;
        this.institucion = institucion;
        this.incidente = incidente;
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Binary getPhoto() {
        return photo;
    }

    public void setPhoto(Binary photo) {
        this.photo = photo;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Incidentes getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidentes incidente) {
        this.incidente = incidente;
    }
    
    
    
}

