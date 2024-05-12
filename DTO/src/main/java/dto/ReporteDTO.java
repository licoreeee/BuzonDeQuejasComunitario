package dto;

import java.util.Calendar;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ReporteDTO {

    private String id;
    private int folio;
    private String titulo;
    private String descripcion;
    private Calendar fechaCreacion;
    private byte[] photo;
    private CiudadanoDTO ciudadano;
    private InstitucionRegistradaDTO institucion;
    private IncidentesDTO incidente;

    public ReporteDTO(String id, int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo, CiudadanoDTO ciudadano, InstitucionRegistradaDTO institucion, IncidentesDTO incidente) {
        this.id = id;
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.ciudadano = ciudadano;
        this.institucion = institucion;
        this.incidente = incidente;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo, CiudadanoDTO ciudadano, InstitucionRegistradaDTO institucion, IncidentesDTO incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
        this.ciudadano = ciudadano;
        this.institucion = institucion;
        this.incidente = incidente;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public CiudadanoDTO getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(CiudadanoDTO ciudadano) {
        this.ciudadano = ciudadano;
    }

    public InstitucionRegistradaDTO getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionRegistradaDTO institucion) {
        this.institucion = institucion;
    }

    public IncidentesDTO getIncidente() {
        return incidente;
    }

    public void setIncidente(IncidentesDTO incidente) {
        this.incidente = incidente;
    }
  
    
    
    }

    


