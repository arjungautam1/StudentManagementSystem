package com.texas.student.management.service.user;

import com.texas.student.management.model.user.UserRegistration;
import com.texas.student.management.repository.student.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

    private UserRegistrationRepository userRegistrationRepository;
    @Autowired
    public UserRegistrationServiceImpl(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
    }


    @Override
    public List<UserRegistration> getAllDetails() {
        return (List<UserRegistration>) userRegistrationRepository.findAll();
    }

    @Override
    public Optional<UserRegistration> getUserById(Long id) {
        return userRegistrationRepository.findById(id);
    }

    @Override
    public void addUser(UserRegistration userRegistration) {
        userRegistrationRepository.save(userRegistration);

    }

    @Override
    public void deleteUserRegistrationRecode(Long id) {
        userRegistrationRepository.deleteById(id);

    }

    @Override
    public void updateUserRegistrationRecord(Long id, UserRegistration userRegistration) {
        userRegistrationRepository.save(userRegistration);

    }
}
