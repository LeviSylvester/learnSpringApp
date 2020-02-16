package learnSpringApp.repository.impl;

import learnSpringApp.repository.BaseRepository;

import java.util.ArrayList;
import java.util.List;


public abstract class DefaultBaseRepository <T> implements BaseRepository <T> {
    protected List<T> entityList = new ArrayList<>();

    public T findById(int id) {
        return entityList.stream()
                .filter((s) -> getId(s) == id)
                .findFirst()
                .orElse(null);
    }

    public void createEntity(T entity) {
        entityList.add(entity);
    }

    public void updateEntity(T entity) {
        entityList.remove(entity);
        entityList.add(entity);
    }

    public void deleteEntity(int id) {
        T entity = findById(id);
        entityList.remove(entity);
    }
}
