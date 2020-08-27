package com.sinensia.micro1azul.business.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


@Data

public abstract class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String DNI;
	private String nombre;
	private String Apellidos;
	private Date fechaAlta;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
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
		Persona other = (Persona) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
	
	
	
	
	
}
