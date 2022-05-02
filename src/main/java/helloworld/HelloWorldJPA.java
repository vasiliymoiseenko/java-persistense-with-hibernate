package helloworld;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HelloWorldJPA {


  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");

    EntityManager em = emf.createEntityManager();

    //write
    em.getTransaction().begin();

    Message message = new Message();
    message.setText("Hello World!");

    em.persist(message);

    em.getTransaction().commit();

    //Read and rewrite
    em.getTransaction().begin();

    message = em.createQuery("select m from Message m where m.id = 1", Message.class).getSingleResult();
    message.setText("Take me to your leader!");

    em.getTransaction().commit();

    em.close();
  }
}
