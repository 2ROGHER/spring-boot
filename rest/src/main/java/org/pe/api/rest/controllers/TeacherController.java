package org.pe.api.rest.controllers;

import org.pe.api.rest.models.teacher.Teacher;
import org.pe.api.rest.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/api/teachers/sayhello")
    public String sayHelloTeachers() {
        return "hola";
    }

    @GetMapping("/api/teachers")
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }


}
