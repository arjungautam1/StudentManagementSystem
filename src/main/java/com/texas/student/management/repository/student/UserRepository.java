package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
