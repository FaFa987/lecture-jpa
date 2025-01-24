package se.lexicon.lecturejpa.entity;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
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

    @OneToOne // Bi-Directional Relationship
    private Student student;


    public Address(@NonNull String street, @NonNull String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }


}