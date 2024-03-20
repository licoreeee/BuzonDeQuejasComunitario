/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pantallas;

import org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso.FacadeLevantarReporte;
import org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso.IFacadeLevantarReporte;

/**
 *
 * @author Integrantes:
 */
public class Pruebas {

    public static void main(String[] args) {

        IFacadeLevantarReporte fachadaLevantarReporte = new FacadeLevantarReporte();
        ControlNavegacion controladores = new ControlNavegacion();

        controladores.mostrarMenuPrincipal();
    }

}
