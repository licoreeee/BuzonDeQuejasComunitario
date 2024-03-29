
package org.itson.disenioSoftware.buzonQuejasComunitarioDominio;


public class Ciudadano {
    private String nombre;
    private String apellidom;
    private String apellidop;
    private String curp;
    private int numerotelefono;
    private String correo;

    public Ciudadano() {
    }

    public Ciudadano(String nombre, String apellidom, String apellidop, String curp, int numerotelefono, String correo) {
        this.nombre = nombre;
        this.apellidom = apellidom;
        this.apellidop = apellidop;
        this.curp = curp;
        this.numerotelefono = numerotelefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(int numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "nombre=" + nombre + ", apellidom=" + apellidom + ", apellidop=" + apellidop + ", curp=" + curp + ", numerotelefono=" + numerotelefono + ", correo=" + correo + '}';
    }
    
}
