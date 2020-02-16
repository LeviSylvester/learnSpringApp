package learnSpringApp.repository;

import learnSpringApp.model.Entity;

public interface BaseRepository<T extends Entity> {

    T findById(int id);

    void createEntity(T entity);

    void updateEntity(T entity);

    void deleteEntity(int id);
}
