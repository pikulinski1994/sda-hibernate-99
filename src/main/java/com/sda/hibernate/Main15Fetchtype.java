package com.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.stream.Stream;

//import static jdk.nashorn.internal.objects.NativeSymbol.iterator;

public class Main15Fetchtype {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    }
}

////        School school = session.find(School.class,)
//          Set<Student> students = school.getStudents();
//
//

//        }
//        students.strem() Stream<Student>
//            .map(x -> x.getName)) Stream<String>
//            .forEach(x -> System.out.println(x));
//
//        Transaction.commit();
//        session.close();
//
//



