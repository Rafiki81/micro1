package com.sinensia.micro1azul.integration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DETALLE_PEDIDOS")
public class DetallePedidoDAO {
	
	@Id
	private Long codigoDetallePedido;
	

	@OneToOne
	@JoinColumns( {
        @JoinColumn(name = "CODIGO_PROVEEDOR",  referencedColumnName = "CODIGO_PROVEEDOR"),
        @JoinColumn(name = "CODIGO_PRODUCTO",  referencedColumnName = "CODIGO_PRODUCTO")
        })
	private ProductoDAO producto;
	
	private Integer cantidad;
	

}
