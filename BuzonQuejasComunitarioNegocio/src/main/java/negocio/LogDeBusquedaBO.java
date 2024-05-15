/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import Excepciones.FindException;
import conexion.Conexion;
import conexion.IConexion;
import dao.ILogDeBusquedaDAO;
import dao.LogDeBusquedaDAO;
import dto.LogDeBusquedaDTO;
import entidades.Ciudadano;
import entidades.LogDeBusqueda;
import excepciones.NegociosException;
import java.util.List;

/**
 *
 * @author Dell
 */
public class LogDeBusquedaBO implements ILogDeBusquedaBO{

    private ILogDeBusquedaDAO logDAO;
    private IConexion conexion;
    
    public LogDeBusquedaBO(ICiudadanoBO ciudadanoBO) {
        conexion = new Conexion();
        this.logDAO = new LogDeBusquedaDAO(conexion);
    }

    /**
     * Convierte un objeto LogDeBusquedaDTO en un objeto de entidad LogDeBusqueda.
     *
     * @param logDeBusquedaDTO El objeto LogDeBusquedaDTO a convertir.
     * @return El objeto de entidad LogDeBusqueda resultante de la conversión.
     * @throws NegociosException Si ocurre un error durante la conversión.
     */
    @Override
    public LogDeBusqueda convertirDTO(LogDeBusquedaDTO logDeBusquedaDTO) throws NegociosException {
            return new LogDeBusqueda(logDeBusquedaDTO.getTitulo(),logDeBusquedaDTO.getInstitucion(),logDeBusquedaDTO.getIncidente());

    }

    @Override
    public LogDeBusquedaDTO agregarLogDeBusqueda(LogDeBusqueda logDeBusqueda) throws NegociosException {
//        try {
//            institucion = institucionDAO.agregarInstitucion(institucion);
//        } catch (FindException ex) {
//            throw new FindException("Error al intentar agregar la institucion" + ex.getMessage());
//        }
//        return institucionNuevaDTO;
        return null;
    }

}
