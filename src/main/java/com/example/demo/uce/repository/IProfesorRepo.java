package com.example.demo.uce.repository;


import com.example.demo.uce.modelo.Profesor;

public interface IProfesorRepo {

	public void insertar(Profesor profe);
	
	public void actualizar(Profesor profe);
	//CRUD siempre por pk
	public Profesor buscar(Integer id);
	
	public void eliminar(Integer id);
}

