package com.idat.EFJhonGarciaMedinaCliente.dao;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClientePizzaFK {
	@Column(name= "id_cliente", nullable = false, unique = true)
	private Long idCliente;
	
	@Column(name= "id_pizza", nullable = false, unique = true)
	private Long idPizza;
}
