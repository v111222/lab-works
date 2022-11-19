package ru.mefodovsky.testrest2dbh2.service;

import org.springframework.stereotype.Service;
import ru.mefodovsky.testrest2dbh2.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
