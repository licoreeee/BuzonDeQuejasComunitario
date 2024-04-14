
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.IncidenteDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Incidente;


public class IncidenteBO {
    public IncidenteDTO transporteDatos(IncidenteDTO incidenteSeleccionado){
        IncidenteDTO incidenteDTO = new IncidenteDTO(
                incidenteSeleccionado.getNombreIncidente());
         convertirDatos(incidenteDTO);
        return incidenteDTO;
    }
    public Incidente convertirDatos(IncidenteDTO incidenteDTO){
        Incidente incidente = new Incidente(
        incidenteDTO.getNombreIncidente());
        return incidente;      
    }
}
