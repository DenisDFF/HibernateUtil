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

        Client client = new Client();
        client.setName("John Doe");

        Planet planet = new Planet();
        planet.setId("1");
        planet.setName("Earth");

        ClientDao clientDao = new ClientDao();
        PlanetDao planetDao = new PlanetDao();

        clientDao.save(client);
        planetDao.save(planet);
    }
}