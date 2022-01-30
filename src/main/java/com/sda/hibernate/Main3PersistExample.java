package com.sda.hibernate;

import com.sda.hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main3PersistExample {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog dog = new Dog("Puszek", "Husky", 10); // Transient

        System.out.println("id:" + dog.getId()); // null
        session.persist(dog); // Insert + dodanie do kontekstu persystentcji hibernate (zapmamietaj stan dog)
        System.out.println("id: " + dog.getId()); // id

        dog.setAge(11);

        session.evict(dog); // usuniecie dog z kontekstu persystencji hibernate

        dog.setRace("Chihuahaha");

        transaction.commit();
        session.close();





    }
}
