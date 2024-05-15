package org.itson.diseño.levantarreportess;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;
import excepciones.NegociosException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.ComentarioBO;
import negocio.IInstitucionBO;
import negocio.IReporteBO;
import negocio.InstitucionBO;
import negocio.ReporteBO;

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

    @Override
    public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException {
        try {
            comentarioBO.transporteDatos(comentarioDTO);
        } catch (PersistenciaException e) {
            throw e;
        }
    }

    @Override
    public InstitucionRegistradaDTO consultarInstitucion(String codigoGestion, String nip) throws FindException {
        try {
            return institucionBO.transporteDatos(codigoGestion, nip);
        } catch (FindException ex) {
            throw ex;
        }
    }

    @Override
    public List<ReporteDTO> obtenerReportesAbiertosPorInstitucion(String siglas) throws FindException {
        try {
            return reporteBO.obtenerReportesAbiertosPorInstitucion(siglas);
        } catch (FindException ex) {
            throw ex;
        }
    }

    @Override
    public void actualizarEstado(ReporteDTO reporte) throws PersistenciaException {
         reporteBO.actualizarEstado(reporte);
         }
      

}
