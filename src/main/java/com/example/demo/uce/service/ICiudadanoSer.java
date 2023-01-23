package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoSer {

	public void guardar(Ciudadano ciu);
	
	public void actualizar(Ciudadano ciu);
	//CRUD siempre por pk
	public Ciudadano buscar(Integer id);
	
	public void eliminar(Integer id);
}
