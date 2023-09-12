package com.education.wellington.Repository;

import com.education.wellington.Entity.QuizSolutions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizSolutionRepository extends JpaRepository<QuizSolutions, Long> {
}
