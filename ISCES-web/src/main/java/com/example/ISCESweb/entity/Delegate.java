package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="delegate")
public class Delegate {
    @Id
    @GeneratedValue
    @Column(name="delegate_id")
    private Long delegateID;
    @Column(name="student_number")
    private Long studentNumber;
    @Column(name="election_id")
    private Long electionID;
    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;
    @Column(name="is_faculty_delegate")
    @Value("False")
    private Boolean isFacultyDelegate;
}
