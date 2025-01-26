package se.lexicon.lecturejpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Collection of courses to help out with.
    @ManyToMany(mappedBy = "instructors", fetch = FetchType.LAZY) //bi-directional
    private Set<Course> courses = new HashSet<>();

    // helper methods if needed?
}