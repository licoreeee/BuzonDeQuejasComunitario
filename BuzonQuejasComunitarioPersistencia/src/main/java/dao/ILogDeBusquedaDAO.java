
package dao;

import Excepciones.PersistenciaException;
import entidades.LogDeBusqueda;


/**
 *
 * @author Dell
 */
public interface ILogDeBusquedaDAO {
    
    /**
     * Agrega un nuevo registro de búsqueda a la base de datos.
     *
     * @param logDeBusqueda El objeto LogDeBusqueda a agregar.
     * @return El objeto LogDeBusqueda agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    public LogDeBusqueda agregarLogDeBusqueda(LogDeBusqueda logDeBusqueda) throws PersistenciaException;
    
}
