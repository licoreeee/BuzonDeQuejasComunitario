package org.itson.diseño.buzonquejascomunitarionegocio;

import dto.ReporteDTO;
import entidades.Reporte;
import excepciones.NegociosException;
import org.bson.types.Binary;
import org.bson.types.ObjectId;


/**
 * @author Hisamy Cota, Gael Castro, Victoria Vega, Michelle Medina
 */
public class ReporteBO implements IReporteBO{

    @Override
    public Reporte convertirDatosDTO(ReporteDTO reporteDTO) {
        if(reporteDTO.getPhoto() == null){
            Reporte reporte = new Reporte(reporteDTO.getFolio(),
                                      reporteDTO.getTitulo(),
                                      reporteDTO.getDescripcion(),
                                      reporteDTO.getFechaCreacion());
        }
        reporte.setPhoto(new Binary(reporteDTO.getPhoto()));
        return reporte;
    }

    @Override
    public ReporteDTO convertirDatosEntity(Reporte reporte) throws NegociosException {
        byte[] photo = null;
        if (reporte.getPhoto() != null) {
            photo = reporte.getPhoto().getData();
        }

        ReporteDTO reporteDTO = new ReporteDTO(reporte.getId().toString(), reporte.getFolio(), reporte.getTitulo(),
                reporte.getDescripcion(), reporte.getFechaCreacion(), photo);
        return reporteDTO;
    }


    @Override
    public boolean validarFormatoDTO(ReporteDTO reporteDTO) throws NegociosException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
