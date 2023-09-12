package com.education.wellington.Service;

import com.education.wellington.Entity.QuizSolutions;
import com.education.wellington.Repository.QuizSolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizSolutionService {
    @Autowired
    private QuizSolutionRepository quizSolutionRepository;

    public List<QuizSolutions> addSolution(List<QuizSolutions> quizSolutions){
        return quizSolutionRepository.saveAll(quizSolutions);
    }
}
