package dto;

import java.util.Calendar;
import java.util.Date;

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
    private String calle;
    private String colonia;
    private String descripcionExtra;
    private CiudadanoDTO ciudadano;
    private InstitucionRegistradaDTO institucion;
    private IncidentesDTO incidente;
  

    public ReporteDTO() {
    }

    public ReporteDTO(int folio, Boolean estado) {
        this.folio = folio;
        this.estado = estado;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, String calle, String colonia) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.calle = calle;
        this.colonia = colonia;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, Boolean estado, String calle, String colonia, String descripcionExtra, InstitucionRegistradaDTO institucion, IncidentesDTO incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.calle = calle;
        this.colonia = colonia;
        this.descripcionExtra = descripcionExtra;
        this.institucion = institucion;
        this.incidente = incidente;

    }   
    public ReporteDTO(String id, String titulo, Boolean estado) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;

    }

    public ReporteDTO(String id, Boolean estado) {
        this.id = id;
        this.estado = estado;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo, String calle, String colonia, String descripcionExtra, CiudadanoDTO ciudadano, InstitucionRegistradaDTO institucion, IncidentesDTO incidente) {

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

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, Boolean estado, String calle, String colonia) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.calle = calle;
        this.colonia = colonia;
    }

    public ReporteDTO(String id, int folio, String titulo, String descripcion, Calendar fechaCreacion, byte[] photo) {

        this.id = id;
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.photo = photo;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, Calendar fechaCreacion, String calle, String colonia, String descripcionExtra, CiudadanoDTO ciudadano, InstitucionRegistradaDTO institucion, IncidentesDTO incidente) {

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
