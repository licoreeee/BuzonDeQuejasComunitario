/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Blob;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ComentarioDTO {

    private String titulo;
    private String comentario;
    private Blob photo;

    public ComentarioDTO(String titulo, String comentario, Blob photo) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
    }
  

    public String getTitulo() {
        return titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public Blob getPhoto() {
        return photo;
    }
    
    
}
