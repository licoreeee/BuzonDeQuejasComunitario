
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.InstitucionDTO;
import dto.ReporteDTO;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ILevantarReporteBO {
    
    ReporteDTO validarReporte(ReporteDTO reporteIngresado);
    
    List<ReporteDTO> mostrarReportes();
    
    public List<InstitucionDTO> cargarDatos();
}
