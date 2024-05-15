/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion;

import Excepciones.FindException;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import entidades.Reporte;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 *
 * @author Dell
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();
        
        MongoDatabase database = conexion.crearConexion();
        
        MongoCollection<Reporte> collection = database.getCollection("Reportes", Reporte.class);
        
        Calendar calendar = Calendar.getInstance();

        // Establecer hora, minutos y segundos a cero
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // Obtener un objeto Date sin hora, minutos y segundos
        Date dia = calendar.getTime();
        
        try {
        String regexPattern = ".*" + "OOMAPAS" + ".*";
        List<Reporte> reportes = collection.find(Filters.eq("institucion.siglas", "OOMAPAS")).into(new ArrayList<>());
        
        reportes.forEach(reporte -> {
            reporte.setFechaCreacion(dateToCalendarWithoutTime(reporte.getFechaCreacion()).getTime());
            if(reporte.getFechaCreacion().equals(dia)) {
                System.out.println("SON IGUALES");
            }
        });
        
        
        
        
            System.out.println("");
    } catch (MongoException ex) {
            System.out.println(ex.getMessage());
    }
    }
    
    public static Calendar dateToCalendarWithoutTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar;
    }
    
}
