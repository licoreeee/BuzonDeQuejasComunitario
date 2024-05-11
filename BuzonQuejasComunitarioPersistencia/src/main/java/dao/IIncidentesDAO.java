/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import Excepciones.PersistenciaException;
import entidades.Incidentes;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IIncidentesDAO {
    
    public List<Incidentes> agregarIncidentes(List<Incidentes> incidentes) throws FindException;
    
    public List<Incidentes> obtenerIncidentes(ObjectId institucionId) throws FindException;
    
}
