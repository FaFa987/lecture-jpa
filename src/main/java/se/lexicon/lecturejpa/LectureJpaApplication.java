package se.lexicon.lecturejpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.lexicon.lecturejpa.entity.Student;
import se.lexicon.lecturejpa.repository.AddressRepository;
import se.lexicon.lecturejpa.repository.CourseRepository;
import se.lexicon.lecturejpa.repository.InstructorRepository;
import se.lexicon.lecturejpa.repository.StudentRepository;

@SpringBootApplication
public class LectureJpaApplication {

	public static void main(String[] args) {
		// Before Spring app starts
		System.out.println("Beginning");

		SpringApplication.run(LectureJpaApplication.class, args);

		//Spring app is terminated here
		System.out.println("Ending");

	}

	@Bean
	CommandLineRunner runner(StudentRepository studentRepository, AddressRepository addressRepository, CourseRepository courseRepository, InstructorRepository instructorRepository) {
		return args -> {

			// Will create a student and now with a createdDate value.
//            studentRepository.save(new Student("Simon", "Elbrink", "simon@lexicon.se"));


			// Verifying that predefined method works.
			Student found = studentRepository.findById("1").orElseThrow(() -> new RuntimeException("Student Not Found"));

			// LazyInitializationException is NOT Thrown for Address & Course when fetchType is Eager
			// - It's fetching more data which is good if you need it, otherwise it's a wast of resources.
			// See the picture at: img/Debug - Eager Loading.png
			System.out.println( // Debug this line.
					"""
                            Student name: %s
                            Address-Street: %s
                            """.formatted(found.getFirstName(),found.getAddress().getStreet())
			);


			//Verify repo methods here / In JUnit or in the Repo itself with IntelliJ's Query Console.
			System.out.println(studentRepository.countByActiveTrue());

			studentRepository.findByFirstNameContaining("john").forEach(System.out::println);

		};
	}


}