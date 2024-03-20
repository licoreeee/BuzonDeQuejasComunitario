package org.itson.disenioSoftware.buzonQuejasComunitarioAdministrarAcceso;

import org.itson.disenioSoftware.buzonQuejasComunitarioDTO.DomicilioDTO;

public class FacadeRegistrarDomicilio implements IFacadeRegistrarDomicilio {

    // Dependencia de DomicilioDTO inyectada desde fuera
    private DomicilioDTO domicilio;

    // Constructor para inyección de dependencias
    public FacadeRegistrarDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public DomicilioDTO registrarDomicilio() throws IllegalArgumentException {
      
        }
        return domicilio;
    }
}
