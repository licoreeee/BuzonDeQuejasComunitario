/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subsistemahistorialreportes;

import org.itson.diseño.buzonquejascomunitarionegocio.IReporteBO;
import org.itson.diseño.buzonquejascomunitarionegocio.ReporteBO;

/**
 *
 * @author Dell
 */
public class HistorialReportes {
    
    private IReporteBO reporteBO;

    public HistorialReportes(IReporteBO reporteBO) {
        reporteBO = new ReporteBO();
    }
    
    
    
}
