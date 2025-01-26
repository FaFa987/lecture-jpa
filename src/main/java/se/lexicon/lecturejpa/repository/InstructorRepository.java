package se.lexicon.lecturejpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.lecturejpa.entity.Instructor;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}