package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
