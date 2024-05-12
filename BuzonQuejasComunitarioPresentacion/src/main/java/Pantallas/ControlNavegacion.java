/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import PantallasAvance.FrmComentariosReporte;
import PantallasAvance.FrmCrearComentario;
import PantallasAvance.FrmPortalInstituciones;
import PantallasAvance.FrmReportesPendientes;
import dto.InstitucionNuevaDTO;
import dto.ReporteDTO;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ControlNavegacion {

    public ControlNavegacion() {

    }

    public void mostrarMenuPrincipal() {
        FrmMenuPrincipal menuPrincipal = new FrmMenuPrincipal();
        menuPrincipal.setVisible(true);
    }

    public void mostrarPortalInstituciones() {
        FrmPortalInstituciones portalInstituciones = new FrmPortalInstituciones();
        portalInstituciones.setVisible(true);
    }

    public void mostrarReportesPendientes() {
        FrmReportesPendientes reportesPendientes = new FrmReportesPendientes();
        reportesPendientes.setVisible(true);
    }

    public void mostrarCrearComentario() {
        FrmCrearComentario crearComentario = new FrmCrearComentario();
        crearComentario.setVisible(true);
    }

    public void mostrarComentariosReporte() {
        FrmComentariosReporte comentariosReporte = new FrmComentariosReporte();
        comentariosReporte.setVisible(true);
    }

    public void mostrarSeleccionInstitucion() {
        FrmSeleccionInstitucion seleccionInstitucion = new FrmSeleccionInstitucion();
        seleccionInstitucion.setVisible(true);
    }

    public void mostrarSeleccionIncidentes(InstitucionNuevaDTO institucion) {
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

    public void mostrarCodigoAdmin() {
        FrmCodigoAdmin codigoAdmin = new FrmCodigoAdmin();
        codigoAdmin.setVisible(true);
    }

    public void mostrarInstitucionesRegistradas() {
        FrmInstitucionesRegistradas institucionesRegistradas = new FrmInstitucionesRegistradas(this);
        institucionesRegistradas.setVisible(true);
    }

    public void mostrarInfoInstitucion() {
        FrmInfoInstitucion infoInstitucion = new FrmInfoInstitucion();
        infoInstitucion.setVisible(true);
    }

    public void mostrarIncidentes(InstitucionNuevaDTO institucionNuevaDTO) {
        FrmIncidentes incidentes = new FrmIncidentes(institucionNuevaDTO);
        incidentes.setVisible(true);
    }

    public void mostrarConfirmado() {
        FrmConfirmado confirmado = new FrmConfirmado();
        confirmado.setVisible(true);
    }

}
