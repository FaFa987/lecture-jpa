package se.lexicon.lecturejpa.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.lecturejpa.entity.Student;

import java.util.List;

// https://spring.io/projects/spring-data-jpa
// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {


    long countByActiveTrue();


    //Find Students with 9876 as zipcode(in Address)
    List<Student> findByAddress_ZipCode(String zipcode);


    List<Student> findByFirstName(String firstName);

    @Query("select s from Student s where upper(s.firstName) like upper(concat('%', :name, '%')) or upper(s.lastName) like upper(concat('%', :name, '%'))")
    List<Student> findByFirstNameContaining(String name);

    //Send in StudentId update the status to true / false
    @Modifying
    @Query("UPDATE Student s set s.active = true where s.id = :studentId")
    void updateStudentByActiveTrue(String studentId);

    @Modifying
    @Query("UPDATE Student s set s.active = false where s.id = :studentId")
    void updateStudentByActiveFalse(String studentId);


}