package org.example.entidades;

import jakarta.persistence.*;
import org.example.utilidades.Utilidad;
import org.example.validaciones.UsuarioValidaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Usuario {


    private Integer id;


    private String documento;


    private String nombres;


    private String correo;


    private Integer ubicacion;

    private final UsuarioValidaciones validaciones= new UsuarioValidaciones();


    public Usuario() {

    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Usuario:{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", ubicacion=" + ubicacion +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres)  {
        try{
            this.validaciones.validarNombres(nombres);
            this.nombres=nombres;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo){
        try{
            this.validaciones.validarCorreo(correo);
            this.correo=correo;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try{
            this.validaciones.validarUbicacion(ubicacion);
            this.ubicacion=ubicacion;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }
}
