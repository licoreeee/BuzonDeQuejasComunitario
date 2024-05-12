package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import entidades.Reporte;
import excepciones.NegociosException;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IReporteBO {

   public boolean validarFormatoDTO(ReporteDTO reporteDTO) throws NegociosException;

}
