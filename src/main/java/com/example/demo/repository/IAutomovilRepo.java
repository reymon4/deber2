package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Automovil;


public interface IAutomovilRepo {
	
	//Crud - Solo el insertar
	public void insertar(Automovil auto);
	
	
	////////Queries//////////
	//TypedQuery
	public List<Automovil> buscarPorPlacaQueryTyped(String placa);
	public List<Automovil> buscarPorModeloQueryTyped(String modelo);
	public List<Automovil> buscarPorAnioQueryTyped(Integer anio);

	
	//NamedQuery
	public List<Automovil> buscarPorAnioNamedQuery(Integer anio);
	public List<Automovil> buscarPorMarcaNamedQuery (String marca);
	public List<Automovil> buscarPorColorNamedQuery(String color);
	
	//NativeQuery
	
	public List<Automovil> buscarPorModeloNativeQuery(String modelo);
	public List<Automovil> buscarPorTipoNativeQuery(String tipo);
	public List<Automovil> buscarPorClasificacionNativeQuery(String clasificacion);
	
	//Named Native Query

	public List<Automovil> buscarPorModeloNativeQueryTyped(String modelo);
	public List<Automovil> buscarPorTipoNativeQueryTyped(String tipo);
	public List<Automovil> buscarPorClasificacionNativeQueryTyped(String clasificacion);
	

}
