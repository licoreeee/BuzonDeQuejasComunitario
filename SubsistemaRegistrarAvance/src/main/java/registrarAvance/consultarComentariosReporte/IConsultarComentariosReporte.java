/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package registrarAvance.consultarComentariosReporte;

import Excepciones.FindException;
import dto.ComentarioDTO;
import dto.ReporteDTO;
import java.util.List;

/**
 *
 * @author hisam
 */
public interface IConsultarComentariosReporte {
    public List<ComentarioDTO> consultarComentarios(ReporteDTO reporteDTO) throws FindException;
}
