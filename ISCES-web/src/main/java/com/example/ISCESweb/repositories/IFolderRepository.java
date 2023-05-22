package com.example.ISCESweb.repositories;

import com.example.ISCESweb.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFolderRepository extends JpaRepository<Folder, Long> {
}
