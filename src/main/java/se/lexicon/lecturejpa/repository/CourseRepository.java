package se.lexicon.lecturejpa.repository;

import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.CrudRepository;
import se.lexicon.lecturejpa.entity.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {

    // Finding Courses with a specific Instructor
    @NativeQuery(
            "SELECT * FROM course c JOIN courses_instructors ci ON c.id = ci.course_id join instructor i on i.id = ci.instructor_id where ci.instructor_id = ?"
    )
    List<Course> findCoursesByInstructors_Id(Long instructorId);


}