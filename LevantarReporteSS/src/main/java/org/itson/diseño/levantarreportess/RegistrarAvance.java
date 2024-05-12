package org.itson.diseño.levantarreportess;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseño.buzonquejascomunitarionegocio.ComentarioBO;
import org.itson.diseño.buzonquejascomunitarionegocio.InstitucionBO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class RegistrarAvance implements IRegistrarAvance{
    private final ComentarioBO comentarioBO;
    private final InstitucionBO institucionBO;

    public RegistrarAvance() {
        comentarioBO = new ComentarioBO();
        institucionBO = new InstitucionBO();
    }
    
    @Override
        public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException{
            try{
            comentarioBO.transporteDatos(comentarioDTO);
            }catch(PersistenciaException e){
                e.getMessage();
            }
        }
    @Override
        public void consultarInstitucion(String codigoGestion, String nip) throws FindException{
        try {
            institucionBO.transporteDatos(codigoGestion, nip);
        } catch (FindException ex) {
            Logger.getLogger(RegistrarAvance.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
        }
}
