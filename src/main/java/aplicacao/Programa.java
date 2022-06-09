package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {



        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p3 = new Pessoa(null,"William Gomes","william@gmail.com");
        em.getTransaction().begin();
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println("===================Pronto======================");
        em.close();
        emf.close();





    }
}
