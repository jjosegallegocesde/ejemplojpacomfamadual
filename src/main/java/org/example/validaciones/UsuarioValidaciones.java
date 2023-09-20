package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

public class UsuarioValidaciones {

    protected Utilidad expresionRegular= new Utilidad();

    public boolean validarNombres(String nombres) throws Exception{
        String patron="^[a-zA-ZñÑ ]+$";
        if(!this.expresionRegular.validarRegex(nombres,patron)){
            throw new Exception(Mensajes.NOMBRES_SOLO_LETRAS.getMensaje());
        }else if(nombres.length()<10){
            throw new Exception(Mensajes.NOMBRES_MIN_CARACTERES.getMensaje());
        }else if(nombres.length()>25){
            throw new Exception(Mensajes.NOMBRES_MAX_CARACTERES.getMensaje());
        }else if(nombres.length()==0){
            throw new Exception(Mensajes.NOMBRES_VACIO.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarUbicacion(Integer ubicacion)throws Exception{
        String patron="^[1-4]+$";
        if(!this.expresionRegular.validarRegex(ubicacion.toString(),patron)){
            throw new Exception(Mensajes.UBICACION_SOLO_NUMEROS.getMensaje());
        }else{
            return true;
        }
    }

    public boolean validarCorreo(String correo)throws Exception{
        String patron= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(!this.expresionRegular.validarRegex(correo,patron)){
            throw new Exception(Mensajes.CORREO_FORMATO_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }

}
