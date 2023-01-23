package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Ciudadano;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.em.persist(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciu) {
		// TODO Auto-generated method stub
		this.em.merge(ciu);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(Ciudadano.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano ciu = this.buscar(id);
		this.em.remove(ciu);
	}
	

}
