
package dto;

import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaDTO {
    
    private CiudadanoDTO ciudadanoDTO;
    private List<String> filtros;

    public LogDeBusquedaDTO(CiudadanoDTO ciudadanoDTO, List<String> filtros) {
        this.ciudadanoDTO = ciudadanoDTO;
        this.filtros = filtros;
    }

    public CiudadanoDTO getCiudadanoDTO() {
        return ciudadanoDTO;
    }

    public void setCiudadanoDTO(CiudadanoDTO ciudadanoDTO) {
        this.ciudadanoDTO = ciudadanoDTO;
    }

    public List<String> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<String> filtros) {
        this.filtros = filtros;
    }

}
