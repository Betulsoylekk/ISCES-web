package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentID(Long departmentID);
}
