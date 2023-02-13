package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository

public class AutomovilRepoImpl implements IAutomovilRepo{

	@PersistenceContext
	private EntityManager eM;
	
	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		this.eM.persist(auto);
	}
	//TypedQuery
	@Override
	public List<Automovil> buscarPorPlacaQueryTyped(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.eM.createQuery("select e from Automovil e where e.placa = :datoPlaca",Automovil.class);
		myTypedQuery.setParameter("datoPlaca", placa);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorModeloQueryTyped(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.eM.createQuery("select e from Automovil e where e.modelo = :datoModelo",Automovil.class);
		myTypedQuery.setParameter("datoModelo", modelo);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorAnioQueryTyped(Integer anio) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.eM.createQuery("select e from Automovil e where e.anio = :datoAnio",Automovil.class);
		myTypedQuery.setParameter("datoAnio", anio);
		return myTypedQuery.getResultList();
	}
	
	//NamedQuery

	@Override
	public List<Automovil> buscarPorAnioNamedQuery(Integer anio) {
		// TODO Auto-generated method stub
		Query myQuery = this.eM.createNamedQuery("Automovil.buscarPNNQ");
		myQuery.setParameter("datoAnio", anio);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.eM.createNamedQuery("Automovil.buscarPNNQ1");
		myQuery.setParameter("datoMarca", marca);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.eM.createNamedQuery("Automovil.buscarPNNQ2");
		myQuery.setParameter("datoColor", color);
		return (List<Automovil>) myQuery.getResultList();
	}

	
	//NativeQuery
	
	@Override
	public List<Automovil> buscarPorModeloNativeQuery(String modelo) {
		// TODO Auto-generated method stub
		Query myQuery = this.eM.createNativeQuery("select * from automovil where auto_modelo=:datoModelo", Automovil.class);
		myQuery.setParameter("datoModelo", modelo);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorTipoNativeQuery(String tipo) {
		// TODO Auto-generated method stub
		Query myQuery = this.eM.createNativeQuery("select * from automovil where auto_tipo=:datoTipo", Automovil.class);
		myQuery.setParameter("datoTipo", tipo);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorClasificacionNativeQuery(String clasificacion) {
		// TODO Auto-generated method stub
		Query myQuery = this.eM.createNativeQuery("select * from automovil where auto_clasificacion=:datoClasificacion", Automovil.class);
		myQuery.setParameter("datoClasificacion", clasificacion);
		return (List<Automovil>) myQuery.getResultList();
	}

	//Named Native Query
	
	@Override
	public List<Automovil> buscarPorModeloNativeQueryTyped(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.eM.createNamedQuery("Automovil.buscarPNNQ5", Automovil.class);
		myQuery.setParameter("datoModelo", modelo);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorTipoNativeQueryTyped(String tipo) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.eM.createNamedQuery("Automovil.buscarPNNQ3", Automovil.class);
		myQuery.setParameter("datoTipo", tipo);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorClasificacionNativeQueryTyped(String clasificacion) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.eM.createNamedQuery("Automovil.buscarPNNQ4", Automovil.class);
		myQuery.setParameter("datoClasificacion", clasificacion);
		return myQuery.getResultList();
	}
	@Override
	public int eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Query query = this.eM.createQuery("DELETE FROM Automovil e where e.placa=:datoPlaca"); //"JPQL"
		query.setParameter("datoPlaca", placa);
		return query.executeUpdate();
	}
	@Override
	public int actualizarPorPlaca(String placa, String color) {
		// TODO Auto-generated method stub
		Query query = this.eM.createQuery("UPDATE Automovil e SET e.color=: datoColor WHERE e.placa=:datoPlaca");
		query.setParameter("datoColor", color);
		query.setParameter("datoPlaca", placa);
		
		return query.executeUpdate();
	}

}
