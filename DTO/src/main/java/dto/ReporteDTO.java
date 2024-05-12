package dto;

import java.util.Calendar;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ReporteDTO {

    private String id;
    private int folio;
    private String titulo;
    private String descripcion;
    private Calendar fechaCreacion;
    private Boolean estado;
    private byte[] photo;
    private String idCiudadano;
    private String idInstitucion;
    private String idIncidente;
    private List<ComentarioDTO> comentario;

    public ReporteDTO(String id, int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo, String idCiudadano, String idInstitucion, String idIncidente) {
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

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, Boolean estado, List<ComentarioDTO> comentario) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.comentario = comentario;
    }

    

    
    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo, String idCiudadano, String idInstitucion, String idIncidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.idCiudadano = idCiudadano;
        this.idInstitucion = idInstitucion;
        this.idIncidente = idIncidente;
    }
    
    public ReporteDTO(String id, int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo) {
        this.id = id;
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
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

    public Boolean getEstado() {
        return estado;
    }

    public List<ComentarioDTO> getComentario() {
        return comentario;
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

    public Boolean isEstado() {
        return estado;
    }

    public String getIdCiudadano() {
        return idCiudadano;
    }

    public String getIdInstitucion() {
        return idInstitucion;
    }

    public String getIdIncidente() {
        return idIncidente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
  
    
    }

    


