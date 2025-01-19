package se.lexicon.lecturejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//import se.lexicon.lecturejpa.entity.Student;
import se.lexicon.lecturejpa.entity.Student;
import se.lexicon.lecturejpa.repository.StudentRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired // Injecting Repo
    public MyCommandLineRunner(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        //Main as you know it 😎

        studentRepository.save(new Student("Simon", "Elbrink","simon@lexicon.se"));

    }
}