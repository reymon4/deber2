package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Pedido;
import com.example.demo.repository.IPedidoRepo;

@Service
public class PedidoSerImpl implements IPedidoSer{

	@Autowired
	private IPedidoRepo pedRepo;
	
	@Override
	public void insertar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedRepo.insertar(pedido);
	}

	@Override
	public Pedido buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pedRepo.buscar(id);
	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedRepo.actualizar(pedido);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pedRepo.eliminar(id);
	}

}
