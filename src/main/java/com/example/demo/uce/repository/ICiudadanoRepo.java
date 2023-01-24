package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Ciudadano;


public interface ICiudadanoRepo {
	public void insertar(Ciudadano ciu);
	
	public void actualizar(Ciudadano ciu);
	//CRUD siempre por pk
	public Ciudadano buscar(Integer id);
	
	public void eliminar(Integer id);

}
