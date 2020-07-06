package com.texas.student.management.service.library;

import com.texas.student.management.model.library.AssignedBook;
import com.texas.student.management.model.library.AssignedBookKey;
import com.texas.student.management.repository.library.AssignedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignedBookServiceImpl implements AssignedBookService{

    private AssignedBookRepository assignedBookRepository;

    @Autowired
    public AssignedBookServiceImpl(AssignedBookRepository assignedBookRepository) {
        this.assignedBookRepository = assignedBookRepository;
    }

    @Override
    public List<AssignedBook> getAllAssignedBooks() {
        return (List<AssignedBook>)assignedBookRepository.findAll();
    }

    @Override
    public Optional<AssignedBook> getAssignedBookById(AssignedBookKey assignedBookKey) {
        return assignedBookRepository.findById(assignedBookKey);
    }

    @Override
    public void updateAssignedBook(AssignedBook assignedBook,AssignedBookKey assignedBookKey) {
        assignedBookRepository.save(assignedBook);
    }

    @Override
    public void saveAssignedBook(AssignedBook assignedBook) {
        assignedBookRepository.save(assignedBook);
    }

    @Override
    public void deleteAssignedBook(AssignedBookKey assignedBookKey) {
        assignedBookRepository.deleteById(assignedBookKey);
    }
}
