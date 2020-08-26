package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "DNI")
@Table(name = "CLIENTES")
public class ClienteDAO extends PersonaDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private boolean tarjetaGold;


}
