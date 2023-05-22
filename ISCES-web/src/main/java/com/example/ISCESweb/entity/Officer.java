package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="officer")
public class Officer {
    @Id
    @GeneratedValue
    @Column(name="officer_id")
    private Long officerID;
    @Column(name="department_id")
    private Long departmentID;
    @Column(name="email")
    private String email;
}
