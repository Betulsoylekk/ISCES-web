package com.example.ISCESweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="folder")
public class Folder {
    @Id
    @GeneratedValue
    @Column(name="folder_id")
    private Long folderID;
    @Column(name="folder_directory")
    private String folderDirectory;
}
