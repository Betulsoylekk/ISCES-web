package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="election")
public class Election {
    @Id
    @GeneratedValue
    @Column(name="election_id")
    private Long electionID;
    @Column(name="start_date")
    private Date startDate;
    @Column(name="start_time")
    private Time startTime;
    @Column(name="end_date")
    private Date endDate;
    @Column(name="end_time")
    private Time endTime;
    @Column(name="is_faculty")
    private Boolean isFaculty;
    @Column(name="status")
    private Boolean status;
}
