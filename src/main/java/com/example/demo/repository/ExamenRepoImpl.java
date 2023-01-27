package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Examen;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ExamenRepoImpl implements IExamenRepo {

	@PersistenceContext
	private EntityManager eM;
	
	@Override
	public void insertar(Examen exa) {
		// TODO Auto-generated method stub
		this.eM.persist(exa);
	}

	@Override
	public Examen buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.eM.find(Examen.class, id);
	}

	@Override
	public void actualizar(Examen exa) {
		// TODO Auto-generated method stub
		this.eM.merge(exa);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Examen exa = this.buscar(id);
		this.eM.remove(exa);
	}

	
	
	
}
