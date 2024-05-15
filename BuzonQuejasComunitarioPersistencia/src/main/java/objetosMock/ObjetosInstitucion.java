package objetosMock;

import java.util.ArrayList;
import java.util.List;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Incidente;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Institucion;

/**
 *
 * @author Dell
 */
public class ObjetosInstitucion {

    List<Incidente> incidentesOOMAPAS = new ArrayList<>();
    List<Incidente> incidentesCFE = new ArrayList<>();
    List<Incidente> incidentesCruzRoja = new ArrayList<>();

    public void agregarIncidentesOOMAPAS() {
        incidentesOOMAPAS.add(new Incidente("Fuga de aguas negras."));
        incidentesOOMAPAS.add(new Incidente("No suministro de agua."));
        incidentesOOMAPAS.add(new Incidente("Baja presión de agua."));
    }

    public void agregarIncidentesCFE() {
        incidentesCFE.add(new Incidente("No hay luz."));
        incidentesCFE.add(new Incidente("Se cayó un poste de luz."));
        incidentesCFE.add(new Incidente("Explotó un poste de luz."));
    }

    List<Institucion> instituciones = new ArrayList<>();

    public void agregarInstituciones() {
        Institucion oomapas = new Institucion("Organismo Operador Municipal de Agua Potable, Alcantarillado y Saneamiento", "Se encarga del agua y el alcantarillado.", "OOMAPAS");
        Institucion cfe = new Institucion("Comisión Federal de Electricidad", "Se encarga de la electricidad y postes de luz de la ciudad.", "CFE");

        agregarIncidentesOOMAPAS();
        oomapas.setIncidentes(incidentesOOMAPAS);

        agregarIncidentesCFE();
        cfe.setIncidentes(incidentesCFE);

        instituciones.add(oomapas);
        instituciones.add(cfe);
    }

    public List<Institucion> getInstituciones() {
        return instituciones;
    }

}
