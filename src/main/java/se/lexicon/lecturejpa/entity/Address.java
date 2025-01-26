package se.lexicon.lecturejpa.entity;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode

@Entity()
public class Address {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private String street;

    @NonNull
    private String city;

    @Column(nullable = false, length = 6)
    private String zipCode;

    @ToString.Exclude
    @OneToOne(mappedBy = "address") // Bi-Directional Relationship
    private Student student;


    public Address(@NonNull String street, @NonNull String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NonNull String getStreet() {
        return street;
    }

    public void setStreet(@NonNull String street) {
        this.street = street;
    }

    public @NonNull String getCity() {
        return city;
    }

    public void setCity(@NonNull String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}