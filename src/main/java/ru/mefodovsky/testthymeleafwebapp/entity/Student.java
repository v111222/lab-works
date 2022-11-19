package ru.mefodovsky.testthymeleafwebapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "age")
    private int age;

    public Student() {

    }

    public Student(String name, String surname, String faculty, int age) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
    }
}
