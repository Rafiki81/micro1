package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name = "PERSONAS")
public abstract class PersonaDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String DNI;
	private String nombre;
	private String Apellidos;
	@Temporal(TemporalType.TIMESTAMP)
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
		PersonaDAO other = (PersonaDAO) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
	
	
	
	
	
}
