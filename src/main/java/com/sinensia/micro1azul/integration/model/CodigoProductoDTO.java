package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	
}
