package com.example.demo.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {
	public void insertar(Cliente cli);
	public Cliente buscar(Integer id);
	public void actualizar(Cliente cli);
	public void eliminar(Integer id);
}
