package com.btcag.bootcamp.DatabaseEntities;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure()  // Ensure this file exists and is correct
                    .addAnnotatedClass(Robot.class)  // Make sure Robot class is annotated with @Entity
                    .buildSessionFactory();
            System.out.println("Verbunden!");

        } catch (HibernateException ex) {
            System.out.println("Fehler: " + ex.getMessage());
        }
    }


    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static void closeSession(Session session) {
        session.close();
    }

    public static void shutdown() {
        sessionFactory.close();
    }
}