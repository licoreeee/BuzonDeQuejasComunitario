
package conexion;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Dell
 */
public interface IConexion {
    
    public MongoDatabase crearConexion();
    
}
