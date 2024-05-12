
package dao;

import Excepciones.PersistenciaException;
import entidades.LogDeBusqueda;


/**
 *
 * @author Dell
 */
public interface ILogDeBusquedaDAO {
    
    public LogDeBusqueda agregarLogDeBusqueda(LogDeBusqueda logDeBusqueda) throws PersistenciaException;
    
}
