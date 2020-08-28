package com.sinensia.micro1azul.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "PEDIDOS")
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CODIGO_PEDIDO")
	private Long codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Embedded 
	private DireccionDTO direccionEntrega;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_ENTREGA")
	private TipoEntregaDTO tipoDeEntrega;
	
	@ManyToOne(cascade = {CascadeType.REFRESH})
	@JoinColumn(name="DNI")
	private ClienteDTO cliente;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@OrderColumn(name = "CODIGO_DETALLE_PEDIDOS")
	@CollectionTable(
			name = "DETALLE_PEDIDOS", 
			joinColumns = @JoinColumn(name ="CODIGO_PEDIDO"))
	private List<DetallePedidoDTO> detalle;
	

}
