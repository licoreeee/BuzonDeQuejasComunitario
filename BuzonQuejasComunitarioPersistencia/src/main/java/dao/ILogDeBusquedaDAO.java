
package dao;

import entidades.LogDeBusqueda;
import persistenciaException.PersistenciaException;

/**
 *
 * @author Dell
 */
public interface ILogDeBusquedaDAO {
    
    LogDeBusqueda agregarLogDeBusqueda() throws PersistenciaException;
    
}
