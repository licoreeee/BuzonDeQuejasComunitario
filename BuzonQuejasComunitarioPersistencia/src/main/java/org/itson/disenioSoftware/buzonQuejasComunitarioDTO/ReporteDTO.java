
package org.itson.disenioSoftware.buzonQuejasComunitarioDTO;


public class ReporteDTO {
    private int folio;
    private String titulo;
    private InstitucionDTO institucion;
    private DomicilioDTO domicilio;
    private CiudadanoDTO ciudadano;
    

    public ReporteDTO() {
    }

    public ReporteDTO(
            int folio, 
            String titulo, 
            InstitucionDTO institucion,
            DomicilioDTO domicilio) {
        this.folio = folio;
        this.titulo = titulo;
        this.institucion = institucion;
        this.domicilio = domicilio;
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

    public InstitucionDTO getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionDTO institucion) {
        this.institucion = institucion;
    }

    public CiudadanoDTO getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(CiudadanoDTO ciudadano) {
        this.ciudadano = ciudadano;
    }

    

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }
    
    
    
}
