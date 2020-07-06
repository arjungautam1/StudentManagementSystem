package com.texas.student.management.service.library;

import com.texas.student.management.model.library.AssignedBook;
import com.texas.student.management.model.library.AssignedBookKey;

import java.util.List;
import java.util.Optional;

public interface AssignedBookService {
    List<AssignedBook> getAllAssignedBooks();

    Optional<AssignedBook> getAssignedBookById(AssignedBookKey assignedBookKey);

    void updateAssignedBook(AssignedBook assignedBook, AssignedBookKey assignedBookKey);

    void deleteAssignedBook(AssignedBookKey assignedBookKey);

    void saveAssignedBook(AssignedBook assignedBook);
}
