
package entidades;

import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusqueda {
    
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
