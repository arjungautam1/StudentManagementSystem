package com.texas.student.management.service.user;

import com.texas.student.management.model.user.Address;
import com.texas.student.management.repository.student.AddressRepository;
import com.texas.student.management.util.IterableListConvertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;
    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Optional<Address> getAddressById(int id) {
        return addressRepository.findById(id);
    }

    @Override
    public void addAddress(Address address) {
        addressRepository.save(address);

    }

    @Override
    public void deleteAddressById(int id) {
        addressRepository.deleteById(id);

    }

    @Override
    public void updateAddress(int id, Address address) {
        addressRepository.save(address);

    }
}
