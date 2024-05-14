/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 * Clase para representar un objeto DTO de Institución Registrada.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionRegistradaDTO {

    private String id;
    private String nombre;
    private String siglas;
    private String descripcionAdicional;
    private String codigoGestion;
    private String nip;

    /**
     * Constructor vacio.
     */
    public InstitucionRegistradaDTO() {
    }

    /**
     * Constructor de la clase InstitucionRegistradaDTO con nombre y siglas.
     *
     * @param nombre El nombre de la institución registrada.
     * @param siglas Las siglas de la institución registrada.
     */
    public InstitucionRegistradaDTO(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    /**
     * Constructor de la clase InstitucionRegistradaDTO con ID.
     *
     * @param id El ID de la institución registrada.
     */
    public InstitucionRegistradaDTO(String id) {
        this.id = id;
    }

    /**
     * Constructor de la clase InstitucionRegistradaDTO con todos los atributos.
     *
     * @param id El ID de la institución registrada.
     * @param nombre El nombre de la institución registrada.
     * @param siglas Las siglas de la institución registrada.
     * @param descripcionAdicional La descripción adicional de la institución
     * registrada.
     * @param codigoGestion El código de gestión de la institución registrada.
     * @param nip El NIP de la institución registrada.
     */
    public InstitucionRegistradaDTO(String id, String nombre, String siglas, String descripcionAdicional, String codigoGestion, String nip) {
        this.id = id;
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
        this.codigoGestion = codigoGestion;
        this.nip = nip;
    }

    /**
     * Constructor de la clase InstitucionRegistradaDTO sin ID.
     *
     * @param nombre El nombre de la institución registrada.
     * @param siglas Las siglas de la institución registrada.
     * @param descripcionAdicional La descripción adicional de la institución
     * registrada.
     * @param codigoGestion El código de gestión de la institución registrada.
     * @param nip El NIP de la institución registrada.
     */
    public InstitucionRegistradaDTO(String nombre, String siglas, String descripcionAdicional, String codigoGestion, String nip) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
        this.codigoGestion = codigoGestion;
        this.nip = nip;
    }

    /**
     * Obtiene el ID de la institución registrada.
     *
     * @return El ID de la institución registrada.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID de la institución registrada.
     *
     * @param id El ID de la institución registrada a establecer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la institución registrada.
     *
     * @return El nombre de la institución registrada.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la institución registrada.
     *
     * @param nombre El nombre de la institución registrada a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene las siglas de la institución registrada.
     *
     * @return Las siglas de la institución registrada.
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * Establece las siglas de la institución registrada.
     *
     * @param siglas Las siglas de la institución registrada a establecer.
     */
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    /**
     * Obtiene la descripción adicional de la institución registrada.
     *
     * @return La descripción adicional de la institución registrada.
     */
    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    /**
     * Establece la descripción adicional de la institución registrada.
     *
     * @param descripcionAdicional La descripción adicional de la institución
     * registrada a establecer.
     */
    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    /**
     * Obtiene el código de gestión de la institución registrada.
     *
     * @return El código de gestión de la institución registrada.
     */
    public String getCodigoGestion() {
        return codigoGestion;
    }

    /**
     * Establece el código de gestión de la institución registrada.
     *
     * @param codigoGestion El código de gestión de la institución registrada a
     * establecer.
     */
    public void setCodigoGestion(String codigoGestion) {
        this.codigoGestion = codigoGestion;
    }

    /**
     * Obtiene el NIP de la institución registrada.
     *
     * @return El NIP de la institución registrada.
     */
    public String getNip() {
        return nip;
    }

    /**
     * Establece el NIP de la institución registrada.
     *
     * @param nip El NIP de la institución registrada a establecer.
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto
     * InstitucionRegistradaDTO.
     *
     * @return Representación en cadena de texto del objeto
     * InstitucionRegistradaDTO.
     */
    @Override
    public String toString() {
        return "InstitucionRegistradaDTO{" + "id=" + id + ", nombre=" + nombre + ", siglas=" + siglas + ", descripcionAdicional=" + descripcionAdicional + ", codigoGestion=" + codigoGestion + ", nip=" + nip + '}';
    }

}
