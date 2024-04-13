package dto;

/**
 *
 * @author Dell
 */
public class ReporteDTO {
    
    private int folio;
    private String titulo;
    private IncidenteDTO incidente;

    public ReporteDTO() {
    }

    public ReporteDTO(int folio, String titulo, IncidenteDTO incidente) {
        this.folio = folio;
        this.titulo = titulo;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public IncidenteDTO getIncidente() {
        return incidente;
    }

    public void setIncidente(IncidenteDTO incidente) {
        this.incidente = incidente;
    }

}
