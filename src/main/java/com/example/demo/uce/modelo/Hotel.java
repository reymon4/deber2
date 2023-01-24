package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@Column(name = "hotel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hotel_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "hotel_sec", sequenceName="hotel_sec", allocationSize=1) 
	private Integer id;
	
	
	@Column(name = "hotel_nombre")
	private String nombre;
	
	
	@Column(name = "hotel_direccion")
	private String direccion;
	
	@OneToMany(mappedBy="hotel", cascade = CascadeType.ALL)  //pongo el nombre del objeto que cree en la otra clase
	private List<Habitacion> habitaciones;
	
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
}
