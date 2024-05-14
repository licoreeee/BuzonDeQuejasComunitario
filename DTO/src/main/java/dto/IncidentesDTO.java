/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 * Clase para representar un objeto DTO de Incidentes.
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidentesDTO {

    private String id;
    private String informacion;
    private InstitucionNuevaDTO institucionNuevaDTO;
    private InstitucionRegistradaDTO institucionRegistradaDTO;

    /*
    * Constructor vacio.
     */
    public IncidentesDTO() {
    }

    /*
    * Constructor con solamente la informacion del incidente.
     */
    public IncidentesDTO(String informacion) {
        this.informacion = informacion;
    }

    /*
    * Constructor asignado para el caso de utilizar una institucionNuevaDTO.
     */
    public IncidentesDTO(String informacion, InstitucionNuevaDTO institucionNuevaDTO) {
        this.informacion = informacion;
        this.institucionNuevaDTO = institucionNuevaDTO;
    }

    /*
    * Constructor asignado para el caso de utilizar una institucionRegistradaDTO.
     */
    public IncidentesDTO(String informacion, InstitucionRegistradaDTO institucionRegistradaDTO) {
        this.informacion = informacion;
        this.institucionRegistradaDTO = institucionRegistradaDTO;
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
     * Obtiene el DTO de la institución nueva asociada al incidente.
     *
     * @return El DTO de la institución nueva.
     */
    public InstitucionNuevaDTO getInstitucionNuevaDTO() {
        return institucionNuevaDTO;
    }

    /**
     * Establece el DTO de la institución nueva asociada al incidente.
     *
     * @param institucionNuevaDTO El DTO de la institución nueva a establecer.
     */
    public void setInstitucionNuevaDTO(InstitucionNuevaDTO institucionNuevaDTO) {
        this.institucionNuevaDTO = institucionNuevaDTO;
    }

    /**
     * Obtiene el DTO de la institución registrada asociada al incidente.
     *
     * @return El DTO de la institución registrada.
     */
    public InstitucionRegistradaDTO getInstitucionRegistradaDTO() {
        return institucionRegistradaDTO;
    }

    /**
     * Establece el DTO de la institución registrada asociada al incidente.
     *
     * @param institucionRegistradaDTO El DTO de la institución registrada a
     * establecer.
     */
    public void setInstitucionRegistradaDTO(InstitucionRegistradaDTO institucionRegistradaDTO) {
        this.institucionRegistradaDTO = institucionRegistradaDTO;
    }

    /**
     * Obtiene el ID del incidente.
     *
     * @return El ID del incidente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del incidente.
     *
     * @param id El ID del incidente a establecer.
     */
    public void setId(String id) {
        this.id = id;
    }

}
