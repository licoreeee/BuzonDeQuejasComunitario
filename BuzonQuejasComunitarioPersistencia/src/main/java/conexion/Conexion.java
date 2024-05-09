package conexion;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Dell
 */
public class Conexion implements IConexion{
    
    String cadenaConexion = "mongodb://127.0.0.1:27017";
    String nombreBaseDatos = "BuzonQuejasComunitario";

    @Override
    public MongoClient crearConexion() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(cadenaConexion))
                .codecRegistry(pojoCodecRegistry)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoClient cliente = MongoClients.create(cadenaConexion);
        MongoDatabase baseDatos = cliente.getDatabase(nombreBaseDatos);
        
        return mongoClient;
    }
    
}
