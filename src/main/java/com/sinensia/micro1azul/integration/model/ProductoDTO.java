package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "PRODUCTOS")
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private CodigoProductoDTO codigo;

	private String nombre;
	private double peso;
	
	@Enumerated(EnumType.STRING)
	private TipoProductoDTO tipoProducto;
	
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
		ProductoDTO other = (ProductoDTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	

}
