package org.example.entidades;

import org.example.utilidades.Utilidad;
import org.example.validaciones.LocalValidaciones;

public class Local {

    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;

    private final Utilidad utilidad = new Utilidad();

    private final LocalValidaciones validaciones= new LocalValidaciones();

    public Local() {
        this.id=this.utilidad.generarId();
    }



    public Local(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Local:{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try{
            this.validaciones.validarNit(nit);
            this.nit=nit;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.validaciones.validarNombre(nombre);
            this.nombre=nombre;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
