package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.modelo.Profesor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProfesorRepoImpl implements IProfesorRepo {
	
	@PersistenceContext //Anotación para interactuar con la BD
	private EntityManager entityManager;
	
	@Override
	public void insertar(Profesor profe) {
		// TODO Auto-generated method stub
		this.entityManager.persist(profe);
	}

	@Override
	public void actualizar(Profesor profe) {
		// TODO Auto-generated method stub
		this.entityManager.merge(profe);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Profesor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Profesor profe= this.buscar(id);
		this.entityManager.remove(profe);
	}

}
