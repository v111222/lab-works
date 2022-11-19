package ru.mefodovsky.testthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mefodovsky.testthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
