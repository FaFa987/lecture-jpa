package se.lexicon.lecturejpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@Getter
@Setter

@Entity
public class Course {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String CourseName;
//    private String CourseCode;
//    private Character grade;

    @ManyToOne //Bi-Directional Relationship
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToMany // Bi-directional
    @JoinTable(
            name = "course_instructor",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "instructor_id")
    )
    private Set<Instructor> instructors = new HashSet<>();


    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        instructor.getCourses().add(this);
    }

    public void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);
        instructor.getCourses().remove(this);
    }


}