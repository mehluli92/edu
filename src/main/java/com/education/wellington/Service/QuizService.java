package com.education.wellington.Service;

import com.education.wellington.Entity.Quiz;
import com.education.wellington.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz addQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }

    public Quiz updateQuiz(Quiz quiz){
        Quiz oldQuiz =  quizRepository.findById(quiz.getId()).orElse(null);
        return quizRepository.save(quiz);
    }

    public Quiz getQuiz(Long id){
        return quizRepository.findById(id).orElse(null);
    }

    public List<Quiz> getAllQuiz(){
        return quizRepository.findAll();
    }

    public String deleteQuiz(Long id){
        Quiz quiz = quizRepository.findById(id).orElse(null);
        if(quiz == null){
            return "Does not exist";
        }
        String name  = quiz.getName();
        return name + "deleted with success";
    }

}
