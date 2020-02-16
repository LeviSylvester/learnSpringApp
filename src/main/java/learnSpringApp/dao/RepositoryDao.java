//package learnSpringApp.dao;
//
//import learnSpringApp.repository.BaseRepository;
//
//import java.util.List;
//
//public abstract class RepositoryDao<T> implements BaseRepository<T> {
//    List<T> entityList;
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
