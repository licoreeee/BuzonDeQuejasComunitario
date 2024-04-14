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

    public ReporteDTO(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getFolio() {
        return folio;
    }

    public String getTitulo() {
        return titulo;
    }

    public InstitucionDTO getInstitucion() {
        return institucion;
    }

    public IncidenteDTO getIncidente() {
        return incidente;
    }

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public CiudadanoDTO getCiudadano() {
        return ciudadano;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
