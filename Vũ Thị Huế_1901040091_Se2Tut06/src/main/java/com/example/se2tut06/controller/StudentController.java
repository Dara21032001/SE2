package com.example.se2tut06.controller;

import com.example.se2tut06.entity.Student;
import com.example.se2tut06.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping ("/")
    public List<Student> studentList(){
        return studentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Student findStudentById(
            @PathVariable(value = "id") Long id)
    {
        return studentRepository.findById(id).get();
    }

    @PostMapping("/")
    public Student addStudent(
       @Valid @RequestBody Student student){
      return  studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(
           @PathVariable(value = "id") Long id, @Valid @RequestBody Student student
    ){
        if(studentRepository.existsById(id)){
            student.setId(id);
            studentRepository.save(student);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(
            @PathVariable(value="id") Long id
    ){
        if(studentRepository.existsById(id)){
            Student student = studentRepository.getById(id);
            studentRepository.delete(student);
        }
    }
}
