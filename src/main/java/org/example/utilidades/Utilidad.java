package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public boolean validarRegex(String texto, String patronREGEX) {
        Pattern patron=Pattern.compile(patronREGEX);
        Matcher coincidencia=patron.matcher(texto);
        return coincidencia.matches();
    }

    public Integer generarId(){
        Random random = new Random();
        return random.nextInt(500) + 1;
    }

    public LocalDate convertirTextoAFecha(String fechaString){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(fechaString,formateador);
    }

}
