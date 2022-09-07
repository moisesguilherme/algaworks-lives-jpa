package com.algaworks.cadastrocliente;

import com.algaworks.cadastrocliente.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Buscando um registro.
        //Cliente cliente = entityManager.find(Cliente.class, 1);
        //System.out.println(cliente.getNome());

        // Iserir (precisa olhar se tem autoincremento no id)
        //Cliente cliente = new Cliente();
        // cliente.setId(2); // tirar esse
        //cliente.setNome("Eletro Silva");

        //entityManager.getTransaction().begin();
        //entityManager.persist(cliente);
        //entityManager.getTransaction().commit();

        // Remover
        //Cliente cliente = entityManager.find(Cliente.class, 2);
        //entityManager.getTransaction().begin();
        //entityManager.remove(cliente);
        //entityManager.getTransaction().commit();

        // Find no segundo não vai buscar pois já está na memória
        //Cliente cliente = entityManager.find(Cliente.class, 2);
        //Cliente cliente2 = entityManager.find(Cliente.class, 2);

        // Alterado
        // Cliente cliente = entityManager.find(Cliente.class, 1);
        // entityManager.getTransaction().begin();
        // cliente.setNome(cliente.getNome() + " Alterado");
        //entityManager.getTransaction().commit();

        // Objeto não gerenciado
        //Cliente cliente = new Cliente();
        //cliente.setId(1);
        //cliente.setNome("Armazém Estrela");

        //entityManager.getTransaction().begin();
        //entityManager.merge(cliente);
        //entityManager.getTransaction().commit();


        // Insert com merge
        Cliente cliente = new Cliente();
        cliente.setNome("Construtura Medeiros");

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();


        //entityManager.clear(); // Limpa a memória
        entityManager.close();
        entityManagerFactory.close();
    }
}
