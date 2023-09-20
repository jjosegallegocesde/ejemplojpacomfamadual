package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

public class LocalValidaciones {

    protected Utilidad expresionRegular= new Utilidad();

    public boolean validarNit(String nit) throws Exception{

        if(nit.length()!=10){
            throw new Exception(Mensajes.NIT_CARACTERES.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarNombre(String nombre)throws Exception{
        if(nombre.length()>30){
            throw new Exception(Mensajes.EMPRESA_MAX_CARACTERES.getMensaje());
        }else{
            return true;
        }

    }

}
