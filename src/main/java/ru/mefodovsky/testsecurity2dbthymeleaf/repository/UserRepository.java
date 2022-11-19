package ru.mefodovsky.testsecurity2dbthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mefodovsky.testsecurity2dbthymeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
