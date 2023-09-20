package org.example.validaciones;

import org.example.entidades.Local;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.time.LocalDate;

public class OfertaValidaciones {

    protected Utilidad utilidad= new Utilidad();

    public boolean validarNombreEvento(String titulo) throws Exception{
        if(titulo.length()>20){
            throw new Exception(Mensajes.EVENTO_MAX_CARACTERES.getMensaje());
        }else{
            return true;
        }
    }


    public boolean validarFechaFin(LocalDate fechaInicio, LocalDate fechaFin) throws Exception{
        if(fechaFin.isBefore(fechaInicio)){
            throw new Exception(Mensajes.FECHA_MENOR.getMensaje());
        }else{
            return true;
        }
    }

    public LocalDate validarFormatoFecha(String fecha)throws Exception{
        String patron="^(0[1-9]|[1-2][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if(!this.utilidad.validarRegex(fecha,patron)){
            throw new Exception(Mensajes.FECHA_FORMATO.getMensaje());
        }else{
          return this.utilidad.convertirTextoAFecha(fecha);
        }
    }


    public boolean validarCosto(Double costo)throws Exception{
        if(costo<0){
            throw new Exception(Mensajes.EVENTO_MIN_COSTO.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarLocal(Local local, Integer id)throws Exception{
        if(id.equals(local.getId())){
            return true;
        }else{
            throw new Exception(Mensajes.LOCAL_NO_EXISTE.getMensaje());
        }
    }


}
