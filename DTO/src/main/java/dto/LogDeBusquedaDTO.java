
package dto;

import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaDTO {
    
    private String nombreCiudadano;
    private String curpCiudadano;
    private List<String> filtros;

    public LogDeBusquedaDTO(String nombreCiudadano, String curpCiudadano, List<String> filtros) {
        this.nombreCiudadano = nombreCiudadano;
        this.curpCiudadano = curpCiudadano;
        this.filtros = filtros;
    }

    public String getNombreCiudadano() {
        return nombreCiudadano;
    }

    public void setNombreCiudadano(String nombreCiudadano) {
        this.nombreCiudadano = nombreCiudadano;
    }

    public String getCurpCiudadano() {
        return curpCiudadano;
    }

    public void setCurpCiudadano(String curpCiudadano) {
        this.curpCiudadano = curpCiudadano;
    }

    public List<String> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<String> filtros) {
        this.filtros = filtros;
    }

}
