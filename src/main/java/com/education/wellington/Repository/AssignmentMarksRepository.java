package com.education.wellington.Repository;

import com.education.wellington.Entity.AssignmentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentMarksRepository extends JpaRepository<AssignmentMarks, Long> {
}
