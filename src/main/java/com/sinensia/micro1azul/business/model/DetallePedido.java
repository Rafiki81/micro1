package com.sinensia.micro1azul.business.model;

import lombok.Data;

@Data
public class DetallePedido {
	
	private Long codigoDetallePedido;
	private Producto producto;
	private Integer cantidad;

}
