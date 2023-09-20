package org.example.entidades;


import org.example.utilidades.Utilidad;
import org.example.validaciones.OfertaValidaciones;

import java.time.LocalDate;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Local local=new Local();

    private final Utilidad utilidad = new Utilidad();

    private final OfertaValidaciones validaciones= new OfertaValidaciones();

    public Oferta() {

        this.id=this.utilidad.generarId();

    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Local local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.local = local;
    }

    @Override
    public String toString() {
        return "Oferta: {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoPersona=" + costoPersona +
                ", local=" + local +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try{
            this.validaciones.validarNombreEvento(titulo);
            this.titulo=titulo;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try{
            this.fechaInicio=this.validaciones.validarFormatoFecha(fechaInicio);
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try{
            LocalDate finFecha=this.validaciones.validarFormatoFecha(fechaFin);
            this.validaciones.validarFechaFin(this.fechaInicio,finFecha);
            this.fechaFin=finFecha;

        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try{
            this.validaciones.validarCosto(costoPersona);
            this.costoPersona=costoPersona;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local, Integer id) {
        try{
            this.validaciones.validarLocal(local,id);
            this.local=local;
        }catch(Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }


    }
}
