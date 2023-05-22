package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IElectionRepository extends JpaRepository<Election, Long> {
    Election findByStatus(Boolean status);
}
