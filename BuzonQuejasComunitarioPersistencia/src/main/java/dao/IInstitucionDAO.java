/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import Excepciones.FindException;
import entidades.Institucion;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz para manipular las instituciones en la base de datos.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IInstitucionDAO {

    /* *
     * Método para agregar una institución a la base de datos.
     * @param institucion La institución a agregar.
     * @return La institución agregada.
     * @throws FindException Si ocurre un error al agregar la institución.
     */
    public Institucion agregarInstitucion(Institucion institucion) throws FindException;

    /* *
     * Método para obtener todas las instituciones de la base de datos.
     * @return Una lista de todas las instituciones.
     * @throws FindException Si ocurre un error al obtener las instituciones.
     */
    public List<Institucion> obtenerInstituciones() throws FindException;


    /* *
     * Método para obtener todas las instituciones por su ID.
     * @param id El ObjectId de la institución.
     * @return Una lista de instituciones correspondientes al ID especificado.
     * @throws FindException Si ocurre un error al obtener las instituciones por su ID.
     */
    public List<Institucion> obtenerInstitucionesPorId(ObjectId id) throws FindException;

    /* *
     * Método para obtener una institución por su código de gestión.
     * @param codigoGestion El código de gestión de la institución.
     * @return La institución correspondiente al código de gestión especificado.
     * @throws FindException Si ocurre un error al obtener la institución por su código de gestión.
     */

    public Institucion obtenerInstitucionPorCodigo(String codigoGestion) throws FindException;

}
