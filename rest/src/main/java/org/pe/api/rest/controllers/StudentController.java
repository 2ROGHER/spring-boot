package org.pe.api.rest.controllers;

import org.pe.api.rest.models.student.Student;
import org.pe.api.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/api/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/api/students/get-students-by-email")
    public List<Student> getByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @PostMapping("/api/students")
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

}
