package com.texas.student.management.controller.user;

import com.texas.student.management.model.user.Address;
import com.texas.student.management.service.user.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    @ResponseBody
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @PostMapping
    @ResponseBody
    public void addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Address> findAddressById(@PathVariable int id) {
        return addressService.getAddressById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteAddressById(@PathVariable int id) {
        addressService.deleteAddressById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateAddress(@PathVariable("id") int id, @RequestBody Address address)
    {
        addressService.updateAddress(id,address);
    }

}
