package com.education.wellington.Service;

import com.education.wellington.Entity.Quiz;
import com.education.wellington.Repository.QuizQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizQuestionsService {
    @Autowired
    private QuizQuestions quizQuestionsRepository;

    public com.education.wellington.Entity.QuizQuestions updateQuiz(com.education.wellington.Entity.QuizQuestions quizQuestions){
        return quizQuestionsRepository.save(quizQuestions);
    }

    public List<com.education.wellington.Entity.QuizQuestions> getAllQuizQuestions(){
        return quizQuestionsRepository.findAll();
    }

    public String deleteQuiz(Long id){
        com.education.wellington.Entity.QuizQuestions quizQuestions = quizQuestionsRepository.findById(id).orElse(null);
        if (quizQuestions == null){
            return "Does not exists";
        }
        String name  = quizQuestions.getQuestion();

        return name + "deleted with success";
    }
}
