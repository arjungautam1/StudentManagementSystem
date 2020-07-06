package com.texas.student.management.controller.library;

import com.texas.student.management.model.library.Book;
import com.texas.student.management.service.library.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    @ResponseBody
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Book> getBookById(@PathVariable Long id){
        return bookService.getBookById(id);

    }

    @PostMapping
    @ResponseBody
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateBook(@PathVariable Long id,@RequestBody Book book){
        bookService.saveBook(book);;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }


}

//For POST:
// {
//        "name": "xyz",
//        "createdBy":{"id":1},
//        "updatedBy":{"id":0},
//        "createdDate": 123,
//        "updatedDate": 123,
//        "booktype": "ENGLISH",
//        "quantity": 1,
//        "author": "xyz",
//        "publication":"xyz" ,
//        "isbn": "xyz"
//        }
//For PUT:
// {
//        "id":"1",
//        "name": "C++++",
//        "createdBy": {"id":0},
//        "updatedBy": {"id":0},
//        "createdDate": 123456,
//        "updatedDate": 654321,
//        "booktype": "TECHNOLOGY",
//        "quantity": 5,
//        "author": "Balaguru",
//        "publication": "KEC",
//        "isbn": "KC4"
//        }
