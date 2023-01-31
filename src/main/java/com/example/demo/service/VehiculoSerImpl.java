package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class VehiculoSerImpl implements IVehiculoSer{

	
	@Autowired
	private IVehiculoRepo vehiRepo;
	@Override
	public void insertar(Vehiculo vehi) {
		// TODO Auto-generated method stub
		this.vehiRepo.insertar(vehi);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiRepo.buscar(id);
	}

	@Override
	public void actualizar(Vehiculo vehi) {
		// TODO Auto-generated method stub
		this.vehiRepo.actualizar(vehi);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.vehiRepo.eliminar(id);
	}

}
