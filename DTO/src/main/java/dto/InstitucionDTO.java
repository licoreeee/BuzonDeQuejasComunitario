package dto;

/**
 *
 * @author Dell
 */
public class InstitucionDTO {
 
    private String nombreInstitucion;
    private String funcionInstitucion;
    private String siglas;

    public InstitucionDTO() {
    }

    public InstitucionDTO(String nombreInstitucion, String funcionInstitucion, String siglas) {
        this.nombreInstitucion = nombreInstitucion;
        this.funcionInstitucion = funcionInstitucion;
        this.siglas = siglas;
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
