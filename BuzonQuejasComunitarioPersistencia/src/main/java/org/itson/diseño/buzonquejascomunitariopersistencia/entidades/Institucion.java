package org.itson.diseño.buzonquejascomunitariopersistencia.entidades;

import java.util.List;

/**
 *
 * @author castr
 */
public class Institucion {

    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;
    private List<Incidente> incidentes;

    public Institucion() {
    }

    public Institucion(String nombreInstitucion, String funcionInstitucion, String siglas) {
        this.nombreInstitucion = nombreInstitucion;
        this.funcionInstitucion = funcionInstitucion;
        this.siglas = siglas;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getFuncionInstitucion() {
        return funcionInstitucion;
    }

    public void setFuncionInstitucion(String funcionInstitucion) {
        this.funcionInstitucion = funcionInstitucion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
}
