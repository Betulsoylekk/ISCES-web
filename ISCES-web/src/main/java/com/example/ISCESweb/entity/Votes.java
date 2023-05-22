package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="vote")
public class Votes {
    @Id
    @GeneratedValue
    @Column(name="vote_id")
    private Long voteID;
    @Column(name="student_number")
    private Long studentNumber;
    @Column(name="election_id")
    private Long electionID;
}
