//package learnSpringApp.repository.impl;
//
//import learnSpringApp.model.Student;
//import learnSpringApp.repository.StudentRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class DefaultStudentRepository extends GenericRepository<Student> implements StudentRepository {
//
//    public Student findByCnp(String cnp) {
//        return entityList.stream()
//                .filter((s) -> s.getCnp().equals(cnp))
//                .findFirst()
//                .orElse(null);
//    }
//}
