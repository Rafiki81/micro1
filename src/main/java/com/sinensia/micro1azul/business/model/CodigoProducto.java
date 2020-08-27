package com.sinensia.micro1azul.business.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CodigoProducto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long proveedor;
	private Long producto;
	
	
	public CodigoProducto(Long proveedor, Long producto) {
		this.proveedor = proveedor;
		this.producto = producto;
	}
	
}
