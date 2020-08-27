package com.sinensia.micro1azul.integration.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
//@Entity
@Embeddable
@Table(name = "DETALLE_PEDIDOS")
public class DetallePedidoDTO {
	
	//@Id
	//private Long codigoDetallePedido;
	
	@ManyToOne
	@JoinColumns( {
        @JoinColumn(name = "CODIGO_PROVEEDOR",  referencedColumnName = "CODIGO_PROVEEDOR"),
        @JoinColumn(name = "CODIGO_PRODUCTO",  referencedColumnName = "CODIGO_PRODUCTO")
        })
	private ProductoDTO producto;
	
	private Integer cantidad;
	

}
