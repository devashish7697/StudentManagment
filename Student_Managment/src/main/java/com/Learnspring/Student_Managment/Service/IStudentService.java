package com.Learnspring.Student_Managment.Service;

import com.Learnspring.Student_Managment.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    //public Student editStudent(Student student, Integer id);
}
