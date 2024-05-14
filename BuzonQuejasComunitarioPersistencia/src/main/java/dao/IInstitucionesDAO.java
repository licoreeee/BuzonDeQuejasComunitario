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
public interface IInstitucionesDAO {

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



    public Institucion obtenerInstitucionPorCodigo(String codigoGestion) throws FindException;
    
    

}
