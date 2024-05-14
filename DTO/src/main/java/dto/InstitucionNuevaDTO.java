package dto;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionNuevaDTO {

    private String id;
    private String nombre;
    private String siglas;
    private String descripcionAdicional;
    private String codigoGestion;
    private String nip;

    public InstitucionNuevaDTO() {
    }

    public InstitucionNuevaDTO(String nombre, String descripcionAdicional) {
        this.nombre = nombre;
        this.descripcionAdicional = descripcionAdicional;
    }

    public InstitucionNuevaDTO(String nombre, String siglas, String descripcionAdicional) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.descripcionAdicional = descripcionAdicional;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    public String getCodigoGestion() {
        return codigoGestion;
    }

    public void setCodigoGestion(String codigoGestion) {
        this.codigoGestion = codigoGestion;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "InstitucionNuevaDTO{" + "nombre=" + nombre + ", siglas=" + siglas + ", descripcionAdicional=" + descripcionAdicional + ", codigoGestion=" + codigoGestion + ", nip=" + nip + '}';
    }

}
