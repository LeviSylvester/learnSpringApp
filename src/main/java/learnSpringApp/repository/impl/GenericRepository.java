//package learnSpringApp.repository.impl;
//
//import learnSpringApp.repository.BaseRepository;
//import learnSpringApp.model.Entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GenericRepository<T extends Entity> implements BaseRepository<T> {
//    protected List<T> entityList = new ArrayList<>();
//
//    public T findById(int id) {
//        return entityList.stream()
//                .filter((s) -> s.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    public void createEntity(T entity) {
//        entityList.add(entity);
//    }
//
//    public void updateEntity(T entity) {
//        entityList.remove(entity);
//        entityList.add(entity);
//    }
//
//    public void deleteEntity(int id) {
//        T entity = findById(id);
//        entityList.remove(entity);
//    }
//}
