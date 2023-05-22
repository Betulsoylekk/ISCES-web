package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Candidate;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CandidateRepository{

    private final ICandidateRepository candidateRepository;

    @Autowired
    public CandidateRepository(ICandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Long getCandidateVote(Long candidateID){
        return candidateRepository.findByCandidateIDAndStatus(candidateID, Boolean.TRUE).getVotes();
    }

    public List<Candidate> getCandidatesByDepartment(Long electionID, Long departmentID){
        return candidateRepository.findByElectionIDAndStatusAndStudent_Department_DepartmentID(electionID, Boolean.TRUE, departmentID);
    }

    @Transactional
    public void saveCandidate(Candidate candidate){
        candidateRepository.save(candidate);
    }

}
