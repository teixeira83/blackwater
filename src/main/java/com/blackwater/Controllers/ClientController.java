package com.blackwater.Controllers;

import com.blackwater.Models.Adress;
import com.blackwater.Models.Client;
import com.blackwater.Repositorys.AdressRepository;
import com.blackwater.Repositorys.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository cr;

    @Autowired
    private AdressRepository ar;

    @RequestMapping(method = RequestMethod.GET)
    public List<Client> showClients() {
        List<Client> clients = cr.findAll();
        return clients;
    }

//    @PostMapping("/client")
//    public ResponseEntity<Client> insertClient(@RequestBody Client client) throws URISyntaxException {
//    client = cr.create(client);
//    cr.save()
//    }

}
