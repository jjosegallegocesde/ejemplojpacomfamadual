package org.example.controlador;

import org.example.entidades.Usuario;
import org.example.servicios.UsuarioServicio;
import org.example.tablas.UsuarioTabla;

import java.util.Scanner;

public class UsuarioControlador {

    public UsuarioControlador() {
    }

    Usuario usuario = new Usuario();
    UsuarioServicio usuarioServicio= new UsuarioServicio();

    public void registrarUsuario(String documento, String nombres, String correo, Integer ubicacion ) {


            usuario.setNombres(nombres);
            usuario.setDocumento(documento);
            usuario.setCorreo(correo);
            usuario.setUbicacion(ubicacion);


        if (usuario.getNombres()!=null && usuario.getCorreo()!=null && usuario.getUbicacion()!=null) {
            // Todos los sets se realizaron con éxito, podemos llamar al método para registrar el usuario en la base de datos
            usuarioServicio.registrarUsuarioBD(usuario);
            System.out.println("Los valores se establecieron con éxito en el objeto Usuario y se registraron en la base de datos.");
        } else {
            System.out.println("No se pudieron establecer todos los valores con éxito, no se registró el usuario en la base de datos.");
        }



    }

}
