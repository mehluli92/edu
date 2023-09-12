package com.education.wellington.Repository;

import com.education.wellington.Entity.AssignmentSolutions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentSolutionsRepository extends JpaRepository<AssignmentSolutions, Long> {

}
