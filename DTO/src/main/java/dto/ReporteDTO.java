package dto;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ReporteDTO {

    private int folio;
    private String titulo;
    private String descripcion;
    private IncidenteDTO incidente;
    private InstitucionDTO institucion;
    private DomicilioDTO domicilio;
    private CiudadanoDTO ciudadano;

    public ReporteDTO() {
    }

    public ReporteDTO(int folio, String titulo, IncidenteDTO incidente) {
        this.folio = folio;
        this.titulo = titulo;
        this.incidente = incidente;
    }

    public ReporteDTO(int folio, String titulo, String descripcion, IncidenteDTO incidente, InstitucionDTO institucion, DomicilioDTO domicilio, CiudadanoDTO ciudadano) {
        this.folio = folio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.incidente = incidente;
        this.institucion = institucion;
        this.domicilio = domicilio;
        this.ciudadano = ciudadano;
    }

    public ReporteDTO(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
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

    public IncidenteDTO getIncidente() {
        return incidente;
    }

    public void setIncidente(IncidenteDTO incidente) {
        this.incidente = incidente;
    }

    public InstitucionDTO getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionDTO institucion) {
        this.institucion = institucion;
    }

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }

    public CiudadanoDTO getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(CiudadanoDTO ciudadano) {
        this.ciudadano = ciudadano;
    }

   
    }

    


