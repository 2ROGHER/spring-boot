package org.pe.api.rest.repository;

import org.pe.api.rest.models.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByEmail(String email);
}
