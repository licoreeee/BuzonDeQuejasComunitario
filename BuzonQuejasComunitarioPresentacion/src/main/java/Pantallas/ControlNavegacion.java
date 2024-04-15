/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import dto.InstitucionDTO;
import dto.ReporteDTO;

/**
 *
 * @author castr
 */
public class ControlNavegacion {

    public ControlNavegacion() {

    }

    public void mostrarMenuPrincipal() {
        FrmMenuPrincipal menuPrincipal = new FrmMenuPrincipal();
        menuPrincipal.setVisible(true);
    }

    public void mostrarSeleccionInstitucion() {
        FrmSeleccionInstitucion seleccionInstitucion = new FrmSeleccionInstitucion();
        seleccionInstitucion.setVisible(true);
    }

    public void mostrarSeleccionIncidentes(InstitucionDTO institucion) {
        FrmSeleccionIncidentes seleccionIncidentes = new FrmSeleccionIncidentes(institucion);
        seleccionIncidentes.setVisible(true);
    }

    public void mostrarLevantarReporte() {
        FrmLevantarReporte levantarReporte = new FrmLevantarReporte();
        levantarReporte.setVisible(true);
    }

    public void mostrarDireccion(ReporteDTO reporte) {
        FrmDireccion direccion = new FrmDireccion(reporte);
        direccion.setVisible(true);
    }

    public void mostrarFolio() {
        FrmFolio folio = new FrmFolio();
        folio.setVisible(true);
    }

}
