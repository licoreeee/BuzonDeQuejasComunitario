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
    private byte[] photo;

    public ComentarioDTO() {
    }

    public ComentarioDTO(String titulo, String comentario, byte[] photo) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
    }

    public ComentarioDTO(String titulo, String comentario) {
        this.titulo = titulo;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public byte[] getPhoto() {
        return photo;
    }

}
