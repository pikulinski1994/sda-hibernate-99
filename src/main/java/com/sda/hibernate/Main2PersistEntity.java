package com.sda.hibernate;

import com.sda.hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2PersistEntity {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(new Dog("Ares" , "Bulldog" , 10));
        session.persist(new Dog("Guti" , "Jamnik" , 12));
        session.persist(new Dog("Peres" , "Doberman" , 8));
        session.persist(new Dog("Rufik" , "Wilczur" , 9));
        session.persist(new Dog("Loui" , "Huskey" , 7));

        transaction.commit();
        session.close();
    }

}
