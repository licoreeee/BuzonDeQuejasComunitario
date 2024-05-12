/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import entidades.Institucion;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IInstitucionDAO {

    public Institucion agregarInstitucion(Institucion institucion) throws FindException;

    public List<Institucion> obtenerInstituciones() throws FindException;
    
//    public List<Institucion> obtenerInstitucionesPorId(ObjectId id) throws FindException;

}
