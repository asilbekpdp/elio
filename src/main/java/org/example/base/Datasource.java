package org.example.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {
    private static final String url = "jdbc:postgresql://localhost:5432/elio";
    private static final String username = "123";
    private static final String password = "123";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, username, password);
    }
}
