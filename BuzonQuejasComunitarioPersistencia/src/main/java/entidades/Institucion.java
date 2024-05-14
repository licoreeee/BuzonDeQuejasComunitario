/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.bson.types.ObjectId;

/**
 * Clase para representar una entidad de Institución.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class Institucion {

    private ObjectId id;
    private String nombre;
    private String siglas;
    private String descripcionAdicional;
    private String codigoGestion;
    private String nip;

    /**
     * Constructor de la clase Institucion con parámetros.
     *
     * @param id El ID de la institución.
     * @param nombre El nombre de la institución.
     * @param siglas Las siglas de la institución.
     * @param descripcionAdicional La descripción adicional de la institución.
     */
    public Institucion(ObjectId id, String nombre, String siglas, String descripcionAdicional) {
        this.id = id;
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
    }

    /**
     * Constructor vacio.
     */
    public Institucion() {
    }

    /**
     * Obtiene el ID de la institución.
     *
     * @return El ID de la institución.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID de la institución.
     *
     * @param id El ID de la institución a establecer.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la institución.
     *
     * @return El nombre de la institución.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la institución.
     *
     * @param nombre El nombre de la institución a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene las siglas de la institución.
     *
     * @return Las siglas de la institución.
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * Establece las siglas de la institución.
     *
     * @param siglas Las siglas de la institución a establecer.
     */
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    /**
     * Obtiene la descripción adicional de la institución.
     *
     * @return La descripción adicional de la institución.
     */
    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    /**
     * Establece la descripción adicional de la institución.
     *
     * @param descripcionAdicional La descripción adicional de la institución a
     * establecer.
     */
    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    /**
     * Obtiene el código de gestión de la institución.
     *
     * @return El código de gestión de la institución.
     */
    public String getCodigoGestion() {
        return codigoGestion;
    }

    /**
     * Establece el código de gestión de la institución.
     *
     * @param codigoGestion El código de gestión de la institución a establecer.
     */
    public void setCodigoGestion(String codigoGestion) {
        this.codigoGestion = codigoGestion;
    }

    /**
     * Obtiene el NIP de la institución.
     *
     * @return El NIP de la institución.
     */
    public String getNip() {
        return nip;
    }

    /**
     * Establece el NIP de la institución.
     *
     * @param nip El NIP de la institución a establecer.
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Institucion.
     *
     * @return Representación en cadena de texto del objeto Institucion.
     */
    @Override
    public String toString() {
        return "Institucion{" + "id=" + id + ", nombre=" + nombre + ", siglas=" + siglas + ", descripcionAdicional=" + descripcionAdicional + ", codigoGestion=" + codigoGestion + ", nip=" + nip + '}';
    }

}
