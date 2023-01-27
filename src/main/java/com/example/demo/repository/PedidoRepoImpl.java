package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Pedido;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class PedidoRepoImpl implements IPedidoRepo {

	@PersistenceContext
	private EntityManager eM;
	
	@Override
	public void insertar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.eM.persist(pedido);
	}

	@Override
	public Pedido buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.eM.find(Pedido.class, id);
	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.eM.merge(pedido);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pedido ped = this.buscar(id);
		this.eM.remove(ped);
		
	}

}
