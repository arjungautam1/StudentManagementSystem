package com.texas.student.management.service.library;

import com.texas.student.management.model.library.LibraryUser;

import java.util.List;
import java.util.Optional;

public interface LibraryUserService  {
    List<LibraryUser> getAllLibraryUsers();

    Optional<LibraryUser> getLibraryUserById(Long id);

    void saveLibraryUser(LibraryUser libraryUser);

    void deleteLibraryUser(Long id);
}
