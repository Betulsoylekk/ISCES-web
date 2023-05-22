package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Votes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVotesRepository extends JpaRepository<Votes, Long> {
    Boolean existsByStudentNumberAndElectionID(Long studentNumber, Long ElectionID);
}
