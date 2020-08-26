package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCTOS")
public class ProductoDAO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CodigoProductoDAO codigo;
	
	private String nombre;
	private double peso;
	
	@Enumerated(EnumType.STRING)
	private TipoProductoDAO tipoProducto;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoDAO other = (ProductoDAO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	

}
