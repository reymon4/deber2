package com.example.demo.service;

import com.example.demo.modelo.Alumno;

public interface IAlumnoSer {
	public void insertar(Alumno alu);
	
	public Alumno buscar(Integer id);
	
	public void actualizar(Alumno alu);
	
	public void eliminar(Integer id);
}
