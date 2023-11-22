package org.example;

import org.flywaydb.core.Flyway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class FlywayMigration {
    private static Connection connector;

    public Connection getConnector() {
        return connector;
    }
    public void Migration () {
        try {
            String dbUrl = "jdbc:h2:~/test";
            String username = "sa";
            String password = "";
            connector = DriverManager.getConnection(dbUrl, username, password);
            flywayMigration(dbUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void flywayMigration(String url, String username, String password) {
        Flyway flyway = Flyway.configure().dataSource(url, username, password).load();
        flyway.migrate();
    }
}
