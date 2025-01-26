package se.lexicon.lecturejpa.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor

@Entity(name = "students")
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // For Number Sequence
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false,length = 100)
    private String firstName;
    @Column(nullable = false,length = 100)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;

    private boolean active;

    @ToString.Exclude
    //    @Column(columnDefinition = "DEFAULT NOW()")
    private LocalDateTime createDate;

    @OneToOne(cascade = CascadeType.ALL) // Bi-Directional Relationship
    @JoinColumn(name= "address_id")
    private Address address;

    //One Student can be part of many courses.
    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST) // Bi-directional
    private Set<Course> courses = new HashSet<>();

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //Convenience Methods
    public void addCourse(Course course) {
        courses.add(course);
        course.setStudent(this);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
        course.setStudent(null);
    }

}
