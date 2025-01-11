package com.example.meditation;

public interface UserDao {
    void saveUser(User user);

    User getUserByUsername(String username);
}
