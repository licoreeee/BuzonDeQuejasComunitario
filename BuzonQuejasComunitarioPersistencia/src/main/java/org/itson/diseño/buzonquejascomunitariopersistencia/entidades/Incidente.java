package org.itson.diseño.buzonquejascomunitariopersistencia.entidades;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class Incidente {

    private String nombreIncidente;

    public Incidente() {
    }

    public Incidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

    public String getNombreIncidente() {
        return nombreIncidente;
    }

    public void setNombreIncidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

}
