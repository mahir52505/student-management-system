package net.javaguides.sms.repository;

import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Search by first name, last name, or email
    @Query("SELECT s FROM Student s WHERE s.firstName LIKE %:keyword% OR s.lastName LIKE %:keyword% OR s.email LIKE %:keyword%")
    List<Student> search(@Param("keyword") String keyword);

    // Find by course
    List<Student> findByCourse(String course);

    // Check if email exists
    boolean existsByEmail(String email);
}