package com.sinensia.micro1azul.business.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.micro1azul.business.model.Cliente;
import com.sinensia.micro1azul.business.service.ClienteService;
import com.sinensia.micro1azul.integration.model.ClienteDTO;
import com.sinensia.micro1azul.integration.repostory.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private DozerBeanMapper mapper;

	@Override
	public List<Cliente> listarClientes() {
		
		List<ClienteDTO> listaClientes = clienteRepository.findAll();
		
		return listaClientes.stream()
				.map(p -> mapper.map(p, Cliente.class))
				.collect(Collectors.toList());
	}

}
