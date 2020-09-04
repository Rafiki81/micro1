package com.sinensia.micro1azul.business.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.micro1azul.business.model.Producto;
import com.sinensia.micro1azul.business.service.ProductoService;
import com.sinensia.micro1azul.integration.repostory.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public List<Producto> listarProductos() {

		return  productoRepository.findAll().stream()
				.map(p -> mapper.map(p, Producto.class))
				.collect(Collectors.toList());
	}

}
