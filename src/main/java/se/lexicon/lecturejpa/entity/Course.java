package se.lexicon.lecturejpa.entity;
import jakarta.persistence.*;
import lombok.*;
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
}