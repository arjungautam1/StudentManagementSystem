package com.texas.student.management.controller.library;

import com.texas.student.management.model.library.LibraryUser;
import com.texas.student.management.service.library.LibraryUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/libraryUser")
public class LibraryUserController {

    private LibraryUserService libraryUserService;

    @Autowired
    public LibraryUserController(LibraryUserService libraryUserService) {
        this.libraryUserService = libraryUserService;
    }

    @GetMapping
    @ResponseBody
    public List<LibraryUser> getAllLibraryUsers(){
        return libraryUserService.getAllLibraryUsers();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<LibraryUser> getLibraryUserById(@PathVariable Long id){
        return libraryUserService.getLibraryUserById(id);
    }

    @PostMapping
    @ResponseBody
    public void saveLibraryUser(@RequestBody LibraryUser libraryUser){
        libraryUserService.saveLibraryUser(libraryUser);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateLibraryUser(@PathVariable Long id,@RequestBody LibraryUser libraryUser){
        libraryUserService.saveLibraryUser(libraryUser);
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public void deleteLibraryUser(@PathVariable Long id){
        libraryUserService.deleteLibraryUser(id);
    }
}

//{
//        "userId":5,
//        "user":{
//        "id":5
//        }
//        }
