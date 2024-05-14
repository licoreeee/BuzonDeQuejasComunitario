package conexion;

import com.mongodb.client.MongoDatabase;

/**
 * Interfaz que define el metodo para establecer una conexión a MongoDB.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public interface IConexion {

    /**
     * Crea una conexión a la base de datos MongoDB.
     *
     * @return La base de datos MongoDB a la que se ha conectado.
     */
    public MongoDatabase crearConexion();

}
