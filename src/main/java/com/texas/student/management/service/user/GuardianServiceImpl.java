package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Guardian;
import com.texas.student.management.repository.student.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianServiceImpl implements GuardianService {

    private GuardianRepository guardianRepository;

    public GuardianServiceImpl(GuardianRepository guardianRepository) {
        this.guardianRepository = guardianRepository;
    }

    @Autowired



    @Override
    public List<Guardian> getAllGuardian() {
        return (List<Guardian>) guardianRepository.findAll();
    }

    @Override
    public Optional<Guardian> getGuardianById(int id) {
        return guardianRepository.findById(id);
    }

    @Override
    public void addGuardian(Guardian guardian) {
        guardianRepository.save(guardian);

    }

    @Override
    public void deleteGuardianRecordById(int id) {
        guardianRepository.deleteById(id);

    }

    @Override
    public void updateGuardianRecord(int id, Guardian guardian) {
        guardianRepository.save(guardian);
    }
}
