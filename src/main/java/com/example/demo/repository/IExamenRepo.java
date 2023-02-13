package com.example.demo.repository;


import com.example.demo.modelo.Examen;

public interface IExamenRepo {
	
	public void insertar(Examen exa);
	
	public Examen buscar(Integer id);
	
	//Eliminay y Update
		public int eliminarPorMateria(String materia);
		//Actualizar
		public int actualizarPorMateria(String materia, Double nota); //Parám

}
