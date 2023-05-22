package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="student")
public class Student {

    @Id
    @Column(name="student_number")
    private Long studentNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Department department;

    @Column(name = "email")
    private String email;
    @Column(name="first_name")
    private String firstName;
    @Column(name="second_name")
    private String middleName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="grade")
    private Float grade;
    @Column(name="term")
    private Long term;
}
