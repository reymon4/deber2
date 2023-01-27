package com.example.demo.repository;

import com.example.demo.modelo.Alumno;

public interface IAlumnoRepo {
	
	public void insertar(Alumno alu);
	
	public Alumno buscar(Integer id);
	
	public void actualizar(Alumno alu);
	
	public void eliminar(Integer id);

}
