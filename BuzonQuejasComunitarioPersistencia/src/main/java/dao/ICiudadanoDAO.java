/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Ciudadano;

/**
 *
 * @author Dell
 */
public interface ICiudadanoDAO {
    
    Ciudadano agregarCiudadano() throws PersistenciaException;
    
}
