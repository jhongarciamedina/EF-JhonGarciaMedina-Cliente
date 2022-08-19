package com.idat.EFJhonGarciaMedinaCliente.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJhonGarciaMedinaCliente.dao.Cliente;
import com.idat.EFJhonGarciaMedinaCliente.dto.ClienteDTORequest;
import com.idat.EFJhonGarciaMedinaCliente.dto.ClienteDTOResponse;
import com.idat.EFJhonGarciaMedinaCliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	public 	ClienteRepository clienteRepository;

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c= null;
		for(Cliente cliente : clienteRepository.findAll()) {
			c= new ClienteDTOResponse();
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setNombreClienteDTO(cliente.getNombreCliente());
			c.setApellidoClienteDTO(cliente.getApellidoCliente());
			c.setDireccionDTO(cliente.getDireccion());
			c.setNroCelularDTO(cliente.getNroCelular());
			lista.add(c);
		}
		return lista;
	}

	@Override
	public void registrarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombreCliente(cliente.getNombreClienteDTO());
		c.setApellidoCliente(cliente.getApellidoClienteDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setNroCelular(cliente.getNroCelularDTO());
		clienteRepository.save(c);
		
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombreCliente(cliente.getNombreClienteDTO());
		c.setApellidoCliente(cliente.getApellidoClienteDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setNroCelular(cliente.getNroCelularDTO());
		clienteRepository.saveAndFlush(c);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public ClienteDTOResponse obtenerCliente(Integer id) {
		Cliente cliente= clienteRepository.findById(id).orElse(null);
		ClienteDTOResponse c=new	ClienteDTOResponse();
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreClienteDTO(cliente.getNombreCliente());
		c.setApellidoClienteDTO(cliente.getApellidoCliente());
		c.setDireccionDTO(cliente.getDireccion());
		c.setNroCelularDTO(cliente.getNroCelular());;
		return c;
	}

}
