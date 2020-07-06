package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Guardian;

import java.util.List;
import java.util.Optional;

public interface GuardianService {

    List<Guardian> getAllGuardian();

    Optional<Guardian> getGuardianById(int id);

    void addGuardian(Guardian guardian);

    void deleteGuardianRecordById(int id);

    void updateGuardianRecord(int id, Guardian guardian);


}
