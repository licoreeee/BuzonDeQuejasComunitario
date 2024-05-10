/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        public void registarComentario(ComentarioDTO comentarioDTO) throws PersistenciaException{
            try{
            comentarioBO.transporteDatos(comentarioDTO);
            }catch(PersistenciaException e){
                e.getMessage();
            }
        }
}
