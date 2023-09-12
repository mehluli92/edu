package com.education.wellington.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "quiz_questions")
public class QuizQuestions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private String solution;
    private Long marks;
    private String picture;
    private String video;
}
