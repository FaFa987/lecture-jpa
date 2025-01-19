package se.lexicon.lecturejpa.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
// https://thorben-janssen.com/key-jpa-hibernate-annotations/
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
    @Column(name = "is_active")
    private boolean active;
    //    @Column(columnDefinition = "DEFAULT NOW()")
    private LocalDateTime createDate;

    @OneToOne
    private Address address;

    protected Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = true;
        this.createDate = LocalDateTime.now();
    }

    public Student(String id, String firstName, String lastName, String email, boolean active, LocalDateTime createDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", createDate=" + createDate +
                '}';
    }
}