package com.texas.student.management.service.user;

import com.texas.student.management.model.user.UserRegistration;

import java.util.List;
import java.util.Optional;

public interface UserRegistrationService {

    List<UserRegistration> getAllDetails();

    Optional<UserRegistration> getUserById(Long id);

    void addUser(UserRegistration userRegistration);

    void deleteUserRegistrationRecode(Long id);

    void updateUserRegistrationRecord(Long id,UserRegistration userRegistration);
}
