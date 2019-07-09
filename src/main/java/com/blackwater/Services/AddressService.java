package com.blackwater.Services;

import com.blackwater.Models.Address;
import com.blackwater.Repositorys.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAllAddress(){
        return addressRepository.findAll();
    }
}
