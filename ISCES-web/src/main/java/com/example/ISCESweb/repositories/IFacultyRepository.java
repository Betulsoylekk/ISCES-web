package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacultyRepository extends  JpaRepository<Faculty, Long> {
}
