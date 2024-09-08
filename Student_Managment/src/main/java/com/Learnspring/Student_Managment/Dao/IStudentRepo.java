package com.Learnspring.Student_Managment.Dao;

import com.Learnspring.Student_Managment.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
