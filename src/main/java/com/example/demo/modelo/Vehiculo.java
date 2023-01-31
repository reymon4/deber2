package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "vehi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "vehi_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "vehi_sec", sequenceName="vehi_sec", allocationSize=1) 
	private Integer id;


	@Column(name = "vehi_placa")
	private String placa;

	@Column (name = "vehi_color")
	private String color;
	
	@Column (name="vehi_modelo")
	private String modelo;
	
	@Column (name="vehi_precio")
	private BigDecimal precio; //Precio de la renta del vehículo

	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinTable(name="vehiculo_cliente", 
	joinColumns = @JoinColumn(name ="vecl_id_vehiculo"), //Ponemos el nombre de la tabla de rompimiento
	inverseJoinColumns = @JoinColumn(name= "vecl_id_cliente")) //La pk de autor
	private Set<Cliente> clientes;  //Conjunto

	
	
	///
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	
	
}
