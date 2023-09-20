package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionesTest {

    @Test
    public void testValidarNombresSoloLetras() {
        UsuarioValidaciones validaciones = new UsuarioValidaciones();
        String nombresValidos = "Juan Perez";
        String nombresInvalidos = "123";

        assertDoesNotThrow(() -> validaciones.validarNombres(nombresValidos));
        assertThrows(Exception.class, () -> validaciones.validarNombres(nombresInvalidos));

    }

    @Test
    public void testValidarNombresMuyCortos() {
        UsuarioValidaciones validaciones = new UsuarioValidaciones();
        String nombresValidos = "Juan Perez";
        String nombresInvalidos = "Juan";

        assertDoesNotThrow(() -> validaciones.validarNombres(nombresValidos));
        assertThrows(Exception.class, () -> validaciones.validarNombres(nombresInvalidos));

    }

}