package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "DNI")
@Table(name = "CLIENTES")
public class ClienteDTO extends PersonaDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private boolean tarjetaGold;

	public ClienteDTO(String DNI, String nombre, String Apellidos, Date fechaAlta, boolean tarjetaGold) {
		super(DNI, nombre, Apellidos, fechaAlta);
		this.tarjetaGold = tarjetaGold;
	}

}
