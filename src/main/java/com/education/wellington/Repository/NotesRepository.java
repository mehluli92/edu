package com.education.wellington.Repository;

import com.education.wellington.Entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {
}
