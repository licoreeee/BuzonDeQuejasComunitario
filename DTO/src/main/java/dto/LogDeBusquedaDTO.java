
package dto;

import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaDTO {
    
    CiudadanoDTO ciudadano;
    List<String> filtros;

    public CiudadanoDTO getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(CiudadanoDTO ciudadano) {
        this.ciudadano = ciudadano;
    }

    public List<String> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<String> filtros) {
        this.filtros = filtros;
    }

}
