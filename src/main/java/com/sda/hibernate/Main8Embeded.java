package com.sda.hibernate;

import com.sda.hibernate.entity.Adress;
import com.sda.hibernate.entity.Form;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.access.CachedDomainDataAccess;

public class Main8Embeded {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Form form = new Form();
        session.persist(form);

        form.setDescription("Lore ipsum");

        Adress adress = new Adress("Aleja Grunwaldzka" , "Gdańsk");
        form.setAdress(adress);

        adress.setStreet("Fryderyka Chopina");

        transaction.commit();
        session.close();
    }

}
