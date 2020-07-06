package com.texas.student.management.service.library;

import com.texas.student.management.model.library.Librarian;

import java.util.List;
import java.util.Optional;

public interface LibrarianService {
    List<Librarian> getAllLibrarians();

    Optional<Librarian> getLibrarianById(Long id);

    void saveLibrarian(Librarian librarian);

    void deleteLibrarian(Long id);
}
