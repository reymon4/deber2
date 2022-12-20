package com.example.demo.repository;

import com.example.demo.pago.modelo.Tarjeta;

public interface ITarjetaRepository {
	public Tarjeta  buscarPorNumero(String numero);
	//public void actualizar(CuentaBancaria cuentaBancaria);
	
	public Tarjeta buscar(Integer id);
	//
	public void actualizar(Tarjeta tarjeta);
	public void insertar(Tarjeta tarjeta);
	public void borrar(Tarjeta id);

}
