package org.example.entidades;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    public void testSetNombresValido() {
        Usuario usuario = new Usuario();
        String nombresValidos = "Juan Perez"; //preparar
        usuario.setNombres(nombresValidos); //actuar
        assertEquals(nombresValidos, usuario.getNombres()); //verificar
    }

    @Test
    public void testSetNombresInvalido() {
        Usuario usuario = new Usuario();
        String nombresInvalidos = "Juan"; // preparar
        usuario.setNombres(nombresInvalidos); //actuar
        assertNull(usuario.getNombres()); //verificar
    }


}