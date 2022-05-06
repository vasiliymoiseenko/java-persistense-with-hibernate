package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InheritanceHibernate {

  public static void main(String[] args) {
    try (SessionFactory sessionFactory = new Configuration()
        .configure("hibernate.cfg.xml")
        .buildSessionFactory()) {

      //Credit card
      Session session = sessionFactory.getCurrentSession();
      session.getTransaction().begin();

      CreditCard creditCard = new CreditCard();
      creditCard.setOwner("CreditOwner");
      creditCard.setCardNumber("123456789");
      creditCard.setExpMouth("10");
      creditCard.setExpYear("1988");

      session.persist(creditCard);

      session.getTransaction().commit();

      //Bank Accaunt
      session = sessionFactory.getCurrentSession();
      session.getTransaction().begin();

      BankAccaunt bankAccaunt = new BankAccaunt();
      bankAccaunt.setOwner("BankOwner");
      bankAccaunt.setAccount("Vasiliy");
      bankAccaunt.setBankname("Sber");
      bankAccaunt.setSwift("QwErTy");

      session.persist(bankAccaunt);

      session.getTransaction().commit();

      session.close();
    }
  }
}
