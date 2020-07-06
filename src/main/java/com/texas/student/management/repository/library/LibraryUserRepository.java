package com.texas.student.management.repository.library;

import com.texas.student.management.model.library.LibraryUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryUserRepository extends CrudRepository<LibraryUser,Long> {
}
