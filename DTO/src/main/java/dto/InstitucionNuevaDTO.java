package dto;

/**
 * Clase para representar un objeto DTO de Institución Nueva.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionNuevaDTO {

    private String id;
    private String nombre;
    private String siglas;
    private String descripcionAdicional;
    private String codigoGestion;
    private String nip;

    /**
     * Constructor vacio.
     */
    public InstitucionNuevaDTO() {
    }

    /**
     * Constructor de la clase InstitucionNuevaDTO con nombre y descripción
     * adicional.
     *
     * @param nombre El nombre de la institución nueva.
     * @param descripcionAdicional La descripción adicional de la institución
     * nueva.
     */
    public InstitucionNuevaDTO(String nombre, String descripcionAdicional) {
        this.nombre = nombre;
        this.descripcionAdicional = descripcionAdicional;
    }

    /**
     * Constructor de la clase InstitucionNuevaDTO con nombre, siglas y
     * descripción adicional.
     *
     * @param nombre El nombre de la institución nueva.
     * @param siglas Las siglas de la institución nueva.
     * @param descripcionAdicional La descripción adicional de la institución
     * nueva.
     */
    public InstitucionNuevaDTO(String nombre, String siglas, String descripcionAdicional) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
    }

    /**
     * Obtiene el ID de la institución nueva.
     *
     * @return El ID de la institución nueva.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID de la institución nueva.
     *
     * @param id El ID de la institución nueva a establecer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la institución nueva.
     *
     * @return El nombre de la institución nueva.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la institución nueva.
     *
     * @param nombre El nombre de la institución nueva a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene las siglas de la institución nueva.
     *
     * @return Las siglas de la institución nueva.
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * Establece las siglas de la institución nueva.
     *
     * @param siglas Las siglas de la institución nueva a establecer.
     */
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    /**
     * Obtiene la descripción adicional de la institución nueva.
     *
     * @return La descripción adicional de la institución nueva.
     */
    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    /**
     * Establece la descripción adicional de la institución nueva.
     *
     * @param descripcionAdicional La descripción adicional de la institución
     * nueva a establecer.
     */
    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    /**
     * Obtiene el código de gestión de la institución nueva.
     *
     * @return El código de gestión de la institución nueva.
     */
    public String getCodigoGestion() {
        return codigoGestion;
    }

    /**
     * Establece el código de gestión de la institución nueva.
     *
     * @param codigoGestion El código de gestión de la institución nueva a
     * establecer.
     */
    public void setCodigoGestion(String codigoGestion) {
        this.codigoGestion = codigoGestion;
    }

    /**
     * Obtiene el NIP de la institución nueva.
     *
     * @return El NIP de la institución nueva.
     */
    public String getNip() {
        return nip;
    }

    /**
     * Establece el NIP de la institución nueva.
     *
     * @param nip El NIP de la institución nueva a establecer.
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto
     * InstitucionNuevaDTO.
     *
     * @return Representación en cadena de texto del objeto InstitucionNuevaDTO.
     */
    @Override
    public String toString() {
        return "InstitucionNuevaDTO{" + "nombre=" + nombre + ", siglas=" + siglas + ", descripcionAdicional=" + descripcionAdicional + ", codigoGestion=" + codigoGestion + ", nip=" + nip + '}';
    }

}
