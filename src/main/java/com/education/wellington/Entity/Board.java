package com.education.wellington.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "boards")
public class Board {
    //Examination board for  the student
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exam_board;
}
