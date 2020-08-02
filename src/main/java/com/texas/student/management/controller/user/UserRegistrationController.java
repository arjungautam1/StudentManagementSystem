package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.Student;
import com.texas.student.management.model.user.UserRegistration;
import com.texas.student.management.service.user.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/userRegistration")
@CrossOrigin(origins = "http://localhost:3000")
public class UserRegistrationController {

    private UserRegistrationService userRegistrationService;
    @Autowired
    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }
    @GetMapping
    @ResponseBody
    public List<UserRegistration> getAllUserRegistrationRecord()
    {
        return userRegistrationService.getAllDetails();
    }

    @PostMapping
    @ResponseBody
    public void registerUser(@RequestBody UserRegistration userRegistration){
       userRegistrationService.addUser(userRegistration);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<UserRegistration> findById(@PathVariable Long id)
    {
        return userRegistrationService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteUserRegistrationRecord(@PathVariable Long id)
    {
        userRegistrationService.deleteUserRegistrationRecode(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateUserRegistrationRecord(@PathVariable("id") Long id, @RequestBody UserRegistration userRegistration) {
        userRegistrationService.updateUserRegistrationRecord(id,userRegistration);

    }
}
