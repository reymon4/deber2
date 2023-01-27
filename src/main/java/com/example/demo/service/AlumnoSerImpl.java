package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Alumno;
import com.example.demo.repository.IAlumnoRepo;

@Service
public class AlumnoSerImpl implements IAlumnoSer{

	@Autowired
	private IAlumnoRepo aluRepo;

	@Override
	public void insertar(Alumno alu) {
		// TODO Auto-generated method stub
		this.aluRepo.insertar(alu);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.aluRepo.buscar(id);
	}

	@Override
	public void actualizar(Alumno alu) {
		// TODO Auto-generated method stub
		this.aluRepo.actualizar(alu);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.aluRepo.eliminar(id);
	}
	
	
}
