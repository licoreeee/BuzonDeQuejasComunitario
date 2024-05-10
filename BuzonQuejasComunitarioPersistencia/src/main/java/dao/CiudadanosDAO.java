
package dao;


import Excepciones.PersistenciaException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexion.IConexion;
import entidades.Ciudadano;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class CiudadanosDAO implements ICiudadanosDAO{
    
    private IConexion conexion;
    private MongoCollection<Ciudadano> collection;

    public CiudadanosDAO(IConexion conexion, MongoCollection<Ciudadano> coleccion) {
         this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Ciudadanos", Ciudadano.class);
    }

    @Override
    public Ciudadano agregarCiudadano(Ciudadano ciudadano) throws PersistenciaException {
       try {
            collection.insertOne(ciudadano);
        } catch (MongoException e) {
            throw new PersistenciaException("error al agregar al ciudadano");
        }
        return ciudadano;
    }

    @Override
    public Ciudadano obtenerCiudadanoPorCURP(String curp) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    }

   
    

