package org.example;

import org.flywaydb.core.Flyway;


import org.hibernate.Session;
import org.hibernate.Transaction;


import java.sql.*;
import java.util.List;


public class Main {

    private static Connection connector;

    public static Connection getConnector() {
        return connector;
    }

    public static void main(String[] args) throws SQLException {
        FlywayMigration flywayMigration = new FlywayMigration();
        flywayMigration.Migration();

       Session session = HibernateUtil.getInstance().getSessionFactory().openSession();

       Transaction transaction = session.beginTransaction();
        Client newClient = new Client();
        newClient.setName("Taras");
        session.persist(newClient);
        transaction.commit();

       session.close();
    }
}