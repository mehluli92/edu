package com.education.wellington.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizQuestions extends JpaRepository<com.education.wellington.Entity.QuizQuestions, Long> {
}
