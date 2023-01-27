package com.example.demo.repository;

import com.example.demo.modelo.Pedido;

public interface IPedidoRepo {
	
	public void insertar(Pedido pedido);
	public Pedido buscar(Integer id);
	
	public void actualizar(Pedido pedido);
	public void eliminar(Integer id);
}
