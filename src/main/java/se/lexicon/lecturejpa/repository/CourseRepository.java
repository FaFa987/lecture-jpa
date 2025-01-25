package se.lexicon.lecturejpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.lecturejpa.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
