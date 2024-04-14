
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import java.util.List;

/**
 *
 * @author castr
 */
public interface ILevantarReporteBO {
    
    ReporteDTO validarReporte(ReporteDTO reporteIngresado);
    
    List<ReporteDTO> mostrarReportes();
}
