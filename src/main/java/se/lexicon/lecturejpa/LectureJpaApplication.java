package se.lexicon.lecturejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LectureJpaApplication {

	public static void main(String[] args) {
		// Before Spring app starts
		System.out.println("Beginning");

		SpringApplication.run(LectureJpaApplication.class, args);

		//Spring app is terminated here
		System.out.println("Ending");

	}

}