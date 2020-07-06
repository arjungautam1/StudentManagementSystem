package com.texas.student.management.repository.library;

import com.texas.student.management.model.library.Librarian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends CrudRepository<Librarian,Long> {
}
