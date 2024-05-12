/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class IncidentesDTO {
    
    private String id;
    private String informacion;
    private InstitucionNuevaDTO institucionNuevaDTO;
    private InstitucionRegistradaDTO institucionRegistradaDTO;

    public IncidentesDTO() {
    }

    public IncidentesDTO(String informacion, InstitucionNuevaDTO institucionNuevaDTO) {
        this.informacion = informacion;
        this.institucionNuevaDTO = institucionNuevaDTO;
    }

    public IncidentesDTO(String informacion, InstitucionRegistradaDTO institucionRegistradaDTO) {
        this.informacion = informacion;
        this.institucionRegistradaDTO = institucionRegistradaDTO;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public InstitucionNuevaDTO getInstitucionNuevaDTO() {
        return institucionNuevaDTO;
    }

    public void setInstitucionNuevaDTO(InstitucionNuevaDTO institucionNuevaDTO) {
        this.institucionNuevaDTO = institucionNuevaDTO;
    }

    public InstitucionRegistradaDTO getInstitucionRegistradaDTO() {
        return institucionRegistradaDTO;
    }

    public void setInstitucionRegistradaDTO(InstitucionRegistradaDTO institucionRegistradaDTO) {
        this.institucionRegistradaDTO = institucionRegistradaDTO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
