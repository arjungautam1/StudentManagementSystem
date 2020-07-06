package com.texas.student.management.service.library;

import com.texas.student.management.model.library.Librarian;
import com.texas.student.management.repository.library.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrarianServiceImpl implements LibrarianService {

    private LibrarianRepository librarianRepository;

    @Autowired
    public LibrarianServiceImpl(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    @Override
    public List<Librarian> getAllLibrarians() {
        return (List<Librarian>)librarianRepository.findAll();
    }

    @Override
    public Optional<Librarian> getLibrarianById(Long id) {
        return librarianRepository.findById(id);
    }

    @Override
    public void saveLibrarian(Librarian librarian) {
        librarianRepository.save(librarian);
    }

    @Override
    public void deleteLibrarian(Long id) {
        librarianRepository.deleteById(id);
    }
}
