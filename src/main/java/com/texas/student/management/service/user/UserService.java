package com.texas.student.management.service.user;

import com.texas.student.management.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(Long id, User user);
}
