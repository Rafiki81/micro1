package com.sinensia.micro1azul.business.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.micro1azul.business.model.Pedido;
import com.sinensia.micro1azul.business.service.PedidoServices;
import com.sinensia.micro1azul.integration.model.PedidoDTO;
import com.sinensia.micro1azul.integration.repostory.PedidoRepository;

@Service
public class PedidoServicesImpl implements PedidoServices {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private DozerBeanMapper mapper;

	@Transactional
	@Override
	public Pedido crear(Pedido pedido) {

		PedidoDTO pedidoDTO = mapper.map(pedido, PedidoDTO.class);
		pedidoDTO = pedidoRepository.save(pedidoDTO);
		return mapper.map(pedidoDTO, Pedido.class);

	}

	@Override
	@Transactional
	public List<Pedido> crearTodos(List<Pedido> pedidos) {
		
		List<PedidoDTO> listaPedidoDTO = pedidos.stream()
				.map(p -> mapper.map(p, PedidoDTO.class))
				.collect(Collectors.toList());
		
		List<PedidoDTO> ListaSaved = pedidoRepository.saveAll(listaPedidoDTO);
		
		return ListaSaved.stream()
				.map(p -> mapper.map(p, Pedido.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<Pedido> ListarPedidos() {
		
		List<PedidoDTO> ListaPedidos = pedidoRepository.findAll();
		
		
		return ListaPedidos.stream()
				.map(p -> mapper.map(p, Pedido.class))
				.collect(Collectors.toList());
	}

}
