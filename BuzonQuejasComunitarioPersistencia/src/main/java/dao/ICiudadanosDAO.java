package dao;


import entidades.Ciudadano;
import Excepciones.PersistenciaException;

/**
 *
 * @author Dell
 */
public interface ICiudadanosDAO {
    /**
     * Agrega un nuevo ciudadano a la base de datos.
     *
     * @param ciudadano El objeto Ciudadano a agregar.
     * @return El objeto Ciudadano agregado.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    Ciudadano agregarCiudadano(Ciudadano ciudadano) throws PersistenciaException;
    
     /**
     * Obtiene un ciudadano de la base de datos por su CURP.
     *
     * @param curp El CURP del ciudadano a buscar.
     * @return El objeto Ciudadano correspondiente al CURP especificado.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    Ciudadano obtenerCiudadanoPorCURP(String curp) throws PersistenciaException;
}
