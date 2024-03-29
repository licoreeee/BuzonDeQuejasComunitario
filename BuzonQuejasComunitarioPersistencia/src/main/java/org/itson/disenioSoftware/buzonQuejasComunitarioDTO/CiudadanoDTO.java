
package org.itson.disenioSoftware.buzonQuejasComunitarioDTO;


public class CiudadanoDTO {

    private String nombre;
    private String apellidom;
    private String apellidop;
    private String curp;
    private String numerotelefono;
    private String correo;

    public CiudadanoDTO() {
    }

    public CiudadanoDTO(
            String nombre, 
            String apellidom, 
            String apellidop, 
            String curp, 
            String numerotelefono, 
            String correo) {
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

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
