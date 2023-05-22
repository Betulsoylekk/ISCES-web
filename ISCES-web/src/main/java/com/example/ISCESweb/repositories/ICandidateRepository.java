package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICandidateRepository extends JpaRepository<Candidate, Long> {

    Candidate findByCandidateIDAndStatus(Long candidateID, Boolean status);
    List<Candidate> findByElectionIDAndStatusAndStudent_Department_DepartmentID(Long electionID, Boolean status, Long departmentID);

}
