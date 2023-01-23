package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo{

	
	@PersistenceContext
	private EntityManager em;
	@Override
	public void insertar(Empleado empl) {
		// TODO Auto-generated method stub
		this.em.persist(empl);
	}

	@Override
	public void actualizar(Empleado empl) {
		// TODO Auto-generated method stub
		this.em.merge(empl);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empl = this.buscar(id);
		this.em.remove(empl);
	}

}
