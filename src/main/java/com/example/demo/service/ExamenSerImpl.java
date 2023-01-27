package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Examen;
import com.example.demo.repository.IExamenRepo;

@Service
public class ExamenSerImpl implements IExamenSer {

	@Autowired
	private IExamenRepo exaRepo;
	
	@Override
	public void insertar(Examen exa) {
		// TODO Auto-generated method stub
		this.exaRepo.insertar(exa);
	}

	@Override
	public Examen buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.exaRepo.buscar(id);
	}

	@Override
	public void actualizar(Examen exa) {
		// TODO Auto-generated method stub
		this.exaRepo.actualizar(exa);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.exaRepo.eliminar(id);
	}

}
