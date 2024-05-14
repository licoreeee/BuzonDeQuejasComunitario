/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import PantallasAvance.DlgComentarioExitoso;
import PantallasAvance.FrmComentariosReporte;
import PantallasAvance.FrmCrearComentario;
import PantallasAvance.FrmPortalInstituciones;
import PantallasAvance.FrmReportesPendientes;
import PantallasHistorial.FrmHistorial;
import dto.InstitucionNuevaDTO;
import dto.InstitucionRegistradaDTO;
import dto.ReporteDTO;

/**
 * Controlador encargado de la navegación entre las diferentes vistas del
 * sistema.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega
 */
public class ControlNavegacion {

    /**
     * Constructor de la clase ControlNavegacion.
     */
    public ControlNavegacion() {

    }

    /**
     * Muestra el menú principal del sistema.
     */
    public void mostrarMenuPrincipal() {
        FrmMenuPrincipal menuPrincipal = new FrmMenuPrincipal();
        menuPrincipal.setVisible(true);
    }

    /**
     * Muestra el portal de instituciones.
     */
    public void mostrarPortalInstituciones() {
        FrmPortalInstituciones portalInstituciones = new FrmPortalInstituciones();
        portalInstituciones.setVisible(true);
    }

    /**
     * Muestra los reportes pendientes asociados a una institución.
     *
     * @param institucion La información de la institución.
     */
    public void mostrarReportesPendientes(InstitucionRegistradaDTO institucion) {
        FrmReportesPendientes reportesPendientes = new FrmReportesPendientes(institucion);
    }
    
    public void mostrarComentarioExitoso(ReporteDTO reporteDTO, InstitucionRegistradaDTO institucionDTO){
        DlgComentarioExitoso comentarioExitoso= new  DlgComentarioExitoso(null, true, reporteDTO, institucionDTO);
        comentarioExitoso.setVisible(true);
        
    }
    /**
     * Muestra el formulario para crear un comentario.
     * @param reporteDTO
     * @param institucionDTO
     */
    public void mostrarCrearComentario(ReporteDTO reporteDTO, InstitucionRegistradaDTO institucionDTO) {
        FrmCrearComentario crearComentario = new FrmCrearComentario(reporteDTO, institucionDTO);
        crearComentario.setVisible(true);
    }

    /**
     * Muestra la vista para visualizar los comentarios de un reporte.
     */
    public void mostrarComentariosReporte(ReporteDTO reporteDTO, InstitucionRegistradaDTO institucionDTO) {
        FrmComentariosReporte comentariosReporte = new FrmComentariosReporte(reporteDTO, institucionDTO);
        comentariosReporte.setVisible(true);
    }

    /**
     * Muestra la vista para seleccionar una institución.
     */
    public void mostrarSeleccionInstitucion() {
        FrmSeleccionInstitucion seleccionInstitucion = new FrmSeleccionInstitucion();
        seleccionInstitucion.setVisible(true);
    }

    /**
     * Muestra la vista para seleccionar incidentes asociados a una institución
     * nueva.
     *
     * @param institucion La información de la institución nueva.
     */
    public void mostrarSeleccionIncidentes(InstitucionNuevaDTO institucion) {
        FrmSeleccionIncidentes seleccionIncidentes = new FrmSeleccionIncidentes(institucion);
        seleccionIncidentes.setVisible(true);
    }

    /**
     * Muestra el formulario para levantar un reporte.
     */
    public void mostrarLevantarReporte() {
        FrmLevantarReporte levantarReporte = new FrmLevantarReporte();
        levantarReporte.setVisible(true);
    }

    /**
     * Muestra la vista para ingresar la dirección asociada a un reporte.
     *
     * @param reporte La información del reporte.
     */
    public void mostrarDireccion(ReporteDTO reporte) {
        FrmDireccion direccion = new FrmDireccion(reporte);
        direccion.setVisible(true);
    }

    /**
     * Muestra el formulario para ingresar un folio.
     */
    public void mostrarFolio() {
        FrmFolio folio = new FrmFolio();
        folio.setVisible(true);
    }

    /**
     * Muestra el formulario para ingresar un código de administrador.
     */
    public void mostrarCodigoAdmin() {
        FrmCodigoAdmin codigoAdmin = new FrmCodigoAdmin();
        codigoAdmin.setVisible(true);
    }

    /**
     * Muestra la vista de instituciones registradas.
     */
    public void mostrarInstitucionesRegistradas() {
        FrmInstitucionesRegistradas institucionesRegistradas = new FrmInstitucionesRegistradas(this);
        institucionesRegistradas.setVisible(true);
    }

    /**
     * Muestra la vista de información de una institución.
     */
    public void mostrarInfoInstitucion() {
        FrmInfoInstitucion infoInstitucion = new FrmInfoInstitucion();
        infoInstitucion.setVisible(true);
    }

    /**
     * Muestra la vista de incidentes asociados a una institución nueva.
     *
     * @param institucionNuevaDTO La información de la institución nueva.
     */
    public void mostrarIncidentes(InstitucionNuevaDTO institucionNuevaDTO) {
        FrmIncidentes incidentes = new FrmIncidentes(institucionNuevaDTO);
        incidentes.setVisible(true);
    }

    /**
     * Muestra la vista de incidentes asociados a una institución registrada.
     *
     * @param institucionRegistradaDTO La información de la institución
     * registrada.
     */
    public void mostrarIncidentes(InstitucionRegistradaDTO institucionRegistradaDTO) {
        FrmIncidentes incidentes = new FrmIncidentes(institucionRegistradaDTO);
        incidentes.setVisible(true);
    }

    /**
     * Muestra la vista para confirmar una acción.
     */
    public void mostrarConfirmado() {
        FrmConfirmado confirmado = new FrmConfirmado();
        confirmado.setVisible(true);
    }

    public void mostrarHistorial() {
        FrmHistorial historial = new FrmHistorial();
        historial.setVisible(true);
    }

}
