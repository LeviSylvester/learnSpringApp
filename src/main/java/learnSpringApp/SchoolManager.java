package learnSpringApp;

import learnSpringApp.model.School;
import learnSpringApp.model.Student;
import learnSpringApp.repository.SchoolRepository;
import learnSpringApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolManager {

    //@Qualifier("fileSchoolRepository"); //daca avem mai multe
    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    public SchoolManager(SchoolRepository schoolRepository, StudentRepository studentRepository) {
//        this.schoolRepository = schoolRepository;
//        this.studentRepository = studentRepository;
//    }

    public void saveData() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setCnp("1840228260017");
        student1.setName("Vasile Pop");

        Student student2 = new Student();
        student1.setId(2);
        student1.setCnp("2840228260018");
        student1.setName("Ioana Popa");

        School school1 = new School();
        school1.setId(1);
        school1.setAddress("Str. Mihail Kogalniceanu");
        school1.setName("Liceul Bathory");

        School school2 = new School();
        school1.setId(2);
        school1.setAddress("Str. Mihail Kogalniceanu");
        school1.setName("Emil Racovita");

        schoolRepository.createEntity(school1);
        schoolRepository.createEntity(school2);
        studentRepository.createEntity(student1);
        studentRepository.createEntity(student2);
    }

}
