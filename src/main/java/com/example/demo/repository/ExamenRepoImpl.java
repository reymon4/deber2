package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Examen;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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
	public int eliminarPorMateria(String materia) {
		// TODO Auto-generated method stub
		Query query = this.eM.createQuery("DELETE FROM Examen e where e.materia=:datoMateria"); //"JPQL"
		query.setParameter("datoMateria", materia);
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorMateria(String materia, Double nota) {
		// TODO Auto-generated method stub
		Query query = this.eM.createQuery("UPDATE Examen e SET e.nota=: datoNota WHERE e.materia=:datoMateria");
		query.setParameter("datoNota", nota);
		query.setParameter("datoMateria", materia);
		
		return query.executeUpdate();
	}



	
	
	
}
