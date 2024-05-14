/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class Comentario {
    
    private ObjectId _id;
    private String titulo;
    private String comentario;
    private Binary photo;
    private Integer folio;
    private Date fechaCreacion;

    public Comentario() {
    }

    public Comentario(ObjectId _id, String titulo, String comentario, Binary  photo, Date fechaCreacion) {
        this._id = _id;
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
        this.fechaCreacion = fechaCreacion;

    }

    public Comentario(String titulo, String comentario, Binary photo, Integer folio, Date fechaCreacion) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
        this.folio = folio;
        this.fechaCreacion = fechaCreacion;
    }

    

    public Comentario(String titulo, String comentario, Integer folio, Date fechaCreacion) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.folio = folio;
        this.fechaCreacion = fechaCreacion;

    }

    

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Binary  getPhoto() {
        return photo;
    }

    public void setPhoto(Binary  photo) {
        this.photo = photo;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
