package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	//CRUD siempre por pk
	public Estudiante buscar(Integer id);
	
	public void eliminar(Integer id);

}
