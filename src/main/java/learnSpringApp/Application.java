package learnSpringApp;

import learnSpringApp.config.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private SchoolManager schoolManager;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.register(ApplicationConfiguration.class);
//        applicationContext.refresh();
//
//        SchoolManager schoolManager = (SchoolManager) applicationContext.getBean("schoolManager");
        schoolManager.saveData();
        System.out.println("\nSpring boot works here as well!");
    }
}
