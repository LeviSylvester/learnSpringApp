package learnSpringApp.repository;

import learnSpringApp.model.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends BaseRepository<School> {

    List<School> findByName(String name);
}
