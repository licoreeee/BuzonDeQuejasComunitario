package org.itson.diseño.levantarreportess;

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
    public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException;
    public InstitucionRegistradaDTO consultarInstitucion(String codigoGestion, String nip)throws FindException;
    public List<ReporteDTO> obtenerIncidentesAbiertosPorInstitucion (String idInstitucion)throws FindException;
    public void actualizarEstado (ReporteDTO reporte) throws PersistenciaException;
}
