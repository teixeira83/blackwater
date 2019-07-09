package com.blackwater.Controllers;

import com.blackwater.Models.Address;
import com.blackwater.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AdressController {

    private final AddressService addressService;

    @Autowired
    public AdressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Address> showAddress(){
        return addressService.findAllAddress();
    }
}
