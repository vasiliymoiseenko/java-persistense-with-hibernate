package helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloWorldHibernate {

  public static void main(String[] args) {
    try (SessionFactory sessionFactory = new Configuration()
        .configure("hibernate.cfg.xml")
        .buildSessionFactory()) {

      Session session = sessionFactory.getCurrentSession();

      //Write
      session.getTransaction().begin();

      Message message = new Message(null, "Hello");
      //message.setText("Hello World!");

      session.persist(message);

      session.getTransaction().commit();

      //Read and rewrite
      session = sessionFactory.getCurrentSession();
      session.getTransaction().begin();

      message = session.createQuery("select m from Message m where m.id = 1", Message.class).getSingleResult();
      //message.setText("Take me to your leader!");

      session.getTransaction().commit();
    }
  }
}
