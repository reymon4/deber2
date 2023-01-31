package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteSerImpl implements IClienteSer{

	@Autowired
	private IClienteRepo cliRepo;
	@Override
	public void insertar(Cliente cli) {
		// TODO Auto-generated method stub
		this.cliRepo.insertar(cli);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cliRepo.buscar(id);
	}

	@Override
	public void actualizar(Cliente cli) {
		// TODO Auto-generated method stub
		this.cliRepo.actualizar(cli);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cliRepo.eliminar(id);
	}

}
