package dto;

import java.util.Date;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ComentarioDTO {

    private String titulo;
    private String comentario;
    private byte[] photo;
    private Integer folio;
    private Date fechaCreacion;

    public ComentarioDTO() {
    }

    public ComentarioDTO(byte[] photo) {
        this.photo = photo;
    }

    public ComentarioDTO(String titulo, String comentario, byte[] photo, Integer folio, Date fechaCreacion) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.photo = photo;
        this.folio = folio;
        this.fechaCreacion = fechaCreacion;
    }

    public ComentarioDTO(String titulo, String comentario, Integer folio, Date fechaCreacion) {
        this.titulo = titulo;
        this.comentario = comentario;
        this.folio = folio;
        this.fechaCreacion = fechaCreacion;

    }
    

    public Integer getFolio() {
        return folio;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

}
