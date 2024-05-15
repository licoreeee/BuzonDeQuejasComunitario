
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
    
    private final IConexion conexion;
    private MongoCollection<Ciudadano> collection;

    /**
     * Constructor que inicializa la conexión y la colección de MongoDB.
     * 
     * @param conexion La conexión a la base de datos.
     * @param coleccion La colección de MongoDB que contiene los ciudadanos.
     */
    public CiudadanosDAO(IConexion conexion, MongoCollection<Ciudadano> coleccion) {
         this.conexion = conexion;
        MongoDatabase database = conexion.crearConexion();
        this.collection = database.getCollection("Ciudadanos", Ciudadano.class);
    }

     /**
     * Agrega un nuevo ciudadano a la base de datos.
     *
     * @param ciudadano El objeto Ciudadano a agregar.
     * @return El objeto Ciudadano agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    @Override
    public Ciudadano agregarCiudadano(Ciudadano ciudadano) throws PersistenciaException {
       try {
            collection.insertOne(ciudadano);
        } catch (MongoException e) {
            throw new PersistenciaException("error al agregar al ciudadano");
        }
        return ciudadano;
    }

    /**
     * Obtiene un ciudadano de la base de datos por su CURP.
     *
     * @param curp El CURP del ciudadano a buscar.
     * @return El objeto Ciudadano correspondiente al CURP especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    @Override
    public Ciudadano obtenerCiudadanoPorCURP(String curp) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    }

   
    

