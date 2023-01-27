package com.example.demo.modelo;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@Column(name = "cli_apellido")
	private String apellido;
	
	@Column(name = "cli_direccion")
	private String direccion;
	
	
	@Column(name = "cli_telefono")
	private String telf;
	
	
	@OneToMany(mappedBy="cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)  //pongo el nombre del objeto que cree en la otra clase
	private List<Pedido> pedidos;

	
	//Getters and setters

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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelf() {
		return telf;
	}


	public void setTelf(String telf) {
		this.telf = telf;
	}


	public List<Pedido> getPedidos() {
		return pedidos;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", telf=" + telf + ", pedidos=" + pedidos + "]";
	}


	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	
	
	
	
}
