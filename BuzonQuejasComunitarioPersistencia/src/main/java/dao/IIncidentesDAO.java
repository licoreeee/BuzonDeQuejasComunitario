/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Incidentes;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz para manipular los incidentes en la base de datos.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IIncidentesDAO {

    /* *
     * Método para agregar una lista de incidentes a la base de datos.
     * @param incidentes Lista de incidentes a agregar.
     * @return La lista de incidentes agregados.
     * @throws FindException Si ocurre un error al agregar los incidentes.
     */
    public List<Incidentes> agregarIncidentes(List<Incidentes> incidentes) throws FindException;

    /* *
     * Método para obtener una lista de incidentes asociados a una institución.
     * @param institucionId El ObjectId de la institución.
     * @return La lista de incidentes asociados a la institución.
     * @throws FindException Si ocurre un error al obtener los incidentes.
     */
    public List<Incidentes> obtenerIncidentes(ObjectId institucionId) throws FindException;

}
