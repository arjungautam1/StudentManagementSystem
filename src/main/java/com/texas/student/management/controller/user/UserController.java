package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.User;
import com.texas.student.management.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    @ResponseBody
    public List<User> getAllStudents(){
        return userService.getAllUsers();
    }

    @PostMapping
    @ResponseBody
    public void addStudent(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<User> findById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteStudentRecord(@PathVariable Long id)
    {
        userService.deleteUserById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateStudent(@PathVariable("id") Long id, @RequestBody User user) {
        userService.updateUser(id,user);

    }
}
