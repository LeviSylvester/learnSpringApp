package learnSpringApp.repository;

import learnSpringApp.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends BaseRepository<Student> {

    Student findByCnp(String cnp);
}
