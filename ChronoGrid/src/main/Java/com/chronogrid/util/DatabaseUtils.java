package com.chronogrid.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtils {
    private static final String PROPERTIES_FILE = "/db.properties";
    private static Properties properties = new Properties();

    static {
        try (InputStream inputStream = DatabaseUtils.class.getResourceAsStream(PROPERTIES_FILE)) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new RuntimeException("Could not find " + PROPERTIES_FILE);
            }

            // Load the MySQL JDBC driver
            Class.forName(properties.getProperty("jdbc.driver"));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error initializing database connection: " + e.getMessage(), e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                properties.getProperty("jdbc.url"),
                properties.getProperty("jdbc.username"),
                properties.getProperty("jdbc.password")
        );
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing database connection: " + e.getMessage());
            }
        }
    }
}