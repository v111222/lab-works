package ru.mefodovsky.testsecurity2dbthymeleaf.service;

import ru.mefodovsky.testsecurity2dbthymeleaf.dto.UserDto;
import ru.mefodovsky.testsecurity2dbthymeleaf.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();

}
