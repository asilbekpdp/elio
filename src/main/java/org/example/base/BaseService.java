package org.example.base;

import java.util.List;
import java.util.UUID;

public interface BaseService<ENTITY, ID> {
    void create(ENTITY entity);

    ENTITY get(ID id);

    List<ENTITY> get();

    void update(ENTITY entity, ID id);

    void delete(ID id);
}
