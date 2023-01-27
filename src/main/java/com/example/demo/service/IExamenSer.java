package com.example.demo.service;

import com.example.demo.modelo.Examen;

public interface IExamenSer {
	
	
	public void insertar(Examen exa);
	
	public Examen buscar(Integer id);
	
	public void actualizar(Examen exa);
	
	public void eliminar(Integer id);

}
