package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{

	@PersistenceContext
	private EntityManager eM;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.eM.persist(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cli = this.eM.find(Cliente.class, id);
		//Con el Size el framework identifica que vamos a usar las habitaciones
		cli.getPedidos().size();
		return cli;
	}

	@Override
	public Cliente buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		return this.eM.find(Cliente.class, id);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.eM.merge(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cli = this.buscar(id);
		this.eM.remove(cli);
	}

}
