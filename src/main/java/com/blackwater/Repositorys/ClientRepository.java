package com.blackwater.Repositorys;

import com.blackwater.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findById(Long x);
}
