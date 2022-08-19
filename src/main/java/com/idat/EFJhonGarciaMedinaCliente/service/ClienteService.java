package com.idat.EFJhonGarciaMedinaCliente.service;

import java.util.List;

import com.idat.EFJhonGarciaMedinaCliente.dto.ClienteDTORequest;
import com.idat.EFJhonGarciaMedinaCliente.dto.ClienteDTOResponse;

public interface ClienteService {
	
	public List<ClienteDTOResponse> listarClientes();
	
	public void registrarCliente(ClienteDTORequest cliente);
	
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public ClienteDTOResponse obtenerCliente(Integer id);


}
