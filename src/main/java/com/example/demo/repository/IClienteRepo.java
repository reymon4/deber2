package com.example.demo.repository;

import com.example.demo.modelo.Cliente;


public interface IClienteRepo {

	
	public void insertar(Cliente cliente);
	public Cliente buscar(Integer id);
	
	
	public Cliente buscarLigero(Integer id);
	public void actualizar(Cliente cliente);
	public void eliminar(Integer id);
}
