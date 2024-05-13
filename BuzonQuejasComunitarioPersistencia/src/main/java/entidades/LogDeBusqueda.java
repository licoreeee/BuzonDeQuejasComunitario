
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class LogDeBusqueda {
    
    private Ciudadano ciudadano;
    List<String> filtros;

    public LogDeBusqueda(Ciudadano ciudadano, List<String> filtros) {
        this.ciudadano = ciudadano;
        this.filtros = filtros;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }
    
    public List<String> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<String> filtros) {
        this.filtros = filtros;
    }
    
}
