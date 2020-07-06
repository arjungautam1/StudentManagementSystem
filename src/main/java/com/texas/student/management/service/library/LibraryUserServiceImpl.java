package com.texas.student.management.service.library;

import com.texas.student.management.model.library.LibraryUser;
import com.texas.student.management.repository.library.LibraryUserRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryUserServiceImpl implements LibraryUserService {

    LibraryUserRepository libraryUserRepository;

    @Autowired
    public LibraryUserServiceImpl(LibraryUserRepository libraryUserRepository) {
        this.libraryUserRepository = libraryUserRepository;
    }

    @Override
    public List<LibraryUser> getAllLibraryUsers() {
        return (List<LibraryUser>)libraryUserRepository.findAll();
    }

    @Override
    public Optional<LibraryUser> getLibraryUserById(Long id) {
        return libraryUserRepository.findById(id);
    }

    @Override
    public void saveLibraryUser(LibraryUser libraryUser) {
        libraryUserRepository.save(libraryUser);
    }

    @Override
    public void deleteLibraryUser(Long id) {
        libraryUserRepository.deleteById(id);
    }
}
