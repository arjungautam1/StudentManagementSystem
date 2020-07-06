package com.texas.student.management.repository.library;

import com.texas.student.management.model.library.AssignedBook;
import com.texas.student.management.model.library.AssignedBookKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignedBookRepository extends CrudRepository<AssignedBook, AssignedBookKey> {
}
