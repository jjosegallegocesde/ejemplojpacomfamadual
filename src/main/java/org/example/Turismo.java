package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.controlador.UsuarioControlador;
import org.example.entidades.Usuario;

public class Turismo {



    public static void main(String[] args) {

        UsuarioControlador usuarioControlador= new UsuarioControlador();
        usuarioControlador.registrarUsuario("123456789","juan jose gallego","juan@gmail.com",4);




    }
}