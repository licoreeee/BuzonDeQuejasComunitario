/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import org.itson.diseño.levantarreportess.FacadeLevantarReporte;
import org.itson.diseño.levantarreportess.IFacadeLevantarReporte;

/**
 *
 * @author castr
 */
public class ControlNavegacion {

    private IFacadeLevantarReporte fachadaLevantarReporte;

    public ControlNavegacion() {
        fachadaLevantarReporte = new FacadeLevantarReporte();
    }
    
    public void mostrarMenuPrincipal() {
        FrmMenuPrincipal menuPrincipal = new FrmMenuPrincipal(fachadaLevantarReporte);
        menuPrincipal.setVisible(true);
    }

    public void mostrarSeleccionInstitucion() {
        FrmSeleccionInstitucion seleccionInstitucion = new FrmSeleccionInstitucion(fachadaLevantarReporte);
        seleccionInstitucion.setVisible(true);
    }
    
    public void mostrarSeleccionIncidentes(){
        FrmSeleccionIncidentes seleccionIncidentes = new FrmSeleccionIncidentes(fachadaLevantarReporte);
        seleccionIncidentes.setVisible(true);
    }
    
    public void mostrarLevantarReporte(){
        FrmLevantarReporte levantarReporte = new FrmLevantarReporte(fachadaLevantarReporte);
        levantarReporte.setVisible(true);
    }
    
    public void mostrarDireccion(){
        FrmDireccion direccion = new FrmDireccion(fachadaLevantarReporte);
        direccion.setVisible(true);
    }

    public void mostrarFolio(){
        FrmFolio folio = new FrmFolio(fachadaLevantarReporte);
        folio.setVisible(true);
    }
    
    
}
