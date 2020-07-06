package com.texas.student.management.repository.student;

import com.texas.student.management.model.user.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {

}
