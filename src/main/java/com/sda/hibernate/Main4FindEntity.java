package com.sda.hibernate;

import com.sda.hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main4FindEntity {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog dogOne = session.find(Dog.class, 1L);
        if (dogOne !=null) {
            System.out.println(dogOne.getId());
            System.out.println(dogOne.getName());

        }
        Dog dogTwo = session.get(Dog.class,2L);
        if (dogTwo != null) {
            System.out.println(dogTwo.getId());
            System.out.println(dogTwo.getName());


        }
        Dog dogThree = session.load(Dog.class, 300L ); // brak krotki o takim ID
        if (dogThree !=null) {
            System.out.println(dogThree.getId());
            System.out.println(dogThree.getName());

        }



        transaction.commit();
        session.close();




    }
}
