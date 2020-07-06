package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.Guardian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuardianRepository extends CrudRepository<Guardian,Integer> {
}
