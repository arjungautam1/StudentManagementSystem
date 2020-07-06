package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Employee;
import com.texas.student.management.model.user.User;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Optional<Employee> getEmployeeById(Long id);

    void addEmployee(Employee user);

    void deleteEmployeeById(Long id);

    void updateEmployee(Long id, Employee user);
}
