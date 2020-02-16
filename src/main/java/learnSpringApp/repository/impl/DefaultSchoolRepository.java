package learnSpringApp.repository.impl;

import learnSpringApp.model.School;
import learnSpringApp.repository.SchoolRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DefaultSchoolRepository extends DefaultBaseRepository<School> implements SchoolRepository {

    public List<School> findByName(String name) {
        return entityList.stream()
                .filter((s) -> s.getName().equals(name))
                .collect(Collectors.toList());
    }

}
