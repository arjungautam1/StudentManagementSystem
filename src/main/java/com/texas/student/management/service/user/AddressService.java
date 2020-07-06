package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Address;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<Address> getAllAddress();

    Optional<Address> getAddressById(int id);

    void addAddress(Address address);

    void deleteAddressById(int id);

    void updateAddress(int id,Address address);
}
