
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class LogDeBusqueda {
    
    private ObjectId id;
    private Ciudadano ciudadano;
    List<String> filtros;

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
