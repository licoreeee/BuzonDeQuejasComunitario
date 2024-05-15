package dto;

import java.util.List;

/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class InstitucionDTO {

    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;

    public InstitucionDTO() {
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


}
