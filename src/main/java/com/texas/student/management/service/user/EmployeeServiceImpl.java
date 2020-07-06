package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Employee;
import com.texas.student.management.repository.student.EmployeeRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository userRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return IterableListConvertable.getListFromIterable( userRepository.findAll());
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void addEmployee(Employee user) {
        userRepository.save(user);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateEmployee(Long id, Employee user) {
        user.setId(id);
        userRepository.save(user);
    }
}
