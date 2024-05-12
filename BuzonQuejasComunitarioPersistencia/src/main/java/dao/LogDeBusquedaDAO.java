
package dao;

import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexion.IConexion;
import entidades.LogDeBusqueda;


/**
 *
 * @author Dell
 */
public class LogDeBusquedaDAO implements ILogDeBusquedaDAO{
    
    private final IConexion conexion;
    private final MongoCollection<LogDeBusqueda> collection;

    public LogDeBusquedaDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("LogDeBusqueda", LogDeBusqueda.class);
    }  
    
    @Override
    public LogDeBusqueda agregarLogDeBusqueda(LogDeBusqueda logDeBusqueda) throws PersistenciaException {
        try {
            collection.insertOne(logDeBusqueda);
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al agregar el log de búsqueda.");
        }
        return logDeBusqueda;
    }

}
