//package org.itson.diseño.buzonquejascomunitarionegocio;
//
//import dto.DomicilioDTO;
//import org.itson.diseño.buzonquejascomunitariopersistencia.entidades.Domicilio;
//
///**
// * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
// */
//public interface IDomicilioBO {
//
//    /**
//     * Transporta los datos de un objeto DomicilioDTO a través de otro objeto
//     * DomicilioDTO. Crea un nuevo objeto DomicilioDTO con los mismos atributos
//     * que el domicilioReporte pasado como parámetro. Luego, llama al método
//     * convertirDatos para realizar la conversión.
//     *
//     * @param domicilioReporte El objeto DomicilioDTO del cual se transportarán
//     * los datos.
//     */
//    public void transporteDatos(DomicilioDTO domicilioReporte);
//
//    /**
//     * Convierte un objeto DomicilioDTO en un objeto Domicilio. Crea un nuevo
//     * objeto Domicilio con los mismos atributos que el domicilioDTO pasado como
//     * parámetro.
//     *
//     * @param domicilioDTO El objeto DomicilioDTO que se convertirá en un objeto
//     * Domicilio.
//     * @return El objeto Domicilio resultante de la conversión.
//     */
//    public Domicilio convertirDatos(DomicilioDTO domicilioDTO);
//}
