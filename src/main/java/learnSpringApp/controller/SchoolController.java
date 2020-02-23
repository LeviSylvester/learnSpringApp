package learnSpringApp.controller;

import learnSpringApp.model.School;
import learnSpringApp.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import learnSpringApp.repository.StudentRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/school")
public class SchoolController {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @GetMapping("/add/")
    public String getAddSchoolView(Model model) {
        model.addAttribute("school", new School());
        return "addSchool.html";
    }

    @PostMapping("/add/")
    public String processAddSchoolView(@Valid School school, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addSchool";
        }
        schoolRepository.save(school);
        return "redirect:/";
    }

    @GetMapping("edit/{id}/")
    public String showEditSchoolView(@PathVariable Long id, Model model) {
        Optional<School> school = schoolRepository.findById(id);
        model.addAttribute("school", school);
        if (!school.isPresent()) {
            return "redirect:/";
        }

        model.addAttribute("school", school.get());
        return "editSchool";
    }

    @PostMapping("/edit/")
    public String processEditSchoolView(@Valid School school, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editSchool";
        }
        schoolRepository.save(school);
        return "redirect:/";
    }

//    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)

    @GetMapping("/delete/{id}/")
    public String processDeleteSchool(@PathVariable Long id) {
        schoolRepository.deleteById(id);
        return "redirect:/";
    }
}
