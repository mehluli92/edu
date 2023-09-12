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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String phone;
    private String password;
    private Boolean approved;
    @Column(nullable = true, unique = true)
    private String username;
    private Boolean confirmed;

    //reference column profile_id
    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    //reference to approved list of classes
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "approved_class_id", referencedColumnName = "id")
    private List<ApprovedClasses> approvedClasses;
}
