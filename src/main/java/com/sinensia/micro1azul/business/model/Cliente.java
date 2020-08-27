package com.sinensia.micro1azul.business.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente extends Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private boolean tarjetaGold;


}
