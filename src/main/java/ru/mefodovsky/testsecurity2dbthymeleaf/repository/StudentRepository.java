package ru.mefodovsky.testsecurity2dbthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mefodovsky.testsecurity2dbthymeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
