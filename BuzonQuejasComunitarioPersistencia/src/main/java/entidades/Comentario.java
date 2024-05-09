/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Blob;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class Comentario {
    
    private ObjectId _id;
    private String titulo;
    private String comentario;
    private Blob photo;

    public Comentario() {
    }

    public Comentario(ObjectId _id, String titulo, String comentario, Blob photo) {
        this._id = _id;
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
    }

    public Comentario(String titulo, String comentario, Blob photo) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
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

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
    
    
}
