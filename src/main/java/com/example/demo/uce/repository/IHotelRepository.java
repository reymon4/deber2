package com.example.demo.uce.repository;


import com.example.demo.uce.modelo.Hotel;

public interface IHotelRepository {

	public void insertar(Hotel hotel);
	
	public void actualizar(Hotel hotel);
	//CRUD siempre por pk
	public Hotel buscar(Integer id);
	
	public void eliminar(Integer id);
}
