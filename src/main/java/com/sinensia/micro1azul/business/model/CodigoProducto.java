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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodigoProducto other = (CodigoProducto) obj;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (proveedor == null) {
			if (other.proveedor != null)
				return false;
		} else if (!proveedor.equals(other.proveedor))
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((proveedor == null) ? 0 : proveedor.hashCode());
		return result;
	}
	
	
	
}
