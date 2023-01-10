package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.IProfesorRepo;
@Service
public class ProfesorServiceImpl implements IProfesorService{

	@Autowired
	private IProfesorRepo profeRepo;
	
	@Override
	public void insertar(Profesor profe) {
		// TODO Auto-generated method stub
	this.profeRepo.insertar(profe);	
	}

	@Override
	public void actualizar(Profesor profe) {
		// TODO Auto-generated method stub
		this.profeRepo.actualizar(profe);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.profeRepo.eliminar(id);
	}

}
