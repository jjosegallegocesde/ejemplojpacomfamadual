package org.example.tablas;

import jakarta.persistence.*;


    @Entity
    public class UsuarioTabla {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "documento")
        private String documento;

        @Column(name = "nombres")
        private String nombres;

        @Column(name = "correo")
        private String correo;

        @Column(name = "ubicacion")
        private Integer ubicacion;


        public UsuarioTabla() {

        }

        public UsuarioTabla(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
            this.id = id;
            this.documento = documento;
            this.nombres = nombres;
            this.correo = correo;
            this.ubicacion = ubicacion;
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

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public Integer getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(Integer ubicacion) {
            this.ubicacion = ubicacion;
        }
    }
