package registrarAvance;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import excepciones.NegociosException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseño.buzonquejascomunitarionegocio.ComentarioBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IInstitucionBO;
import org.itson.diseño.buzonquejascomunitarionegocio.IReporteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.InstitucionBO;
import org.itson.diseño.buzonquejascomunitarionegocio.ReporteBO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class RegistrarAvance implements IRegistrarAvance {

    private final ComentarioBO comentarioBO;
    private final IInstitucionBO institucionBO;
    private final IReporteBO reporteBO;

    public RegistrarAvance() {
        comentarioBO = new ComentarioBO();
        institucionBO = new InstitucionBO();
        reporteBO = new ReporteBO();
    }

     /**
     * Consulta una institución registrada en la base de datos por su código de gestión y NIP.
     *
     * @param codigoGestion El código de gestión de la institución.
     * @param nip           El NIP de la institución.
     * @return La información de la institución registrada.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    @Override
    public InstitucionRegistradaDTO consultarInstitucion(String codigoGestion, String nip) throws FindException {
        try {
            return institucionBO.transporteDatos(codigoGestion, nip);
        } catch (FindException ex) {
            throw ex;
        }
    }

     /**
     * Obtiene una lista de reportes abiertos asociados a una institución por sus siglas.
     *
     * @param siglas Las siglas de la institución.
     * @return Una lista de reportes abiertos asociados a la institución.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    @Override
    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion(String siglas) throws FindException {
        try {
            return reporteBO.obtenerReportesAbiertosPorInstitucion(siglas);
        } catch (FindException ex) {
            throw ex;
        }
    }

     /**
     * Actualiza el estado de un reporte en la base de datos.
     *
     * @param reporte El reporte con el estado actualizado.
     * @throws PersistenciaException Si ocurre un error durante la operación de actualización.
     */
    @Override
    public void actualizarEstado(ReporteDTO reporte) throws PersistenciaException {
        reporteBO.actualizarEstado(reporte);
    }

    /**
     * Registra un nuevo comentario en la base de datos.
     *
     * @param comentarioDTO El comentario a registrar.
     * @throws PersistenciaException Si ocurre un error durante la operación de registro.
     */
    @Override
    public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException {
        try {
            comentarioBO.transporteDatos(comentarioDTO);
        } catch (PersistenciaException e) {
            throw e;
        }
    }

    /**
     * Consulta los comentarios asociados a un reporte en la base de datos.
     *
     * @param reporteDTO El reporte del cual se desean consultar los comentarios.
     * @return Una lista de comentarios asociados al reporte.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    @Override
    public List<ComentarioDTO> consultarComentarios(ReporteDTO reporteDTO) throws FindException {

        return comentarioBO.consultarLista(reporteDTO);

    }

}
