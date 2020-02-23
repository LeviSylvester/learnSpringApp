package learnSpringApp.controller;

import learnSpringApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import learnSpringApp.repository.StudentRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/add/")
    public String getAddStudentView(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @PostMapping("/add/")
    public String processAddStudentView(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addStudent";
        }
        studentRepository.save(student);
        return "redirect:/";
    }

    @GetMapping("edit/{id}/")
    public String showEditStudentView(@PathVariable Long id, Model model) {
        Optional<Student> student = studentRepository.findById(id);
        model.addAttribute("student", student);
        if (!student.isPresent()) {
            return "redirect:/";
        }

        model.addAttribute("student", student.get());
        return "editStudent";
    }

    @PostMapping("/edit/")
    public String processEditStudentView(@Valid Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editStudent";
        }
        studentRepository.save(student);
        return "redirect:/";
    }

//    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)

    @GetMapping("/delete/{id}/")
    public String processDeleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "redirect:/";
    }
}
