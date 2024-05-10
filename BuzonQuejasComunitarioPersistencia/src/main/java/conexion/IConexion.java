
package conexion;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IConexion {
    
    public MongoDatabase crearConexion();
    
}
