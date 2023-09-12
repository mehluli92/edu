package com.education.wellington.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date datePosted;

    @Basic
    @Temporal(TemporalType.DATE)
    private  java.util.Date dueDate;

    private Long duration; //in minutes

    private Long totalMarks; //quiz marks
    private Boolean expired;

    //relationship of quiz questions to the quiz
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "quiz_question_id", referencedColumnName = "id")
    private List<QuizQuestions> quizQuestions;
}
