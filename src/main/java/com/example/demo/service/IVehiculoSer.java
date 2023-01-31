package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoSer {
	public void insertar(Vehiculo vehi);
	public Vehiculo buscar(Integer id);
	public void actualizar(Vehiculo vehi);
	public void eliminar(Integer id);

}
