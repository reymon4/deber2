package com.example.demo.repository;


import com.example.demo.modelo.Examen;

public interface IExamenRepo {
	
	public void insertar(Examen exa);
	
	public Examen buscar(Integer id);
	
	public void actualizar(Examen exa);
	
	public void eliminar(Integer id);

}
