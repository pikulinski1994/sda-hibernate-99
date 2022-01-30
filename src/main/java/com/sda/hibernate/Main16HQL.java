package com.sda.hibernate;

import com.sda.hibernate.entity.Husband;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main16HQL {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query<Husband> queryOne = session.createQuery("From Husband");
        List<Husband> resultone = queryOne.getResultList();
        resultone.stream()
                .map(x -> x.getName())
                .forEach(x -> System.out.println(x));


        Query<String> querytwo = session.createQuery("SELECT h.name FROM Husband AS h ");
        List<String> resultTwo = querytwo.getResultList();
        resultTwo.forEach(x -> System.out.println(x));

        System.out.println("----------------");


//        String name = session.createQuery("SELECT h FROM Husband AS h WHERE h.id ", Husband.class)
//                .setParameter("id", 4L)
//                .getSingleResult();
//                .getName();
//
//        System.out.println(name);


        transaction.commit();
        session.close();
    }
}

