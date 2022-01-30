package com.sda.hibernate;

import antlr.debug.TraceAdapter;
import com.sda.hibernate.entity.Husband;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main11RemoveCascade {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Husband husband = session.find(Husband.class, 3L);
        if (husband != null) {
            session.remove(husband);

        }

        transaction.commit();
        session.close();

    }
}
