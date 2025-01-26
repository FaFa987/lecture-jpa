package se.lexicon.lecturejpa.entity;

import jakarta.persistence.*;
import lombok.*;


// https://projectlombok.org/features/

//@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
@EqualsAndHashCode()

@Entity
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

    @NonNull
    @Column(nullable = false, length = 6)
    private String zipCode;

    @ToString.Exclude //Recursive otherwise
    @OneToOne(mappedBy = "address") // Bi-Directional Relationship
    private Student student;




}