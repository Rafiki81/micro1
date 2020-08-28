package com.sinensia.micro1azul.business.service.implementation;

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
		System.out.println(pedido);
		PedidoDTO pedidoDTO = mapper.map(pedido, PedidoDTO.class);
		
		System.out.println(pedidoDTO);
		
		pedidoDTO = pedidoRepository.save(pedidoDTO);
		System.out.println(pedidoDTO);
		return mapper.map(pedidoDTO, Pedido.class);

	}

}
