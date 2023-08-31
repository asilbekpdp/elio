package org.example.user;

import org.example.base.BaseDAO;
import org.example.base.Datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class UserDAO implements BaseDAO<User, UUID> {
    @Override
    public User findById(UUID uuid) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) throws SQLException {
        String query = """
                INSERT INTO "user"(id, first_name, last_name, middle_name, user_type, phone_number)
                values (?, ?, ?, ?, ?, ?);
                """;
        try (Connection connection = Datasource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setObject(1, user.getId());
            preparedStatement.setObject(2, user.getFirstName());
            preparedStatement.setObject(3, user.getLastname());
            preparedStatement.setObject(4, user.getMiddleName());
            preparedStatement.setObject(5, user.getUserType().name());
            preparedStatement.setObject(6, user.getPhoneNumber());

            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void update(User user, UUID uuid) {

    }

    @Override
    public void delete(UUID uuid) {

    }
}
