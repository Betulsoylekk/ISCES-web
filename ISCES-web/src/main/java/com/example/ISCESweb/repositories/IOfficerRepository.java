package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Officer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOfficerRepository extends JpaRepository<Officer, Long> {
}
