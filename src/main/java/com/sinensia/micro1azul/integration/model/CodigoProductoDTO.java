package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class CodigoProductoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "CODIGO_PROVEEDOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long proveedor;
	@Column(name = "CODIGO_PRODUCTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long producto;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodigoProductoDTO other = (CodigoProductoDTO) obj;
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
