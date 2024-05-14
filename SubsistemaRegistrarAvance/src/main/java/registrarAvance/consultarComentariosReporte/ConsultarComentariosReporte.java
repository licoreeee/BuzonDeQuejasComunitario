/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrarAvance.consultarComentariosReporte;

import Excepciones.FindException;
import dto.ComentarioDTO;
import dto.ReporteDTO;
import java.util.List;
import org.itson.diseño.buzonquejascomunitarionegocio.ComentarioBO;

/**
 *
 * @author hisam
 */
public class ConsultarComentariosReporte implements IConsultarComentariosReporte{
    private ComentarioBO comentarioBO;

    public ConsultarComentariosReporte() {
        this.comentarioBO = new ComentarioBO();
    }
    
     public List<ComentarioDTO> consultarComentarios(ReporteDTO reporteDTO) throws FindException{
         return comentarioBO.consultarLista(reporteDTO);
     }
}
