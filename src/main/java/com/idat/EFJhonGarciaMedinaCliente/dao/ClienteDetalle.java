package com.idat.EFJhonGarciaMedinaCliente.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle_cliente")
public class ClienteDetalle {
	private ClientePizzaFK fk =  new ClientePizzaFK();


}


