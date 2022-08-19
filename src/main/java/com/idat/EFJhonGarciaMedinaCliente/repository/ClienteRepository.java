package com.idat.EFJhonGarciaMedinaCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJhonGarciaMedinaCliente.dao.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
