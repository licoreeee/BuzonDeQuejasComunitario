/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;


import entidades.Ciudadano;
import Excepciones.PersistenciaException;

/**
 *
 * @author Dell
 */
public interface ICiudadanosDAO {
    
    Ciudadano agregarCiudadano() throws PersistenciaException;
    
    Ciudadano obtenerCiudadanoPorCURP(String curp) throws PersistenciaException;
}
