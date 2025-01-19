package se.lexicon.lecturejpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.lecturejpa.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

}
