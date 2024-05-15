
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class LogDeBusqueda {
    
    private String titulo;
    private String institucion;
    private String incidente;

    public LogDeBusqueda(String titulo, String institucion, String incidente) {
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
