package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo{

	
	@PersistenceContext
	private EntityManager eM;

	@Override
	public void insertar(Vehiculo vehi) {
		// TODO Auto-generated method stub
		this.eM.persist(vehi);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.eM.find(Vehiculo.class, id);
	}

	@Override
	public void actualizar(Vehiculo vehi) {
		// TODO Auto-generated method stub
		this.eM.merge(vehi);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehi = this.buscar(id);
		this.eM.remove(vehi);
	}
	
	
}
