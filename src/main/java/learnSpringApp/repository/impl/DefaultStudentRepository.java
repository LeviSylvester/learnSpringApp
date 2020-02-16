package learnSpringApp.repository.impl;

import learnSpringApp.model.Student;
import learnSpringApp.repository.StudentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultStudentRepository extends DefaultBaseRepository<Student> implements StudentRepository {
//    public List<Student> studentList = new ArrayList<>();

    public Student findByCnp(String cnp) {
        return entityList.stream()
                .filter((s) -> s.getCnp().equals(cnp))
                .findFirst()
                .orElse(null);
    }

//    public Student findById(int id) {
//        return studentList.stream()
//                .filter((s) -> s.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    public void createEntity(Student entity) {
//        studentList.add(entity);
//    }
//
//    public void updateEntity(Student entity) {
//        studentList.remove(entity);
//        studentList.add(entity);
//    }
//
//    public void deleteEntity(int id) {
//        Student entity = findById(id);
//        studentList.remove(entity);
//    }
}
