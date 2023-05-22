package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="department")
public class Department {

    @Id
    @Column(name="department_id")
    private Long departmentID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="faculty_id")
    private Faculty faculty;

    @Column(name="department_name")
    private String departmentName;


}
