package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteSerImpl implements IClienteSer {

	@Autowired
	private IClienteRepo cliRepo;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.cliRepo.insertar(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cliRepo.buscar(id);
	}

	@Override
	public Cliente buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		return this.cliRepo.buscarLigero(id);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.cliRepo.actualizar(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cliRepo.eliminar(id);
	}

	
}
