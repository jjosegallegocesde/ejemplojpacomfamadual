package org.example.utilidades;

public enum Mensajes {

    NOMBRES_SOLO_LETRAS("El nombre debe solo contener letras"),
    NOMBRES_MIN_CARACTERES("El nombre debe contener al menos 10 caracteres"),
    NOMBRES_MAX_CARACTERES("El nombre debe contener menos de 25 caracteres"),
    NOMBRES_VACIO("El nombre no puede estar vacío"),
    UBICACION_SOLO_NUMEROS("La zona solo puede contener un número de 1-4"),
    CORREO_FORMATO_INVALIDO("El correo no tiene un formato válido"),

    NIT_CARACTERES("El NIT debe contener 10 digitos"),

    FECHA_MENOR("La fecha de cierre no puede estar antes de la fecha de inicio del evento"),

    EVENTO_MAX_CARACTERES("El nombre del evento no puede tener tantos caracteres"),

    EVENTO_MIN_COSTO("El costo del evento debe ser mas grande"),

    FECHA_FORMATO("El formato de la fecha debe ser DD/MM/YYYY"),

    LOCAL_NO_EXISTE("La empresa indicada no existe en BD"),

    EMPRESA_MAX_CARACTERES("El Nombre de la empresa no debe sobrepasar los 30 caracteres");

    private final String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}
