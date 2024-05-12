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
    private String calle;
    private String colonia;
    private String descripcionExtra;
    private Ciudadano ciudadano;
    private Institucion institucion;
    private Incidentes incidente;

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, Binary photo, String calle, String colonia, String descripcionExtra, Ciudadano ciudadano, Institucion institucion, Incidentes incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.calle = calle;
        this.colonia = colonia;
        this.descripcionExtra = descripcionExtra;
        this.ciudadano = ciudadano;
        this.institucion = institucion;
        this.incidente = incidente;
    }

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, String calle, String colonia, String descripcionExtra, Ciudadano ciudadano, Institucion institucion, Incidentes incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.calle = calle;
        this.colonia = colonia;
        this.descripcionExtra = descripcionExtra;
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

    public String getDescripcionExtra() {
        return descripcionExtra;
    }

    public void setDescripcionExtra(String descripcionExtra) {
        this.descripcionExtra = descripcionExtra;
    }
    
    
    
}

