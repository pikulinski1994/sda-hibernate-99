package com.sda.hibernate;

import com.sda.hibernate.entity.Wife;
import com.sda.hibernate.entity.Husband;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main10OnetoOne {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Husband Husband = new Husband("Adam");
        session.persist(Husband);

        Wife wife = new Wife("Ewa");
        session.persist(wife);

        wife.setHusband(Husband);

        session.persist(new Husband("Damian", new Wife("Sabrina")));
        session.persist(new Husband("Bartek", new Wife("Kinga")));
        session.persist(new Husband("Rafał", new Wife("Natalia")));
        session.persist(new Husband("Munedk", new Wife("Joanna")));
        session.persist(new Husband("Piotr", new Wife("Katarzyna")));

        transaction.commit();
        session.close();

    }
}
