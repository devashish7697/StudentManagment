package com.Learnspring.Student_Managment.Service;

import com.Learnspring.Student_Managment.Dao.IStudentRepo;
import com.Learnspring.Student_Managment.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepo repo;

    @Override
    public Student saveStudent(Student student) {
        // invoke logic to save data to database
        repo.save(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        // invoke logic to retrieve the students record from DB

        return repo.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        // invoke logic to retrieve the specific students record from DB by using id
        Optional<Student> opt = repo.findById(id);
        return opt.get();
    }

    @Override
    public void deleteStudentById(Integer id) {
        repo.deleteById(id);
    }

}
