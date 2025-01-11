package com.example.meditation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MeditationDatabaseConnectionTest {
    public static void main(String[] args) {
        // Database URL and credentials
        String url = "jdbc:mysql://localhost:3306/meditation_platform_db";
        String user = "root"; // Change to your database username
        String password = "root"; // Change to your database password

        // Establish connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connected to the Meditation & Mindfulness Platform Database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
