package org.example.base;

import java.sql.SQLException;
import java.util.List;

public interface BaseDAO<ENTITY, ID> {
    ENTITY findById(ID id);

    List<ENTITY> findAll();

    void save(ENTITY entity) throws SQLException;

    void update(ENTITY entity, ID id);

    void delete(ID id);
}
