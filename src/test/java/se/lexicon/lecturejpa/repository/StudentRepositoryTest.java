package se.lexicon.lecturejpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.lecturejpa.model.Student;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testPersistStudent() {
        //Arrange
        Student student = new Student("Simon", "Elbrink","simon@lexicon.se");

        //Act
        Student stored = studentRepository.save(student);

        //Assert
        assertNotNull(stored);
        assertNotNull(stored.getId());


    }
}