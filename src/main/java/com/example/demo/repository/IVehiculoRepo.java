package com.example.demo.repository;


import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehi);
	public Vehiculo buscar(Integer id);
	public void actualizar(Vehiculo vehi);
	public void eliminar(Integer id);

}
