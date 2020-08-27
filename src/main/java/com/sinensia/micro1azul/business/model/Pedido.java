package com.sinensia.micro1azul.business.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	private Date fecha;
	private Direccion direccionEntrega;
	private TipoEntrega tipoDeEntrega;
	private Cliente cliente;
	private List<DetallePedido> detalle = new ArrayList<DetallePedido>();
	

}
