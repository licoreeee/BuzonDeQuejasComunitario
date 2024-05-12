package org.itson.diseño.levantarreportess;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import dto.InstitucionRegistradaDTO;
import org.itson.diseño.buzonquejascomunitarionegocio.ComentarioBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IInstitucionBO;
import org.itson.diseño.buzonquejascomunitarionegocio.InstitucionBO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class RegistrarAvance implements IRegistrarAvance{
    private final ComentarioBO comentarioBO;
    private final IInstitucionBO institucionBO;

    public RegistrarAvance() {
        comentarioBO = new ComentarioBO();
        institucionBO = new InstitucionBO();
    }
    
    @Override
        public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException{
            try{
            comentarioBO.transporteDatos(comentarioDTO);
            }catch(PersistenciaException e){
                throw new PersistenciaException(e.getMessage());
            }
        }
    @Override
        public InstitucionRegistradaDTO consultarInstitucion(String codigoGestion, String nip) throws FindException{
        try {
            return institucionBO.transporteDatos(codigoGestion, nip);
        } catch (FindException ex) {
            throw ex;
        }
        }
}
