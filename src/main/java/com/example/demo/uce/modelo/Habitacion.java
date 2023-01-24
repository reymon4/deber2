package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="habitacion")
public class Habitacion {
	
	@Id
	@Column(name="hab_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hab_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "hab_sec", sequenceName="hab_sec", allocationSize=1) 
	private Integer id;
	
	@Column(name="hab_numero")
	private String numero;

	@ManyToOne(cascade = CascadeType.ALL) //muchos a uno
	@JoinColumn(name="hab_id_hotel") //Nombre de la tabla con la que se va a relacionar
	private Hotel hotel;
	

	//Getters and Setters
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	

}
