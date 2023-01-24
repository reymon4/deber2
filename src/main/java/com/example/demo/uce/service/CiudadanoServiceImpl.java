package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadanoRepo;


@Service
public class CiudadanoServiceImpl implements ICiudadanoSer{

	
	@Autowired
	private ICiudadanoRepo ciuRepo;
	
	@Override
	public void guardar(Ciudadano ciu) {
		// TODO Auto-generated method stub
		this.ciuRepo.insertar(ciu);
	}

	@Override
	public void actualizar(Ciudadano ciu) {
		// TODO Auto-generated method stub
		this.ciuRepo.actualizar(ciu);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciuRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
	this.ciuRepo.eliminar(id);	
	}
	

}
