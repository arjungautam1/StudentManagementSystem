package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.Employee;
import com.texas.student.management.service.user.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService userService;
    @Autowired
    public EmployeeController(EmployeeService userService) {
        this.userService = userService;
    }


    @GetMapping
    @ResponseBody
    public List<Employee> getAllStudents(){
        return userService.getAllEmployee();
    }

    @PostMapping
    @ResponseBody
    public void addStudent(@RequestBody Employee user){
        userService.addEmployee(user);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Employee> findById(@PathVariable Long id)
    {
        return userService.getEmployeeById(id);
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteStudentRecord(@PathVariable Long id)
    {
        userService.deleteEmployeeById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Employee user) {
        userService.updateEmployee(id,user);

    }
}
