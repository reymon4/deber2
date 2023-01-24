package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	//CRUD siempre por pk
	public Estudiante buscar(Integer id);
	
	public void eliminar(Integer id);
}
