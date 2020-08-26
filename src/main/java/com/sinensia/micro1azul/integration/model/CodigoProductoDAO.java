package com.sinensia.micro1azul.integration.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class CodigoProductoDAO {
	
	@Column(name = "CODIGO_PROVEEDOR")
	private Long proveedor;
	@Column(name = "CODIGO_PRODUCTO")
	private Long producto;
	
}
