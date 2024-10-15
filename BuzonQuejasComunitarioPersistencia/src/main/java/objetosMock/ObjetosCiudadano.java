package objetosMock;

import java.util.ArrayList;
import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Ciudadano;

/**
 *
 * @author Dell
 */
public class ObjetosCiudadano {

    ArrayList<Ciudadano> ciudadanos = new ArrayList<>();

    public void agregarLista() {
        ciudadanos.add(new Ciudadano("Hisamy", "Cinco", "Cota", "HCC384723932", "6871939800", "hisamycincoc@gmail.com"));
        ciudadanos.add(new Ciudadano("Gael Rafael", "Castro", "Molina", "GRCM38472349", "644438204", "gaelrcastrom@gmail.com"));
        ciudadanos.add(new Ciudadano("Victoria", "Vega", "Bernal", "VVB347329432", "6871741035", "victoriavegab@gmail.com"));
    }

    public ArrayList<Ciudadano> obtenerLista(String tipo) {
        return ciudadanos;
    }

}
