package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Long> {
    //List<Student> findByDepartment_DepartmentName(String departmentName);
    List<Student> findByDepartment_Faculty_FacultyName(String facultyName);
}
