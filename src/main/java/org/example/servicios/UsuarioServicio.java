package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.Usuario;
import org.example.tablas.UsuarioTabla;

public class UsuarioServicio {


    public void registrarUsuarioBD(Usuario usuario){

        // Nombre de la unidad de persistencia configurada en persistence.xml
        String persistenceUnitName = "conexionbd";

        // Crear la EntityManagerFactory
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory(persistenceUnitName);

            // Crear un EntityManager
            em = emf.createEntityManager();

            // Crear una entidad y guardarla en la base de datos
            UsuarioTabla persona = new UsuarioTabla();
            persona.setNombres(usuario.getNombres());
            persona.setCorreo(usuario.getCorreo());

            // Iniciar una transacción
            em.getTransaction().begin();

            // Persistir la entidad en la base de datos
            em.persist(persona);

            // Confirmar la transacción
            em.getTransaction().commit();

            // Si llegas aquí sin lanzar una excepción, la operación se ha realizado correctamente.
            System.out.println("Persona guardada en la base de datos.");
        }catch (Exception e) {
            // Captura y maneja cualquier excepción que ocurra
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            // Asegúrate de cerrar el EntityManager y la EntityManagerFactory en el bloque "finally"
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }


    }

}
