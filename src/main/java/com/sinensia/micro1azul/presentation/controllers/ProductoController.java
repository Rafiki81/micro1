package com.sinensia.micro1azul.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.micro1azul.business.model.Producto;
import com.sinensia.micro1azul.business.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	ProductoService productoService;

	@GetMapping
	public ResponseEntity<List<Producto>> listar(){
		
		return new ResponseEntity<List<Producto>>(productoService.listarProductos(), HttpStatus.OK);
		
	}
}
