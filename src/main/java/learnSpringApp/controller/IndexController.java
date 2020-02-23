package learnSpringApp.controller;

import learnSpringApp.model.School;
import learnSpringApp.model.Student;
import learnSpringApp.repository.SchoolRepository;
import learnSpringApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;

    @Autowired
    public IndexController(StudentRepository studentRepository, SchoolRepository schoolRepository) {
        this.studentRepository = studentRepository;
        this.schoolRepository = schoolRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        Iterable<School> schools = schoolRepository.findAll();
        model.addAttribute("schools", schools);
        return "index";
    }
}
