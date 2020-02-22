package learnSpringApp.controller;

import learnSpringApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import learnSpringApp.repository.StudentRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/add/")
    public String getAddStudentView(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent.html";
    }

    @PostMapping("/add/")
    public String processAddStudentView(Student student) {
        studentRepository.save(student);
        return "redirect:/";
    }


//    @GetMapping()
//
//    @PostMapping("/adduser")
//    public String addUser(@Valid User user, BindingResult result, Model model){
//        if(result.hasErrors()){
//            return "user-add";
//        }
//
//        userRepository.save(user);
//
//    }
//
//    @GetMapping("edit/{id}")
//    public String showUpdateForm(@PathVariable long id, Model model) {
//        if(result.hasErrors()){
//            user.setId(id);
//            return "user-edit";
//        }
//
//        userRepository.save(user);
//        model.addAttribute("users", userRepository.findAll());
//    }
//
//    @PostMapping()
}
