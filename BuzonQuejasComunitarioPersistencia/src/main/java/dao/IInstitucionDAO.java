/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.PersistenciaException;
import entidades.Institucion;
import java.util.List;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IInstitucionDAO {

    public Institucion agregarInstitucion(Institucion institucion) throws PersistenciaException;

    public List<Institucion> obtenerInstituciones() throws PersistenciaException;

}
