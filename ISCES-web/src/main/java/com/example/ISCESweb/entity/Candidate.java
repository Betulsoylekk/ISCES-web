package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidate")
public class Candidate {

    @Id
    @GeneratedValue
    @Column(name="candidate_id")
    private Long candidateID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_number")
    private Student student;

    @OneToOne
    @JoinColumn(name="folder_id")
    private Folder folder;

    @Column(name="election_id")
    private Long electionID;
    @Column(name="created_date")
    private Date createdDate;
    @Column(name="updated_date")
    private Date updatedDate;
    @Column(name="status")
    private Boolean status;
    @Column(name="votes")
    @Value("0")
    private Long votes;
}
