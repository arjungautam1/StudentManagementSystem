package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.UserRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends CrudRepository<UserRegistration,Long> {
}
