package org.itson.diseño.levantarreportess;

import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import org.itson.diseño.buzonquejascomunitarionegocio.ComentarioBO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class RegistrarAvance {
    private ComentarioBO comentarioBO;

    public RegistrarAvance() {
        comentarioBO = new ComentarioBO();
    }
    
        public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException{
            try{
            comentarioBO.transporteDatos(comentarioDTO);
            }catch(PersistenciaException e){
                e.getMessage();
            }
        }
}
