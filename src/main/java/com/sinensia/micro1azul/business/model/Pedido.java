package com.sinensia.micro1azul.business.model;

import java.util.Date;
import java.util.HashMap;

import lombok.Data;

@Data
public class Pedido {
	
	private Long codigo;
	private Date fecha;
	private Direccion direccionEntrega;
	private TipoEntrega tipoDeEntrega;
	private Cliente cliente;
	private HashMap<Producto,Integer> detalle;
	

}
