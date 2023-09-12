package com.education.wellington.Repository;

import com.education.wellington.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
