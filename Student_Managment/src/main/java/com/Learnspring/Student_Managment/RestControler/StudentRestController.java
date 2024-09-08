package com.Learnspring.Student_Managment.RestControler;

import com.Learnspring.Student_Managment.Service.IStudentService;
import com.Learnspring.Student_Managment.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173/")
public class StudentRestController {

    @Autowired
    private IStudentService service;

    @PostMapping("/Student")
    public Student addStudent(@RequestBody Student student){
        System.out.println("Student data" +student);
        Student st = service.saveStudent(student);
        return student;
    }

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        // invoke logic from service method to get all students record
        List<Student> list = service.getAllStudents();
        return list;
    }

    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
        // invoke logic from service method to get student info by id
        Student st = service.getStudentById(id);
       // return st;
        return ResponseEntity.ok(st);
    }

    @DeleteMapping("/Student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Integer id){
        // invoke logic from service method to delete a student by id
        service.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    /*@PostMapping("/Student/{id}")
    public Student editStudent(@RequestBody Student student){
        System.out.println("Student data" +student);
        Student st = service.updateStudent(student);
        return student;
    }*/

}
