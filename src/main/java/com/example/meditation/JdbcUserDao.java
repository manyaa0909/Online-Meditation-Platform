package com.example.meditation;

import java.sql.*;

// JdbcUserDao class implementing the UserDao interface
public class JdbcUserDao implements UserDao {

    // Method to establish database connection
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/meditation_platform_db";
        String user = "root"; // Change to your database username
        String password = "root"; // Change to your database password
        return DriverManager.getConnection(url, user, password);
    }

    // Method to save a new user
    @Override
    public void saveUser(User user) {
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            System.out.println("Saving user: " + user.getUsername());
            
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Error saving user.");
            e.printStackTrace();
        }
    }

    // Method to retrieve a user by username
    @Override
    public User getUserByUsername(String username) {
        User user = null;
        String sql = "SELECT * FROM users WHERE username = ?";
        
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching user by username.");
            e.printStackTrace();
        }
        
        return user;
    }
}
