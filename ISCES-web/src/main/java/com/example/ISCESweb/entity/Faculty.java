package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="faculty")
public class Faculty {

    @Id
    @GeneratedValue
    @Column(name="faculty_id")
    private Long facultyID;
    @Column(name="faculty_name")
    private String facultyName;
}
