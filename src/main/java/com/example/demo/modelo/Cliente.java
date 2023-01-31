package com.example.demo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@Column(name = "cli_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cli_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "cli_sec", sequenceName="cli_sec", allocationSize=1) 
	private Integer id;

	@Column(name = "cli_nombre")
	private String nombre;

	@Column(name = "cli_cedula")
	private String cedula;
	
	@Column(name = "cli_pago")
	private String metodoPago;
	
	@Column(name = "cli_edad")
	private Integer edad;

	@ManyToMany(mappedBy = "clientes", cascade = CascadeType.ALL) //Nombre de la colección que creamos en la clase vehiculo
	private Set<Vehiculo> vehiculos;

	
	
	//
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	
	//
	

	
}
