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
    private Integer folio;

    public ComentarioDTO() {
    }

    public ComentarioDTO(String titulo, String comentario, byte[] photo, Integer folio) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
        this.folio = folio;
    }

    public ComentarioDTO(String titulo, String comentario, Integer folio) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.folio = folio;
    }
    

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
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
