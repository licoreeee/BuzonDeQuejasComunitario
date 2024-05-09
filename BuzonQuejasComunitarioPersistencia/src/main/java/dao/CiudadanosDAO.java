
package dao;


import entidades.Ciudadano;
import Excepciones.PersistenciaException;
import com.mongodb.client.MongoClient;
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
    private MongoCollection<Ciudadano> coleccion;

    public CiudadanosDAO(IConexion conexion, MongoCollection<Ciudadano> coleccion) {
        this.conexion = conexion;
        this.coleccion = coleccion;
    }

    @Override
    public Ciudadano agregarCiudadano() throws PersistenciaException {
        MongoClient mc = this.conexion.crearConexion();
        MongoDatabase baseDatos = mc.getDatabase("BuzonQuejasComunitario");
        coleccion = baseDatos.getCollection("Ciudadanos", Ciudadano.class);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ciudadano obtenerCiudadanoPorCURP(String curp) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
