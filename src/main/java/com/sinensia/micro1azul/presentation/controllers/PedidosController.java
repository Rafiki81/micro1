package com.sinensia.micro1azul.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.micro1azul.business.model.Pedido;
import com.sinensia.micro1azul.business.service.PedidoServices;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidoServices pedidoService;
	
	@PostMapping("/prueba")
	public ResponseEntity<Pedido> crearPedido(@RequestBody Pedido pedido){
		
		return new ResponseEntity<Pedido>(pedidoService.crear(pedido), HttpStatus.CREATED);
		
	}
	
	@PostMapping
	public ResponseEntity<List<Pedido>> crearTodos(@RequestBody List<Pedido> pedidos){
		
		return new ResponseEntity<List<Pedido>>(pedidoService.crearTodos(pedidos), HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Pedido>> listar(){
		
		return new ResponseEntity<List<Pedido>>(pedidoService.ListarPedidos(), HttpStatus.OK);
		
	}
	
}
