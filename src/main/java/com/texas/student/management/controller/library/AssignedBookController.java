package com.texas.student.management.controller.library;

import com.texas.student.management.model.library.AssignedBook;
import com.texas.student.management.model.library.AssignedBookKey;
import com.texas.student.management.service.library.AssignedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/assignedBook")
public class AssignedBookController {

    private AssignedBookService assignedBookService;

    @Autowired
    public AssignedBookController(AssignedBookService assignedBookService) {
        this.assignedBookService = assignedBookService;
    }

    @GetMapping
    @ResponseBody
    public List<AssignedBook> getAllAssignedBooks(){
        return assignedBookService.getAllAssignedBooks();
    }

    @GetMapping("/{lid}/{bid}")
    @ResponseBody
    public Optional<AssignedBook> getAssignedBookById(@PathVariable("lid") Long libraryUserId, @PathVariable("bid") Long bookId){
        return assignedBookService.getAssignedBookById(new AssignedBookKey(libraryUserId,bookId));

    }

    @PostMapping
    @ResponseBody
    public void saveAssignedBook(@RequestBody AssignedBook assignedBook){
        assignedBookService.saveAssignedBook(assignedBook);
    }

    @PutMapping("/{lid}/{bid}")
    @ResponseBody
    public void updateAssignedBook(@PathVariable("lid") Long libraryUserId, @PathVariable("bid") Long bookId,@PathVariable Long id,@RequestBody AssignedBook assignedBook){
        assignedBookService.updateAssignedBook(assignedBook,new AssignedBookKey(libraryUserId,bookId));
    }

    @DeleteMapping("/{lid}/{bid}")
    @ResponseBody
    public void deleteAssignedBook(@PathVariable("lid") Long libraryUserId, @PathVariable("bid") Long bookId){
        assignedBookService.deleteAssignedBook(new AssignedBookKey(libraryUserId,bookId));
    }

}
