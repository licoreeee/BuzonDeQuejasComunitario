
package conexion;

import com.mongodb.client.MongoClient;

/**
 *
 * @author Dell
 */
public interface IConexion {
    
    public MongoClient crearConexion();
    
}
