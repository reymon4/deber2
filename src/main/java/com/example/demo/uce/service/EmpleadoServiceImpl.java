package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.repository.IEmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoSer{

	@Autowired
	private IEmpleadoRepo empleadoRepo;
	
	
	@Override
	public void insertar(Empleado empl) {
		// TODO Auto-generated method stub
		this.empleadoRepo.insertar(empl);
	}

	@Override
	public void actualizar(Empleado empl) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizar(empl);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.eliminar(id);
	}

}
