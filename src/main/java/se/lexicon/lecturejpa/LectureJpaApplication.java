package se.lexicon.lecturejpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.lexicon.lecturejpa.entity.Address;
import se.lexicon.lecturejpa.entity.Student;
import se.lexicon.lecturejpa.repository.AddressRepository;
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
	CommandLineRunner runner(StudentRepository studentRepository, AddressRepository addressRepository) {
		return args -> {

			Address address = new Address("someStreet", "someCity" , "123456"); // ID:0
			// address = addressRepository.save(address);

			// 🎶
			Student student = new Student("John", "Doe" , "john@doe.com");
			student.setAddress(address);

			// System.out.println(student);
			// System.out.println(address);

			studentRepository.save(student);
		};
	}

}