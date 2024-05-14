/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.bson.types.ObjectId;

/**
 * Clase para representar una entidad de Incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class Incidentes {

    private ObjectId id;
    private String informacion;
    private ObjectId institucionId;

    /**
     * Constructor de la clase Incidentes con todos los parámetros.
     *
     * @param id El ID del incidente.
     * @param informacion La información del incidente.
     * @param institucionId El ID de la institución asociada al incidente.
     */
    public Incidentes(ObjectId id, String informacion, ObjectId institucionId) {
        this.id = id;
        this.informacion = informacion;
        this.institucionId = institucionId;
    }

    /**
     * Constructor de la clase Incidentes con parámetros de información e ID de
     * la institución.
     *
     * @param informacion La información del incidente.
     * @param institucionId El ID de la institución asociada al incidente.
     */
    public Incidentes(String informacion, ObjectId institucionId) {
        this.informacion = informacion;
        this.institucionId = institucionId;
    }

    /**
     * Constructor vacio.
     */
    public Incidentes() {
    }

    /**
     * Obtiene el ID del incidente.
     *
     * @return El ID del incidente.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del incidente.
     *
     * @param id El ID del incidente a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene la información del incidente.
     *
     * @return La información del incidente.
     */
    public String getInformacion() {
        return informacion;
    }

    /**
     * Establece la información del incidente.
     *
     * @param informacion La información del incidente a establecer.
     */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    /**
     * Obtiene el ID de la institución asociada al incidente.
     *
     * @return El ID de la institución asociada al incidente.
     */
    public ObjectId getInstitucionId() {
        return institucionId;
    }

    /**
     * Establece el ID de la institución asociada al incidente.
     *
     * @param institucionId El ID de la institución asociada al incidente a
     * establecer.
     */
    public void setInstitucionId(ObjectId institucionId) {
        this.institucionId = institucionId;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Incidentes.
     *
     * @return Representación en cadena de texto del objeto Incidentes.
     */
    @Override
    public String toString() {
        return "Incidentes{" + "id=" + id + ", informacion=" + informacion + ", institucionId=" + institucionId + '}';
    }

}
