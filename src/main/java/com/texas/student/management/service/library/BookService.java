package com.texas.student.management.service.library;

import com.texas.student.management.model.library.Book;


import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    void saveBook(Book book);

    void deleteBook(Long id);


}
