
package dto;

import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaDTO {
    
    private String titulo;
    private String institucion;
    private String incidente;

    public LogDeBusquedaDTO() {
    }

    public LogDeBusquedaDTO(String titulo, String institucion, String incidente) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.incidente = incidente;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }
}
