package com.texas.student.management.controller.library;

import com.texas.student.management.model.library.Book;
import com.texas.student.management.model.library.Librarian;
import com.texas.student.management.service.library.BookService;
import com.texas.student.management.service.library.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/librarian")
public class LibrarianController {
    private LibrarianService librarianService;

    @Autowired
    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @GetMapping
    @ResponseBody
    public List<Librarian> getAllLibrarians(){
        return librarianService.getAllLibrarians();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Librarian> getLibrarianById(@PathVariable Long id){
        return librarianService.getLibrarianById(id);

    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void saveLibrarian(@RequestBody Librarian librarian){
        librarianService.saveLibrarian(librarian);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateLibrarian(@PathVariable Long id,@RequestBody Librarian librarian){
        librarianService.saveLibrarian(librarian);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteLibrarian(@PathVariable Long id){
        librarianService.deleteLibrarian(id);
    }

}
