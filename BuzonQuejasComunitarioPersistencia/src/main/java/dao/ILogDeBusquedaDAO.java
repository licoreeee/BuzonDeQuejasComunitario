
package dao;

import Excepciones.PersistenciaException;
import entidades.LogDeBusqueda;


/**
 *
 * @author Dell
 */
public interface ILogDeBusquedaDAO {
    
    LogDeBusqueda agregarLogDeBusqueda() throws PersistenciaException;
    
}
