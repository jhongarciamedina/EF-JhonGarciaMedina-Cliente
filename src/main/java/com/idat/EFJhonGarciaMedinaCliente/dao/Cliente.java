package com.idat.EFJhonGarciaMedinaCliente.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
	
	
	private Integer idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String nroCelular;
	private String direccion;

}
