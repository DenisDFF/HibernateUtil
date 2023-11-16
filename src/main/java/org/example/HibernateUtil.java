package org.example;

import lombok.Getter;
import org.flywaydb.core.Flyway;
import org.hibernate.PropertyAccessException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private SessionFactory sessionFactory;
    private static final HibernateUtil INSTANCE = new HibernateUtil();

   private HibernateUtil() {
        this.sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
   }

   public static HibernateUtil getInstance() {
       return INSTANCE;
   }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void closeSessionFactory() {
       this.sessionFactory.close();
    }
}