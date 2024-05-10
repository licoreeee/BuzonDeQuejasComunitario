/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author hisam
 */
public class Incidentes {
    
    private ObjectId id;
    private String informacion;
    private ObjectId institucionId;

    public Incidentes(ObjectId id, String informacion, ObjectId institucionId) {
        this.id = id;
        this.informacion = informacion;
        this.institucionId = institucionId;
    }

    public Incidentes(String informacion, ObjectId institucionId) {
        this.informacion = informacion;
        this.institucionId = institucionId;
    }
    
    public Incidentes() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public ObjectId getInstitucionId() {
        return institucionId;
    }

    public void setInstitucionId(ObjectId institucionId) {
        this.institucionId = institucionId;
    }

    @Override
    public String toString() {
        return "Incidentes{" + "id=" + id + ", informacion=" + informacion + ", institucionId=" + institucionId + '}';
    }
    
}
