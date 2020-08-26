package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "PEDIDOS")
public class PedidoDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Embedded 
	private DireccionDAO direccionEntrega;
	
	@Enumerated(EnumType.STRING)
	private TipoEntregaDAO tipoDeEntrega;
	
	@ManyToOne
	@JoinColumn(name="DNI")
	private ClienteDAO cliente;
	
	@OneToMany
	@JoinColumn(name = "CODIGO_PEDIDO")
	@OrderColumn(name = "CODIGO_DETALLE_PEDIDOS")
	private List<DetallePedidoDAO> detalle;
	

}
