package com.bashiryousufy.studentmanagement.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(
                new Student(UUID.randomUUID(), "Bashir","Yousufy", "bashir123@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Jone","Cena", "Jones123@gmail.com", Student.Gender.FEMALE)
        );
    }
}
