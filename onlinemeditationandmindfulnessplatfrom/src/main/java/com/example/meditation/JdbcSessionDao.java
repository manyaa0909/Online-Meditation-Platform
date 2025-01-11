package com.example.meditation;

import java.sql.*;

// JdbcSessionDao class implementing the SessionDao interface
public class JdbcSessionDao implements SessionDao {

    // Establishing a connection to the meditation database
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/meditation_platform_db";
        String user = "root"; // Change to your database username
        String password = "root"; // Change to your database password
        return DriverManager.getConnection(url, user, password);
    }

    // Method to save a meditation session
    @Override
    public void saveSession(MeditationSession session) {
        String sql = "INSERT INTO meditation_sessions (user_id, session_type, duration) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            System.out.println("Saving session for user ID: " + session.getUserId());
            
            statement.setShort(1, session.getUserId());
            statement.setString(2, ((Object) session).getSessionType());
            statement.setDouble(3, session.getDuration());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Meditation session recorded successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Error saving meditation session.");
            e.printStackTrace();
        }
    }
}
