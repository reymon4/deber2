package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepoImpl implements IAlumnoRepo {

	@PersistenceContext
	private EntityManager eM;
	
	
	@Override
	public void insertar(Alumno alu) {
		// TODO Auto-generated method stub
		this.eM.persist(alu);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.eM.find(Alumno.class, id);
	}

	@Override
	public void actualizar(Alumno alu) {
		// TODO Auto-generated method stub
		this.eM.merge(alu);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Alumno alu = this.buscar(id);
		
		this.eM.remove(alu);
	}

}
