package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import entidades.Institucion;
import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface ILevantarReporteBO {

    List<ReporteDTO> mostrarReportes();

    public List<InstitucionNuevaDTO> cargarDatos();
    
    public InstitucionRegistradaDTO transformarInstitucionDTO(Institucion institucion);
}
