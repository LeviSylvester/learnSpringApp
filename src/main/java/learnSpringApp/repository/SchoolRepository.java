package learnSpringApp.repository;

import learnSpringApp.model.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> /*extends BaseRepository<School>*/ {

    List<School> findByName(String name);
    List<School> findAllByAddressAndName(String address, String name);
}
