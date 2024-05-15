
package dao;

import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexion.IConexion;
import entidades.LogDeBusqueda;


/**
 *
 * @author Hisamy Cinco, Gael Castro, Victoria Vega
 */
public class LogDeBusquedaDAO implements ILogDeBusquedaDAO{
    
    private final IConexion conexion;
    private final MongoCollection<LogDeBusqueda> collection;

    /**
     * Constructor de la clase LogDeBusquedaDAO.
     *
     * @param conexion El objeto que gestiona la conexión a la base de datos.
     */
    public LogDeBusquedaDAO(IConexion conexion) {
        this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("LogDeBusqueda", LogDeBusqueda.class);
    }  
    
    /**
     * Agrega un nuevo registro de búsqueda a la base de datos.
     *
     * @param logDeBusqueda El registro de búsqueda a agregar.
     * @return El registro de búsqueda agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de inserción.
     */
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
