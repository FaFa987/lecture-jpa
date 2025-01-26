package se.lexicon.lecturejpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

// https://projectlombok.org/features/
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@ToString

// https://thorben-janssen.com/key-jpa-hibernate-annotations/
//@Entity(name = "students")
@Entity
public class Student {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // For Number Sequence
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false,length = 100)
    private String firstName;

    @Column(nullable = false,length = 100)
    private String lastName;

    @NonNull
    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "is_active")
    private boolean active;

    @ToString.Exclude
//    @Column(columnDefinition = "DEFAULT NOW()")
    @CreatedDate // https://docs.spring.io/spring-data/jpa/reference/auditing.html
    private LocalDateTime createDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)   // Bi-Directional Relationship
    @JoinColumn(name= "address_id")
    private Address address;

    @ToString.Exclude
    //One Student can be part of many courses.
    @OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER) // Bi-directional
    private Set<Course> courses = new HashSet<>();

    public Student(String firstName, String lastName, @NonNull String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = true;
        this.createDate = LocalDateTime.now();
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