package com.sinensia.micro1azul.integration.model;

import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class DireccionDAO {
	
	private String direccion;
	private String poblacion;
	private String codigoPostal;
	private String provincia;
	private String pais;

}
