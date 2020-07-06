package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.Guardian;
import com.texas.student.management.service.user.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/guardian")
public class GuardianController {

    private GuardianService guardianService;
    @Autowired

    public GuardianController(GuardianService guardianService) {
        this.guardianService = guardianService;
    }
    @GetMapping
    @ResponseBody
    public List<Guardian> getAllGuardianRecord()
    {
        return guardianService.getAllGuardian();
    }

    @PostMapping
    @ResponseBody
    public void addGuardianRecord(@RequestBody Guardian guardian)
    {
        guardianService.addGuardian(guardian);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Guardian> findById(@PathVariable int id)
    {
        return guardianService.getGuardianById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteGuardianRecord(@PathVariable int id)
    {
       guardianService.deleteGuardianRecordById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateGuardianRecord(@PathVariable("id") int id, @RequestBody Guardian guardian) {
       guardianService.updateGuardianRecord(id, guardian);

    }
}
