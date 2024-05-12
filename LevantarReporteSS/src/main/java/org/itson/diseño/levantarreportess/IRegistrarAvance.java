package org.itson.diseño.levantarreportess;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import dto.ComentarioDTO;

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
    public void consultarInstitucion(String codigoGestion, String nip)throws FindException;
}
