package registrarAvance;



import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author hisam
 */
public interface IRegistrarAvance {
    
    /**
     * Registra un nuevo comentario en la base de datos.
     *
     * @param comentarioDTO El comentario a registrar.
     * @throws PersistenciaException Si ocurre un error durante la operación de registro.
     */
    public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException;
    
    /**
     * Consulta una institución registrada en la base de datos por su código de gestión y NIP.
     *
     * @param codigoGestion El código de gestión de la institución.
     * @param nip           El NIP de la institución.
     * @return La información de la institución registrada.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public InstitucionRegistradaDTO consultarInstitucion(String codigoGestion, String nip)throws FindException;
    
    /**
     * Obtiene una lista de reportes abiertos asociados a una institución por sus siglas.
     *
     * @param siglas Las siglas de la institución.
     * @return Una lista de reportes abiertos asociados a la institución.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion (String siglas)throws FindException;
    
    /**
     * Actualiza el estado de un reporte en la base de datos.
     *
     * @param reporte El reporte con el estado actualizado.
     * @throws PersistenciaException Si ocurre un error durante la operación de actualización.
     */
    public void actualizarEstado (ReporteDTO reporte) throws PersistenciaException;
    
     /**
     * Consulta los comentarios asociados a un reporte en la base de datos.
     *
     * @param reporteDTO El reporte del cual se desean consultar los comentarios.
     * @return Una lista de comentarios asociados al reporte.
     * @throws FindException Si ocurre un error durante la operación de búsqueda.
     */
    public List<ComentarioDTO> consultarComentarios(ReporteDTO reporteDTO) throws FindException;
}
