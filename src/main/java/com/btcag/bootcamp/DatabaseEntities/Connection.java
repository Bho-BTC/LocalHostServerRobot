package com.btcag.bootcamp.DatabaseEntities;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.InputStream;

public class Connection {
    private static SessionFactory sessionFactory;

    static {
        try (InputStream is = Connection.class.getClassLoader().getResourceAsStream("hibernate.cfg.xml")) {
            if (is == null) {
                System.out.println("hibernate.cfg.xml not found in the classpath!");
            } else {
                System.out.println("hibernate.cfg.xml loaded successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

// Proceed with Hibernate configuration
        try {
            sessionFactory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Robot.class)
                    .buildSessionFactory();

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