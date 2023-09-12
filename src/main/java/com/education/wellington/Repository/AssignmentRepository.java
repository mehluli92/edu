package com.education.wellington.Repository;

import com.education.wellington.Entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
