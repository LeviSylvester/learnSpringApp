package learnSpringApp.repository;

import learnSpringApp.model.School;
import learnSpringApp.model.Student;

public interface BaseRepository<T> {

    T findById(int id);

    void createEntity(T entity);

    void updateEntity(T entity);

    void deleteEntity(int id);

    default int getId(T entity) {
        return entity.getClass().equals(School.class) ?
                ((School) entity).getId() :
                ((Student) entity).getId();
    }

//    default int getId(T entity) {
//        if (entity.getClass().equals(School.class)) {
//            return ((School) entity).getId();
//        } else if (entity.getClass() == Student.class) {
//            return ((Student) entity).getId();
//        }
//        return 0;
//    }
}
