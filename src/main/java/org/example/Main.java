package org.example;

import org.example.user.User;
import org.example.user.UserDAO;
import org.example.user.UserType;

import java.sql.SQLException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Entity
        // JPA  - Repository
        // JDBC - DAO (data access object)
        // Service
        // CRUD
        System.out.println("Hello world!");

        User user = new User(UUID.randomUUID(), "Asilbek", "123", "123", UserType.ADMIN, "123");
        UserDAO userDAO = new UserDAO();
        userDAO.save(user);
    }
}