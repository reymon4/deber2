package com.example.demo.repository;

import com.example.demo.pago.modelo.Transferencia;


public interface ITransferenciaRepository {
	
	//CRUD
	public Transferencia buscar(Integer id);
	//
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);

}
