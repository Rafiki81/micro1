package com.sinensia.micro1azul.integration.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.micro1azul.integration.model.ClienteDTO;

public interface ClienteRepository extends JpaRepository<ClienteDTO, String>{

}
