package com.texas.student.management.service.user;

import com.texas.student.management.model.user.User;
import com.texas.student.management.repository.student.UserRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService{

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return IterableListConvertable.getListFromIterable( userRepository.findAll());
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
         userRepository.deleteById(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userRepository.save(user);
    }
}
