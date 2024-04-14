
package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.InstitucionDTO;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Institucion;


public interface IInstitucionBO {
     public InstitucionDTO transporteDatos(InstitucionDTO institucionSeleccionada);
     public Institucion conversorDatos(InstitucionDTO institucionSeleccionada);
     
}
