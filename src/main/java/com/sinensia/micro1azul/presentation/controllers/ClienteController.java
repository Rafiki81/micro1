package com.sinensia.micro1azul.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.micro1azul.business.model.Cliente;
import com.sinensia.micro1azul.business.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listarPedidos(){
		
		return new ResponseEntity<List<Cliente>>(clienteService.listarClientes(), HttpStatus.OK);
		
	}

}
