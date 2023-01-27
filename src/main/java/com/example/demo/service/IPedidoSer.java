package com.example.demo.service;

import com.example.demo.modelo.Pedido;

public interface IPedidoSer {
	public void insertar(Pedido pedido);
	public Pedido buscar(Integer id);
	
	public void actualizar(Pedido pedido);
	public void eliminar(Integer id);

}
