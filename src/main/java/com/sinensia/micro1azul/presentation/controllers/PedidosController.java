package com.sinensia.micro1azul.presentation.controllers;

import java.util.ArrayList;
import java.util.Date;
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
import com.sinensia.micro1azul.integration.model.ClienteDTO;
import com.sinensia.micro1azul.integration.model.CodigoProductoDTO;
import com.sinensia.micro1azul.integration.model.DetallePedidoDTO;
import com.sinensia.micro1azul.integration.model.PedidoDTO;
import com.sinensia.micro1azul.integration.model.ProductoDTO;
import com.sinensia.micro1azul.integration.model.TipoEntregaDTO;
import com.sinensia.micro1azul.integration.model.TipoProductoDTO;
import com.sinensia.micro1azul.integration.repostory.ClienteRepository;
import com.sinensia.micro1azul.integration.repostory.PedidoRepository;
import com.sinensia.micro1azul.integration.repostory.ProductoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidoServices pedidoService;
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@PostMapping
	public ResponseEntity<Pedido> crearPedido(@RequestBody Pedido pedido){
		
		return new ResponseEntity<Pedido>(pedidoService.crear(pedido), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/prueba")
	public PedidoDTO prueba() {
		System.out.println("Entramos....");
//		Cliente c = new Cliente();
//		c.setDNI("123");
//		Pedido pedido = new Pedido();
//		pedido.setCliente(c);
//		pedido.setFecha(new Date());
//		pedido.setTipoDeEntrega(TipoEntrega.EXPRESS);
//		pedido.setCodigo(15L);
//		Producto p = new Producto();
//		p.setCodigo(new CodigoProducto(100L,200L));
//		
//		
//		DetallePedido dp = new DetallePedido();
//		dp.setProducto(p);
//		dp.setCantidad(12);
//		pedido.getDetalle().add(dp);
//		
//		Pedido createdPedido = pedidoService.crearPedido(pedido);
		
		PedidoDTO pedidoDTO = new PedidoDTO();
		ClienteDTO clienteDTO = new ClienteDTO("1234567", "Fulanito", "de tal", new Date(), true);
		clienteRepository.save(clienteDTO);
		ProductoDTO productoDTO = new ProductoDTO(new CodigoProductoDTO(1L,2L), "cosa", 2, TipoProductoDTO.FRAGIL);
		productoRepository.save(productoDTO);
		DetallePedidoDTO detallePedidoDTO = new DetallePedidoDTO();
		detallePedidoDTO.setProducto(productoDTO);
		detallePedidoDTO.setCantidad(12);
		pedidoDTO.setDetalle(new ArrayList<DetallePedidoDTO>());
		pedidoDTO.getDetalle().add(detallePedidoDTO);
		
		pedidoDTO.setCliente(clienteDTO);
		pedidoDTO.setFecha(new Date());
		pedidoDTO.setTipoDeEntrega(TipoEntregaDTO.EXPRESS);
		
//		pedidoRepository.save(pedidoDTO);
//		pedidoDTO p = new Producto();
//		p.setCodigo(new CodigoProducto(100L,200L));
		
		return pedidoRepository.save(pedidoDTO);
	}
}
