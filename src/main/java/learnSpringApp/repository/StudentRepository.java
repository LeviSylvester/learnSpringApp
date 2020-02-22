package learnSpringApp.repository;

import learnSpringApp.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> /*extends BaseRepository<Student>*/ {

    Student findByCnp(String cnp);
    List<Student> findByLastName(String name);
    Student findByLastNameAndCnp(String name, String cnp);

}
