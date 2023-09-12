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
@Table(name = "classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    //relationship of class to books
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private List<Book> book;

    //relationship of class to notes
    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private List<Notes> notes;

    //relationship of class to quiz
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private List<Quiz> quiz;

    //relationship of assignment to class
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    private List<Assignment> assignment;
}
