package com.education.wellington.Controller;

import com.education.wellington.Entity.Quiz;
import com.education.wellington.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/add")
    public Quiz addQuiz(@RequestBody Quiz  quiz){
        return quizService.addQuiz(quiz);
    }

    @PutMapping("/update")
    public Quiz updateQuiz(Quiz quiz){
        return quizService.updateQuiz(quiz);
    }

    @GetMapping("/get/{id}")
    public Quiz getQuiz(@PathVariable Long id){
        return quizService.getQuiz(id);
    }

    @GetMapping("/get")
    public List<Quiz> getAllQuiz(){
        return quizService.getAllQuiz();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuiz(@PathVariable Long id){
        return quizService.deleteQuiz(id);
    }
}
