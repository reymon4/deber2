package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoSer {
public void insertar(Empleado empl);
	
	public void actualizar(Empleado empl);
	//CRUD siempre por pk
	public Empleado buscar(Integer id);
	
	public void eliminar(Integer id);
}
