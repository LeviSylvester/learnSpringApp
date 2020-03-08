package learnSpringApp.controller;

import learnSpringApp.model.School;
import learnSpringApp.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/school")
public class SchoolRestController {

    @Autowired
    final SchoolRepository schoolRepository;

    public SchoolRestController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @GetMapping("/")
    public String getAllSchools() {
        return schoolRepository.findAll().toString();
    }

    @PostMapping("/")
    public ResponseEntity<School> createNewSchool(@RequestParam String name, @RequestParam String address) {
        School school = new School();
        school.setName(name);
        school.setAddress(address);
        schoolRepository.save(school);
//        return ResponseEntity.status(404).body("Nu exista");
//        return ResponseEntity.status(200).body(school);
        return ResponseEntity.ok(school);
    }
}
