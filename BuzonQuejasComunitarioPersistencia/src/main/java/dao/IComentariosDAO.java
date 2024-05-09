/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Comentario;
import entidades.Reporte;
import java.util.List;
import Excepciones.PersistenciaException;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IComentariosDAO {
    public Comentario agregarComentario() throws PersistenciaException;
     public List<Comentario> consultarComentariosReporte(Reporte reporte) throws FindException;
}
