/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseño.levantarreportess;

import dto.ReporteDTO;

/**
 *
 * @author castr
 */
public interface IFacadeLevantarReporte {

    public void seleccionarInstitucion();

    public void seleccionarIncidente();

    public void descripcionReporte();

    public void ingresarDireccion();

    public ReporteDTO levantarReporte();
}
