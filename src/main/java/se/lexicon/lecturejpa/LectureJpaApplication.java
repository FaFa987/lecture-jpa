package se.lexicon.lecturejpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.lexicon.lecturejpa.entity.Address;
import se.lexicon.lecturejpa.entity.Course;
import se.lexicon.lecturejpa.entity.Student;
import se.lexicon.lecturejpa.repository.AddressRepository;
import se.lexicon.lecturejpa.repository.CourseRepository;
import se.lexicon.lecturejpa.repository.StudentRepository;

import java.util.Set;

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
	CommandLineRunner runner(StudentRepository studentRepository, AddressRepository addressRepository , CourseRepository courseRepository) {
		return args -> {

			Address address = new Address("someStreet", "someCity" , "123456"); // ID:0
			// address = addressRepository.save(address);

			// 🎶
			Student student = new Student("John", "Doe" , "john@doe.com");
			student.setAddress(address);

			// System.out.println(student);
			// System.out.println(address);

			studentRepository.save(student);

			Course course = new Course("Java Course");
			course = courseRepository.save(course);

			student.setCourse(Set.of(course));
			course.setStudent(student);

			System.out.println(student);
		};
	}

}