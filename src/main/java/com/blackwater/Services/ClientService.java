package com.blackwater.Services;

import com.blackwater.Models.Client;
import com.blackwater.Repositorys.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    public List<Client> findAllClients(){
        return clientRepository.findAll();
    }

}
