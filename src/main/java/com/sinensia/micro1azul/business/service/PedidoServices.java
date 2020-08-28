package com.sinensia.micro1azul.business.service;

import java.util.List;

import com.sinensia.micro1azul.business.model.Pedido;

public interface PedidoServices {
	
	public Pedido crear(Pedido pedido);
	
	public List<Pedido> crearTodos (List<Pedido> pedidos);
	
	public List<Pedido> ListarPedidos();

}
