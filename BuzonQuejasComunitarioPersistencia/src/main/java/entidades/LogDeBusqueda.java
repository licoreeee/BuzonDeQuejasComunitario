
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class LogDeBusqueda {
    
    private String nombreCiudadano;
    private String curpCiudadano;
    List<String> filtros;

    public LogDeBusqueda(String nombreCiudadano, String curpCiudadano, List<String> filtros) {
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
