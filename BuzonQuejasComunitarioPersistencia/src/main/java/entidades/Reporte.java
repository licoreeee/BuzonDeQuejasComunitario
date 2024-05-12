/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.List;
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
    private Boolean estado;
    private ObjectId idCiudadano;
    private ObjectId idInstitucion;
    private ObjectId idIncidente;
    private List<Comentario>comentarios;

    public Reporte(ObjectId id, int folio, String titulo, String descripcion, Calendar fechaCreacion, Binary photo, ObjectId idCiudadano, ObjectId idInstitucion, ObjectId idIncidente) {
        this.id = id;
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.idCiudadano = idCiudadano;
        this.idInstitucion = idInstitucion;
        this.idIncidente = idIncidente;
    }

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, Binary photo, ObjectId idCiudadano, ObjectId idInstitucion, ObjectId idIncidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.idCiudadano = idCiudadano;
        this.idInstitucion = idInstitucion;
        this.idIncidente = idIncidente;
    }
    
    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, List<Comentario> comentarios, Boolean estado) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.comentarios = comentarios;
        this.estado = estado;
    }

    public Reporte(int folio, String titulo, String descripcion, Calendar fechaCreacion, Binary photo) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
    }

    public Reporte(ObjectId id, int folio, String titulo, String descripcion, Calendar fechaCreacion, Binary photo) {
        this.id = id;
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
    }

    public Reporte(ObjectId id, int folio, String titulo, String descripcion, Calendar fechaCreacion) {
        this.id = id;
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
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

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
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

    public ObjectId getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(ObjectId idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public ObjectId getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(ObjectId idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public ObjectId getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(ObjectId idIncidente) {
        this.idIncidente = idIncidente;
    }

    
}

