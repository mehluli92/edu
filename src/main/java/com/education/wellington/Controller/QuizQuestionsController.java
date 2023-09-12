package com.education.wellington.Controller;

import com.education.wellington.Entity.QuizQuestions;
import com.education.wellington.Service.QuizQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizQuestions")
public class QuizQuestionsController {
    @Autowired
    private QuizQuestionsService quizQuestionsService;

    @PutMapping("/update")
    public QuizQuestions updateQuestion(@RequestBody QuizQuestions quizQuestions){
        return quizQuestionsService.updateQuiz(quizQuestions);
    }

    @GetMapping("/getAll")
    public List<QuizQuestions> getAllQuizQuestions(){
        return quizQuestionsService.getAllQuizQuestions();
    }

    @PostMapping("/delete/{id}")
    public String deleteQuizQuestions(@PathVariable Long id){
        return quizQuestionsService.deleteQuiz(id);
    }
}
