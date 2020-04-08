package net.proselyte.teacher.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "course")
    private String course;
    @Column(name = "grade")
    private String grade;
    @Column(name = "identity")
    private String identity;



}
