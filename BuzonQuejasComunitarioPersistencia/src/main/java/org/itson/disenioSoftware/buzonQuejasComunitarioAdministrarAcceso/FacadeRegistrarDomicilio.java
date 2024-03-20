
package org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso;

import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.DomicilioDTO;


public class FacadeRegistrarDomicilio implements IFacadeRegistrarDomicilio{

  // Dependencia de DomicilioDTO inyectada desde fuera
    private DomicilioDTO domicilio;

    // Constructor para inyección de dependencias
    public FacadeRegistrarDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public DomicilioDTO registrarDomicilio() throws IllegalArgumentException {
        if (domicilio == null || domicilio.getCalle() == null || domicilio.getColonia() == null
                || domicilio.getNumeroCasa() == null || domicilio.getCodigoPostal() == null) {
            throw new IllegalArgumentException("Los datos del domicilio son inválidos");
        }
        return domicilio;
    }
}
