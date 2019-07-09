package com.blackwater.Controllers;

import com.blackwater.Models.Client;
import com.blackwater.DTO.ClientDTO;
import com.blackwater.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Client> showClients() {
        return clientService.findAllClients();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Client> insertClient(@RequestBody ClientDTO clientDTO){
        Client client = clientService.saveClient(clientDTO.transformToClient());
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }


}
