package com.blackwater.DTO;

import com.blackwater.Models.Address;
import com.blackwater.Models.Client;
import lombok.Getter;

import java.util.Calendar;

@Getter
public class ClientDTO {

    private String name;
    private String email;
    private String password;
    private Calendar birthDate;
    private String street;
    private String neighborhood;
    private String code;
    private String city;
    private String state;
    private String reference;
    private String complement;

    public Client transformToClient(){
        Address a = new Address(street, neighborhood, code, city, state, reference, complement);
        Client c = new Client(name,email,password,birthDate, a);
        return c;
    }
}
