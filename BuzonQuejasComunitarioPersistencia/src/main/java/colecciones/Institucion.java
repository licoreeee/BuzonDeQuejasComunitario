/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Dell
 */
public class Institucion {
   
    private ObjectId id;
    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;
    private List<String> incidentes;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public List<String> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<String> incidentes) {
        this.incidentes = incidentes;
    }

}

