package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteSer {
	public void insertar(Cliente cli);
	public Cliente buscar(Integer id);
	public void actualizar(Cliente cli);
	public void eliminar(Integer id);

}
