package com.sinensia.micro1azul.business.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Direccion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String direccion;
	private String poblacion;
	private String codigoPostal;
	private String provincia;
	private String pais;

}
