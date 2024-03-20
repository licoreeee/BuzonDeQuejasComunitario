
package org.itson.disenioSoftware.buzonQuejasComunitarioDTO;


public class IncidenteDTO {
    private String nombreIncidente;
    private String descripcion;
   

    public IncidenteDTO() {
    }

    public IncidenteDTO(String nombreIncidente, String descripcion) {
        this.nombreIncidente = nombreIncidente;
        this.descripcion = descripcion;
    }

    public String getNombreIncidente() {
        return nombreIncidente;
    }

    public void setNombreIncidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

  
    
    
}
